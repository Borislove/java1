package ru.progwards.kbv1219;


//дописать надо!!!
public class Factorial2 {

    static Long n;

    static long factorial(long n) {


//        //чужое решение
//        if (n <= 1)
//            return 1;
//        else
//            return n * factorial(n - 1);

        // TODO: 16.12.2019 выше решено


//не понимаю!
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

