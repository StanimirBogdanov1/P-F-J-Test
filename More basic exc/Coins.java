import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        double refund=Double.parseDouble(scanner.nextLine());

        int count2=0;
        int count1=0;
        int count050=0;
        int count020=0;
        int count010=0;
        int count005=0;
        int count002=0;
        int count001=0;




        refund=Math.round(refund*100);

        while(refund>0){




            if(refund>=200){
                refund=refund-200;
                count2++;
            }else if(refund>=100){
                refund=refund-100;
                count1++;
            }else if(refund>=50){
                refund=refund-50;
                count050++;
            }else if(refund>=20){
                refund=refund-20;
                count020++;
            }else if(refund>=10){
                refund=refund-10;
                count010++;
            }else if(refund>=5){
                refund=refund-5;
                count005++;
            }else if(refund>=2){
                refund=refund-2;
                count002++;
            }else if(refund>=1){
                refund=refund-1;
                count001++;
            }




        }

        int totalCount=count2+count1+count050+count020+count010+count005+count002+count001;

        System.out.println(totalCount);
    }
}
