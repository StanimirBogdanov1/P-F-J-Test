import java.util.Scanner;

public class Equal_Sums_Even_Odd_Position_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


    int input=Integer.parseInt(scanner.nextLine());
    int input2=Integer.parseInt(scanner.nextLine());

    for(int number=input;number<=input2;number++){

        String Number =Integer.toString(number);

        int even=0;
        int odd=0;

        for(int position=0;position<Number.length();position++){

            int currentNumber=Integer.parseInt(Number.charAt(position)+"");

            if(position%2==0){
                even+=currentNumber;
            }else{
                odd +=currentNumber;
            }

        }
        if(even==odd){
            System.out.print(number+ " ");
        }

    }

    }
}
