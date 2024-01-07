import java.util.Scanner;

public class VetParkigs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int numberDays=Integer.parseInt(scanner.nextLine());
        int hoursDay=Integer.parseInt(scanner.nextLine());


        double totalFee = 0.00;
        int countDays=0;

        for(int day=1;day<=numberDays;day++){
            countDays++;

            double parkingFee=0.00;
            double sumFee=0.00;
            for(int hours=1;hours<=hoursDay;hours++ ){


                if(day%2==0 && hours%2==1){
                    parkingFee=2.50;
                    sumFee =sumFee+parkingFee;

                }else if(day%2==1 && hours%2==0){

                    parkingFee=1.25;
                    sumFee =sumFee+parkingFee;
                }else{
                    parkingFee=1.00;
                    sumFee =sumFee+parkingFee;
                }

            }


            System.out.printf("Day: %d - %.2f leva\n",countDays,sumFee);
            totalFee=totalFee+sumFee;

        }
        System.out.printf("Total: %.2f leva",totalFee);

    }
}
