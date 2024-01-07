import java.util.Scanner;

public class cinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filmName=scanner.nextLine();


        int totaltickets=0;
        int studentTickets=0;
        int standartTukets=0;
        int kidsTickets=0;

        while(!filmName.equals("Finish")){
            int freeSeats=Integer.parseInt(scanner.nextLine());





            int coutSeats=0;

            for(int seats=0;seats<freeSeats;seats++){
                String ticket =scanner.nextLine();


                if(ticket.equals("End")){

                    break;
                }
                coutSeats++;
                totaltickets++;


                switch (ticket){
                    case "student" :
                        studentTickets++;

                        break;
                    case "standard" :
                        standartTukets++;

                        break;
                    case "kid" :
                        kidsTickets++;

                        break;
                }



            }

            double parcentTypeMovie =coutSeats*100*1.00/freeSeats;
            System.out.printf("%s - %.2f%% full.\n",filmName,parcentTypeMovie);


            filmName=scanner.nextLine();
        }
        System.out.printf("Total tickets: %d\n",totaltickets);
        double parcentStudentsTicket=studentTickets*100*1.00/totaltickets;
        System.out.printf("%.2f%% student tickets.\n",parcentStudentsTicket);
        double parcentStandardTickets=standartTukets*100*1.00/totaltickets;
        System.out.printf("%.2f%% standard tickets.\n",parcentStandardTickets);
        double parcentKidsTickets=kidsTickets*100*1.00/totaltickets;
        System.out.printf("%.2f%% kids tickets.",parcentKidsTickets);



    }
}
