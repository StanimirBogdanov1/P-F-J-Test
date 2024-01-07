import java.util.Scanner;

public class cake_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        int cakeL=Integer.parseInt(scanner.nextLine());
        int cakeW=Integer.parseInt(scanner.nextLine());

        int allCake=cakeL*cakeW;

        int totalParts=0;

        String parts=scanner.nextLine();

        while(!parts.equals("STOP")){

            int howManyparts=Integer.parseInt(parts);




            totalParts+=howManyparts;


            if(totalParts>allCake){
                break;
            }


            parts=scanner.nextLine();
        }

        if(parts.equals("STOP")){
            int funalcake=0;
            funalcake=allCake-totalParts;
            System.out.printf("%d pieces are left.",funalcake);
        }

        if(totalParts>allCake){
            allCake=Math.abs(allCake-totalParts);
            System.out.printf("No more cake left! You need %d pieces more.",allCake);
        }

    }
}
