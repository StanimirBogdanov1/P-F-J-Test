import java.util.Scanner;

public class Max_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        String comand =scanner.nextLine();

        int maxNumber=Integer.MIN_VALUE;

        while(!comand.equals("Stop")){
            int number=Integer.parseInt(comand);


            if(number>maxNumber){
                maxNumber=number;
            }

            comand =scanner.nextLine();
        }

        System.out.println(maxNumber);

    }
}
