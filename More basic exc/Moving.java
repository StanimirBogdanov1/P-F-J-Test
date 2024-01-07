import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int houseingWeigh=Integer.parseInt(scanner.nextLine());
        int houseingLenght=Integer.parseInt(scanner.nextLine());
        int houseingTall=Integer.parseInt(scanner.nextLine());

        int housingDemensions=houseingWeigh*houseingLenght*houseingTall;



        String comand=scanner.nextLine();

        int totalCartonsDemencions=0;

        while(!comand.equals("Done")){

            int numberCartons=Integer.parseInt(comand);



            totalCartonsDemencions +=numberCartons;



            if(totalCartonsDemencions>housingDemensions){
                housingDemensions =Math.abs(housingDemensions-totalCartonsDemencions);
                System.out.printf("No more free space! You need %d Cubic meters more.",housingDemensions);

                return;
            }






            comand=scanner.nextLine();
        }



       housingDemensions =Math.abs(housingDemensions-totalCartonsDemencions);
        System.out.printf("%d Cubic meters left.",housingDemensions);




    }
}
