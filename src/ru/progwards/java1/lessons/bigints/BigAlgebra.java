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
        return fibonacci(n - 2).add(fibonacci(n - 1));
    }

    public static void main(String[] args) {
        for (int i = 0; i < 39; i++) {
            System.out.println(fibonacci(i));
        }
        String a = "102334155";
        System.out.println(a.length());
        String b = "63245986";
        System.out.println(b.length());
    }
}


