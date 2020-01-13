package Warehouse.kbv1219;

/*
* Напишите метод, вычисляющий факториал числа - n!. Сигнатура метода static long factorial(long n)

Напомним, что факториал n это произведение всех чисел от 1 до n и факториал 0 == 1
* */

//хм а вышло неплохо

// TODO: 16.12.2019  = я это делал очень давно! но надеюсь вспомню как

public class Factorial {


     static Long n ;

//final static int next = 0;

     static long factorial (long n) {

         //String c = "";
//
//         long factorial = n;
//
//         int next = 1;
//         factorial = n*next;
//         ++next;
//         System.out.println(factorial);

         long stepen = 1;
         long iteral1 = 1;
         long iteral2 = 1;

         while(true) {
             iteral1 = n * stepen * iteral2;
             ++stepen;
             iteral2 = iteral1+n;
                          ++n;

             System.out.println(n);
            continue;
         }
//++n;
  //       for( int a=1 ; 1<n ; a++) {


    //         System.out.println(n);

      //   }  //

//     while(true) {
//         n = 1;
//         n = n*n;
//          ++n ;
//         System.out.println(n);
//         break;

     }


    public static void main(String[] args) {
        factorial(10);

    }
}
