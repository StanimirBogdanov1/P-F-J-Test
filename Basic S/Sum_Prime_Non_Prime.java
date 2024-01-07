import java.util.Scanner;

public class Sum_Prime_Non_Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);



        String input=scanner.nextLine();

        int sum=0;
        int sum2=0;

        while(!input.equals("stop")){
            int number =Integer.parseInt(input);


            if(number<0){
                System.out.println("Number is negative.");
            }else {
               boolean isPrime=true;

                for (int numberTest = 2; numberTest < number; numberTest++) {

                    if (number % numberTest == 0) {
                        isPrime=false;
                        break;
                    }

                }
                if(isPrime){
                    sum+=number;
                }else{
                    sum2+=number;

                }
            }



            input=scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d\n",sum);
        System.out.printf("Sum of all non prime numbers is: %d",sum2);

    }
}
