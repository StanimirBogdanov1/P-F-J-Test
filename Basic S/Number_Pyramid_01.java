import java.util.Scanner;

public class Number_Pyramid_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        int number=Integer.parseInt(scanner.nextLine());
        int count=1;

        for(int row=1;row<=number;row++){
            for(int col=1;col<=row;col++){

                System.out.print(count + " ");

                if(row==number || col==number){
                    return;
                }


            }
            System.out.println();
        }




    }
}
