package ru.progwards.java1.lessons.compare_if_cycles.Test;

/*Задания будут на тему треугольников, Золотого сечения и чисел Фибоначчи.
Задача 1. Класс TriangleSimpleInfo_5

Рекомендации к тестированию: проверьте isEquilateralTriangle с параметрами
2, 2, 3
2, 3, 2
3, 2, 2
2, 2, 2
3, 3, 3
Обязательно протестируйте остальные методы, вызвав из из функции main*/
public class TriangleSimpleInfo_4 {

    //-------------------------------------------------------------------------------------------------------
    /*1.1 Реализовать функцию
    public static int maxSide(int a, int b, int c),
    которая получает параметрами длины сторон треугольника, а вернуть должна наибольшую длину стороны.*/
    public static int maxSide(int a, int b, int c) {
        print(a, b, c);
        System.out.print("Максимальная сторона: ");
        return isPositiveSide(a, b, c) ? max(a, max(b, c)) : 0;
    }

    //-------------------------------------------------------------------------------------------------------
    /*1.2 Реализовать функцию
    public static int minSide(int a, int b, int c),
    которая получает параметрами длины сторон треугольника, а вернуть должна наименьшую длину стороны.*/
    public static int minSide(int a, int b, int c) {
        print(a, b, c);
        System.out.print("Минимальная сторона: ");
        return isPositiveSide(a, b, c) ? min(a, min(b, c)) : 0;
    }
    //-------------------------------------------------------------------------------------------------------

    /*1.3 Реализовать функцию
    public static boolean isEquilateralTriangle(int a, int b, int c),
    которая получает параметрами длины сторон треугольника, а вернуть должна true, если треугольник равносторонний
    и false в противном случае.*/

    public static boolean isEquilateralTriangle(int a, int b, int c) {
        return a == b && b == c;
    }
    //-------------------------------------------------------------------------------------------------------

    //проверка на положительные стороны
    //-------------------------------------------------------------------------------------------------------
    public static boolean isPositiveSide(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0;
    }

    //максимальное значение
    //-------------------------------------------------------------------------------------------------------
    private static int max(int a, int b) {
        return (a >= b) ? a : b;
    }

    //минимальное значение
    //-------------------------------------------------------------------------------------------------------
    private static int min(int a, int b) {
        return (a <= b) ? a : b;
    }
    //-------------------------------------------------------------------------------------------------------

    private static void print(int a, int b, int c) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

    public static void main(String[] args) {

        //max
      /*  System.out.println(maxSide(1, 2, 3));
        System.out.println(maxSide(1, 3, 2));

        System.out.println(maxSide(2, 1, 3));
        System.out.println(maxSide(2, 3, 1));

        System.out.println(maxSide(3, 1, 2));
        System.out.println(maxSide(3, 2, 1));

        //min
        System.out.println(minSide(1, 2, 3));
        System.out.println(minSide(1, 3, 2));

        System.out.println(minSide(2, 1, 3));
        System.out.println(minSide(2, 3, 1));

        System.out.println(minSide(3, 1, 2));
        System.out.println(minSide(3, 2, 1));
*/

        //   System.out.println(minSide(0, 2, 1));
        // System.out.println(maxSide(3, 2, 1));
        //  System.out.println(minSide(3, 2, 1));

        //System.out.println(maxSide(5, 2, -1));


        System.out.println(maxSide(2, 3, 5));
        System.out.println(minSide(2, 3, 5));
        System.out.println(minSide(0, 3, 5));

    }
}


