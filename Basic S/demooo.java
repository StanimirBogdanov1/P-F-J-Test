import java.util.Scanner;

public class demooo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        char symbol=scanner.nextLine().charAt(0);
        char symbol2=scanner.nextLine().charAt(0);

        String proba = symbol+ " ";
        String proba2 = symbol2+ " ";

        int number1 =Integer.parseInt(proba);
        int number2 =Integer.parseInt(proba2);

        int number=number1+number2;

        System.out.println(number);
    }
}
