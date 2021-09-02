package ru.progwards.java1_1.java1.lessons.compare_if_cycles;

//Задача 3. Класс CyclesGoldenFibo

// v2 09.07.2020
public class CyclesGoldenFibo {

    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*3.1 Реализовать функцию
    public static boolean containsDigit(int number, int digit), которая будет возвращать true,
    если число number содержит цифру digit.*/
    public static boolean containsDigit(int number, int digit) {

        if (number == 0 && digit == 0) {
            return true;
        }
        // TODO: 09.07.2020 интересно как выдал0 1 число, магия
        for (; number > 0; ) {
            // System.out.println(number);
            if ((number % 10) == digit) {   //с каждой итерацией берем остаток(последний элемент)
                // System.out.println("number contains digit " + digit);
                return true;
            } else {
                number /= 10;  //с каждой итерацией сокращаем number
            }
        }
        return false;
    }

    // TODO: 09.07.2020 Решение через контейнер 
    //return String.valueOf(number).contains(String.valueOf(digit));

    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*3.2 Реализовать, используя любой цикл, функцию
    public static int fiboNumber(int n), которая будет возвращать n-ое число Фибоначчи (нумерация начинается с 1,
    то есть при n = 3 должно вернуться число Фибоначчи 2, а при n = 10 число 55).*/
    public static int fiboNumber(int n) {

        int[] arr = new int[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
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

    // TODO: 09.07.2020 упростить...
    public static boolean isGoldenTriangle(int a, int b, int c) {

        double a1 = 1.61703;
        double a2 = 1.61903;

        int side_symmetric = 0;   //боковая сторона треугольника
        int side_base = 0;  //сторона основание


        //вызываем функцию на проверку равнобедренный ли треугольник и проверям условия
        if (TriangleInfo.isIsoscelesTriangle(a, b, c)) {
            // System.out.println("треугольник равнобедренный");
            //System.out.println("a = " + a + " b = " + b + " c = " + c);

            //ищем одинаковые стороны и присваиваем к значению side_symetric

            if (a == b) {
                side_symmetric = a;
                side_base = c;
                //  System.out.println("side symmetric: " + a + " side base: " + c);
            }

            if (a == c) {
                side_symmetric = a;
                side_base = b;
                // System.out.println("side symmetric: " + a + " side base: " + b);
            }

            if (c == b) {
                side_symmetric = c;
                side_base = a;
                //  System.out.println("side symmetric: " + c + " side base:" + a);
            }


            double difference = (double) side_symmetric / (double) side_base;  //отношение ребра к основанию  //на 0

            //проверка золотой ли треугольник?
            boolean gold = difference > a1 && difference < a2;

            if (gold) {
             //   System.out.println("a = " + a + " b =" + b + " c = " + c);
            }

//        boolean gold = (double) a / (double) b > a1;

            return gold;
        }
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
        for (int i = 1; i <= 15; i++) {
            //System.out.println(i+ " = " +fiboNumber(i));
            System.out.println(fiboNumber(i));
        }

        System.out.println(isGoldenTriangle(1, 2, 2));
        System.out.println(isGoldenTriangle(2, 2, 4));

        System.out.println(isGoldenTriangle(2, 8, 8));
        System.out.println(isGoldenTriangle(8, 2, 8));
        System.out.println(isGoldenTriangle(8, 8, 2));


        //золотые
        System.out.println(isGoldenTriangle(34, 55, 55));

        System.out.println(isGoldenTriangle(89, 55, 89));


        for (int i = 1; i < 101; i++) {   //сторона не может быть 0
            for (int j = 1; j < 101; j++) {
                //if (TriangleInfo.isTriangle(i, j, i) && TriangleInfo.isIsoscelesTriangle(i, j, i) && isGoldenTriangle(i, j, i)) {
                if (isGoldenTriangle(i, j, i)) {
                    System.out.println(i + " " + j + " " + i);
                }
            }
        }
    }
}
