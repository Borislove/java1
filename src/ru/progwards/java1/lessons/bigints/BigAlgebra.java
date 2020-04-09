package ru.progwards.java1.lessons.bigints;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigAlgebra {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            /*1.1 Метод BigDecimal fastPow(BigDecimal num, int pow)
        Реализовать алгоритм быстрого возведения в степень pow числа num в BigDecimal
        описание алгоритма можно прочитать например в Википедии*/
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static BigDecimal fastPow(BigDecimal num, int pow) {
        return num.pow(pow);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*1.2 Метод BigInteger fibonacci(int n)
        Реализовать алгоритм вычисления n-го числа фибоначчи в BigInteger. Последовательность чисел Фибоначчи,
     это когда каждое последующее число равно сумме двух предыдущих чисел. Первые 2 числа последовательности 1, 1.
      Итого получаем 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 и т.д.*/
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static BigInteger fibonacci(int n) {
        if (n == 1 || n == 0) {
            return BigInteger.ONE;
        }
        int a = 1;
        int b = 0;
        //BigInteger b = BigInteger.valueOf(0);
        //BigInteger fibo = BigInteger.valueOf(0);
        int fibo = 0;
        for (int i = 0; i < n; i++) {
            fibo = a + b;
            a = b;
            b = fibo;
            //System.out.println(fibo.divide(BigInteger.TEN));
            System.out.println(fibo);
        }

        //return fibo.divide(BigInteger.TEN);
        return BigInteger.valueOf(fibo);
    }

    public static void main(String[] args) {
        fibonacci(27); //196418

        String a = "1157786721974097680";
        System.out.println(a.length());
        String b = "23416728348467685";
    }
}


