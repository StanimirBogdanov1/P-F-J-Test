import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);



        String stop= scanner.nextLine();

        int goalAday=10000;
        int totalSteps=0;



        while(!stop.equals("Going home")){

            int steps=Integer.parseInt(stop);

            totalSteps+=steps;

            if(totalSteps>=goalAday){
                totalSteps=totalSteps-goalAday;
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!",totalSteps);
                return;
            }




            stop= scanner.nextLine();
        }



        int neededOrMore=0;


            int steps=Integer.parseInt(scanner.nextLine());
            totalSteps+=steps;
            neededOrMore =Math.abs(totalSteps-goalAday);

            if(totalSteps>=goalAday) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", neededOrMore);
            }else{
                System.out.printf("%d more steps to reach goal.", neededOrMore);
            }




    }
}
