import java.util.Scanner;

public class Exam_Preparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int poorgrade=Integer.parseInt(scanner.nextLine());

        String nameTask=scanner.nextLine();


        int poorGradesss=0;
        int countTask=0;
        double sumTask=0;
        String funalTask="";


        while(!nameTask.equals("Enough")){
            funalTask=nameTask;


            int gradeorStop=Integer.parseInt(scanner.nextLine());


            countTask++;
            sumTask=sumTask+gradeorStop;

            if(gradeorStop<=4.00){
                poorGradesss++;
                if(poorGradesss>=poorgrade){
                    System.out.printf("You need a break, %d poor grades.",poorGradesss);
                    return;
                }
            }





            nameTask=scanner.nextLine();


        }








        double avrGrade=0.00;

        avrGrade=(avrGrade+sumTask)/countTask;

        System.out.printf("Average score: %.2f\n",avrGrade);
        System.out.printf("Number of problems: %d\n",countTask);
        System.out.printf("Last problem: %s",funalTask);


    }
}
