import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int number1 =547;
        int number2 =245;

                  // ИНТ става на стринг        тук има 3 варианта избираме 1..
        String number1ToText= Integer.toString(number1);           //  вариант 1
        String number2ToText =Integer.toString(number2);

        //String number1ToText =number1 + "";                      //   вариант 2
        //String number2ToText =number2 + "";

       // String number1ToText =String.valueOf(number1);           //   вариант 3
       // String number2ToText =String.valueOf(number2);


             //ТУК от Стринг става на Чар
               char Symbol1 = number1ToText.charAt(0);
               char Symbol2 = number2ToText.charAt(0);


               //ТУК ИНТ = чар+чар   понеже няма цикъл за резултат се взима само 5 от 500 и 2 от 200
               // като 5 = 53 от АСКИ ТАБЛИЦАТА  а 2 = 50  и отговора затова е 103
              // за да обходим всяко цисло на 500 или 200 ползваме цикъл и .lengt() дължина   ПРИМЕР ПОД ТОВА

          //нямаме цикъл затова работим с първите числа на 2те променливи


        //тук от Чар става Стринг

        String fromChartoString1 =Symbol1+ "";
        String fromChartoString2 =Symbol2 + "";


        // ТУК  от Стринг вече към Инт
        int fromStringToInt1 =Integer.parseInt(fromChartoString1);
        int fromStringToInt2 =Integer.parseInt(fromChartoString2);


        //Тук вече превърнатите в инт можем да ти съберем 5+2=7
        int proba1 =fromStringToInt1+fromStringToInt2;
        System.out.println(proba1);

    }
}