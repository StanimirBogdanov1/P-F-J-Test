import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String name=scanner.nextLine();

        double sumgrades=0;
        int year=1;
        int poorGrates=0;

        while(year<=12){





            double grade=Double.parseDouble(scanner.nextLine());



            if(grade<4.00){
                poorGrates++;
                continue;
            }
            if(poorGrates>1){
                System.out.printf("%s has been excluded at %d grade",name,year);
                return;
            }

            sumgrades=sumgrades+grade;




            year++;
        }

        double avgGrade=sumgrades/12;
        System.out.printf("%s graduated. Average grade: %.2f",name,avgGrade);

    }
}
