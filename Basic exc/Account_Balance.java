import java.util.Scanner;

public class Account_Balance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String text=scanner.nextLine();
        double sum=0.00;

        while(!text.equals("NoMoreMoney")){

            double money=Double.parseDouble(text);


            if(money<0){
                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f\n",money);

            sum=sum+money;



            text=scanner.nextLine();
        }

        System.out.printf("Total: %.2f",sum);

    }
}
