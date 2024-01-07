import java.util.Scanner;

public class Old_Books_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String favorBook=scanner.nextLine();

        String surchingBook =scanner.nextLine();

        int count=0;
        while(!surchingBook.equals(favorBook)){



            if(surchingBook.equals("No More Books")){

                break;
            }
            count++;


            surchingBook =scanner.nextLine();
        }


        if(surchingBook.equals(favorBook)) {
            System.out.printf("You checked %d books and found it.", count);
        }else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",count);
        }
    }
}
