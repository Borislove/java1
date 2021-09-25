package ru.progwards.java1.lessons.compare_if_cycles;

//Задача 3. Класс CyclesGoldenFibo

import java.time.LocalTime;

public class CyclesGoldenFibo {

    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*3.1 Реализовать функцию
    public static boolean containsDigit(int number, int digit), которая будет возвращать true,
    если число number содержит цифру digit.*/
    public static boolean containsDigit(int number, int digit) {
        //   print(number, digit);
        return parse(number).contains(parse(digit));
    }

    private static String parse(int value) {
        return String.valueOf(value);
    }

    private static void print(int number, int digit) {
        System.out.print("number = " + number + " digit = " + digit + " ");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*3.2 Реализовать, используя любой цикл, функцию
    public static int fiboNumber(int n), которая будет возвращать n-ое число Фибоначчи (нумерация начинается с 1,
    то есть при n = 3 должно вернуться число Фибоначчи 2, а при n = 10 число 55).*/
    public static int fiboNumber(int n) {

        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        int first = 0;
        int second = 1;
        int result = n;

        for (int i = 1; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*Теперь проведём исследование. Есть ли у Золотого треугольника связь с числами Фибоначчи. Золотой треугольник
    это равнобедренный треугольник у которого ребро относится к основанию как 1.61803 (приблизительно), то есть по
    правилу Золотого сечения. Числа Фибоначчи это ряд чисел 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
    в котором первые два элемента равны 1, а каждый следующий равен сумме двух предыдущих.
    Для проведения этого исследования нам придётся решить две задачи.*/
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*
    3.3 Реализовать функцию
    public static boolean isGoldenTriangle(int a, int b, int c), которая будет возвращать true,
    если треугольник со сторонами a, b, c является Золотым. Определим критерии. Он должен быть равнобедренным и
     отношение ребра к основанию должно лежать между значениями 1.61703 и 1.61903.*/

    /*Равнобедренный треугольник — это треугольник,
    в котором две стороны равны между собой по длине.
    Боковыми называются равные стороны, а последняя неравная им сторона — основанием
    */

    public static boolean isGoldenTriangle(int a, int b, int c) {

        double d1 = 1.61703;
        double d2 = 1.61903;

        //System.out.println(calc(a, b, c));
        return TriangleInfo.isIsoscelesTriangle(a, b, c) && calc(a, b, c) >= d1 && calc(a, b, c) <= d2;
    }

    //поиск основания
    private static int searchBase(int a, int b, int c) {
        if (a == b)
            return c;

        else if (a == c)
            return b;

        return a;
    }

    //проверка сторон
    private static int searchSide(int a, int b, int c) {
       // System.out.print("a = " + a + " b = " + b + " c = " + c + " ");
        return a == b ? a : c;
    }

    private static double calc(int a, int b, int c) {
        return (double) (searchSide(a, b, c) / (double) searchBase(a, b, c));
    }

    public static void main(String[] args) {

    /*  Далее в функции public static void main(String[] args) вывести на консоль, используя цикл, 15 первых
        чисел Фибоначчи. После этого, используя вложенные циклы, определить: есть ли среди треугольников,
        длины сторон которых являются натуральными числами не превышающими 100, Золотые треугольники.
        И если есть, вывести на консоль длины основания и рёбер этих треугольников.
        Если всё получилось, посмотрите на консоль и сделайте вывод: есть ли связь между числами Фибоначчи
        и Золотыми треугольниками.*/

        for (int i = 0; i < 16; i++) {
            System.out.print(fiboNumber(i) + " ");
        }
        System.out.println();

        for (int i = 1; i < 101; i++) {
            for (int j = 1; j < 101; j++) {
                if (isGoldenTriangle(i, j, i)) {
                    System.out.println(i + " " + j + " " + i);
                }
            }
        }

        /*System.out.println(containsDigit(896750123, 8));
        System.out.println(containsDigit(496750123, 4));
        System.out.println(containsDigit(496750123, 8));*/

        // System.out.println(fiboNumber(10));  //55 need!

        //15 первых чисел фибонначи
        //Числа Фибоначчи это ряд чисел 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144


        /*System.out.println(containsDigit(999, 5));
        System.out.println(containsDigit(999, 9));
        System.out.println(containsDigit(921312599, 9));
        System.out.println(containsDigit(921312599, 1));
        System.out.println(containsDigit(921312599, 2));
        System.out.println(containsDigit(921312599, 3));
        System.out.println(containsDigit(921312599, 4));
        System.out.println(containsDigit(921312599, 5));
        System.out.println(containsDigit(921312599, 6));
        System.out.println(containsDigit(921312549, 4));*/


        //////////////////////test fibo///////////////////////////////////
        LocalTime lc1 = LocalTime.now();
        //System.out.println("fibo = "+fiboNumber(10)); //PT0.0070047S
        // System.out.println("fibo = " + fiboNumber(20)); //PT0.0070067S
        LocalTime lc2 = LocalTime.now();

        //  Duration duration = Duration.between(lc1, lc2);
        // System.out.println(duration);

       /* System.out.println(fiboNumber(3));
        System.out.println(fiboNumber(10));*/


        ////////////////////////test triangle//////////////////////////////////
        /*System.out.println(searchBase(2, 2, 3));
        System.out.println(searchBase(2, 3, 2));
        System.out.println(searchBase(3, 2, 2));*/


        //  System.out.println(isGoldenTriangle(34, 55, 55));

        //  System.out.println(searchBase(34, 55, 55));


        //System.out.println((55d / 34d)); //1.6176470588235294

        //System.out.println(calc(55, 34, 55)); //1.6176470588235294

        /*System.out.println(isGoldenTriangle(55,34,55));
        System.out.println(isGoldenTriangle(34,55,55));
        System.out.println(isGoldenTriangle(55,55,34));
        System.out.println(isGoldenTriangle(55,55,24));*/

        System.out.println(isGoldenTriangle(89, 55, 89));
    }
}




