import java.util.Scanner;

public class Train_The_Trainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int juryNumber=Integer.parseInt(scanner.nextLine());
        String namePresentation =scanner.nextLine();



        double totalAverageALL=0.00;
        int count=0;

        while(!namePresentation.equals("Finish")){


            double averagePresentationGrade=0.00;

            for(int assesments=0;assesments<juryNumber;assesments++){
                double taks=Double.parseDouble(scanner.nextLine());
                count++;
                averagePresentationGrade=(averagePresentationGrade+taks);



            }

            totalAverageALL=totalAverageALL+averagePresentationGrade;
            double finalAveragePresentationGrade=averagePresentationGrade/juryNumber;
            System.out.println();
            System.out.printf("%s - %.2f.",namePresentation,finalAveragePresentationGrade);

            namePresentation =scanner.nextLine();
        }



        totalAverageALL=totalAverageALL/count;

        System.out.printf("Student's final assessment is %.2f.",totalAverageALL);

    }
}
