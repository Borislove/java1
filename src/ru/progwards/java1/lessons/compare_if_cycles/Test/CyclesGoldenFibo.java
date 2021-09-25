package ru.progwards.java1.lessons.compare_if_cycles.Test;

//Задача 3. Класс CyclesGoldenFibo


public class CyclesGoldenFibo {

    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*3.1 Реализовать функцию
    public static boolean containsDigit(int number, int digit), которая будет возвращать true,
    если число number содержит цифру digit.*/
    public static boolean containsDigit(int number, int digit) {
        //return String.valueOf(number).contains(String.valueOf(digit));
        return parse(number).contains(parse(digit));
    }

    private static String parse(int value) {
        return String.valueOf(value);
    }

    // TODO: 25.09.2021 wtf?
    //цифра ли это
    public static boolean isDigit(int digit) {
        System.out.print("Digit = " + digit + " ");
        return digit >= 0 && digit <= 9 || isPositive(digit);
    }

    private static boolean isPositive(int digit) {
        return isOne(digit) >= 0 && isOne(digit) <= 9;
    }

    private static int isOne(int digit) {
        return digit * -1;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*3.2 Реализовать, используя любой цикл, функцию
    public static int fiboNumber(int n), которая будет возвращать n-ое число Фибоначчи (нумерация начинается с 1,
    то есть при n = 3 должно вернуться число Фибоначчи 2, а при n = 10 число 55).*/
    public static int fiboNumber(int n) {

        return 0;
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

        return false;
    }


    public static void main(String[] args) {

    /*  Далее в функции public static void main(String[] args) вывести на консоль, используя цикл, 15 первых
        чисел Фибоначчи. После этого, используя вложенные циклы, определить: есть ли среди треугольников,
        длины сторон которых являются натуральными числами не превышающими 100, Золотые треугольники.
        И если есть, вывести на консоль длины основания и рёбер этих треугольников.
        Если всё получилось, посмотрите на консоль и сделайте вывод: есть ли связь между числами Фибоначчи
        и Золотыми треугольниками.*/

        /*System.out.println(containsDigit(896750123, 8));
        System.out.println(containsDigit(496750123, 4));
        System.out.println(containsDigit(496750123, 8));*/

        // System.out.println(fiboNumber(10));  //55 need!

        //15 первых чисел фибонначи
        //Числа Фибоначчи это ряд чисел 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144


        //проверка на цифру
       /* System.out.println(isDigit(9));
        System.out.println(isDigit(1));
        System.out.println(isDigit(10));
        System.out.println(isDigit(0));
        System.out.println(isDigit(-5));
        System.out.println(isDigit(-999));


        System.out.println(containsDigit(999,5));
        System.out.println(containsDigit(999,9));
        System.out.println(containsDigit(921312599,9));
        System.out.println(containsDigit(921312599,1));
        System.out.println(containsDigit(921312599,2));
        System.out.println(containsDigit(921312599,3));
        System.out.println(containsDigit(921312599,4));
        System.out.println(containsDigit(921312599,5));
        System.out.println(containsDigit(921312599,6));*/
    }
}




