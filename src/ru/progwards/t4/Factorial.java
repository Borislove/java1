package ru.progwards.t4;


//дописать надо!!!
// факториал n это произведение всех чисел от 1 до n и факториал 0 == 1
public class Factorial {

    static Long n;

    static long factorial(long n) {


        // TODO: 16.12.2019  решение
//        //чужое решение
//        if (n <= 1)
//            return 1;
//        else
//            return n * factorial(n - 1);

        //чужое решение
        if (n == 0)
            return 0;
        if (n > 1) {
          n = n * factorial(--n);
       }
        System.out.println(n);
           return n;


    }

        public static void main (String[] args){

            //factorial(10);
            //System.out.println(factorial(n));
            factorial(7);

        }
    }

