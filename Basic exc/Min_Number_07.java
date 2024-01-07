import java.util.Scanner;

public class Min_Number_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stop=scanner.nextLine();

        int minNumber=Integer.MAX_VALUE;

        while(!stop.equals("Stop")){
            int number=Integer.parseInt(stop);

            if(number<minNumber){
                minNumber=number;
            }

            stop=scanner.nextLine();
        }

        System.out.println(minNumber);

    }
}
