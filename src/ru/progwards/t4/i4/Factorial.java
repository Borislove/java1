package ru.progwards.t4.i4;

/*Напишите метод, вычисляющий факториал числа - n!. Сигнатура метода static long factorial(long n)
Напомним, что факториал n это произведение всех чисел от 1 до n и факториал 0 == 1*/

public class Factorial {

    //static Long n;

    //--------------------------------------//чужое решение
    static long factorial(long n) {
        if (n == 0)
            return 0;
        if (n > 1) {
            n = n * factorial(--n);
        }
        //  System.out.println(n);
        return n;
    }

    //--------------------------------------//чужое решение
    static long factorial1(long n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }


    public static void main(String[] args) {

        //factorial(5); //120
        //  factorial(6);
        //System.out.println(factorial(n));
        // factorial(7);


    }
}

