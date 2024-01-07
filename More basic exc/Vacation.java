import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double needMoney=Double.parseDouble(scanner.nextLine());
        double moneyOnhand=Double.parseDouble(scanner.nextLine());



        double total=0;
        total=total+moneyOnhand;
        int count=0;





        while(needMoney>total){
            String SpendorNot=scanner.nextLine();
            double moneySpendorNot=Double.parseDouble(scanner.nextLine());


            count++;

            switch(SpendorNot){
                case "spend":
                    total=total-moneySpendorNot;
                    if(total<=0){
                        total=0;
                    }

                    break;
                case "save":
                    total=total+moneySpendorNot;
                    break;
            }





//            SpendorNot=scanner.nextLine();
//            moneySpendorNot=Double.parseDouble(scanner.nextLine());
        }


        System.out.printf("You saved the money for %d days.,",count);
    }
}
