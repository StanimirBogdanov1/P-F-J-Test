import java.util.Scanner;

public class Special_Numbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number=Integer.parseInt(scanner.nextLine());


        for(int i=1111;i<=9999;i++) {
            String intToString = Integer.toString(i);

            boolean yesOrNo = true;

            for (int symbol = 0; symbol < intToString.length(); symbol++) {
                char symb = intToString.charAt(symbol);
                String charToString = symb + "";
                int stringToInt = Integer.parseInt(charToString);

                if (stringToInt == 0) {
                    yesOrNo = false;
                    break;
                }

                if (number % stringToInt != 0) {

                    yesOrNo = false;
                    break;

                }


            }
        if(yesOrNo){
            System.out.print(i + " ");
        }


        }




    }
}
