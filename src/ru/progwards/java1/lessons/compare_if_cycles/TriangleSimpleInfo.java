package ru.progwards.java1.lessons.compare_if_cycles;

//Задача 1. Класс TriangleSimpleInfo

// v2 09.07.2020
public class TriangleSimpleInfo {
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*1.1 Реализовать функцию
   public static int maxSide(int a, int b, int c),
   которая получает параметрами длины сторон треугольника, а вернуть должна наибольшую длину стороны.*/
    public static int maxSide(int a, int b, int c) {
        // TODO: 09.07.2020 нужны ли проверки на > 0, *решение с if в reserve*
        return Math.max(a, Math.max(b, c));
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*1.2 Реализовать функцию
    public static int minSide(int a, int b, int c),
    которая получает параметрами длины сторон треугольника, а вернуть должна наименьшую длину стороны.*/
    public static int minSide(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*1.3 Реализовать функцию
    public static boolean isEquilateralTriangle(int a, int b, int c),
    которая получает параметрами длины сторон треугольника, а вернуть должна true,
    если треугольник равносторонний и false в противном случае.*/

    public static boolean isEquilateralTriangle(int a, int b, int c) {
        return a == b && b == c;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(maxSide(8, 4, 3));
        System.out.println(maxSide(0, 4, 3));
        System.out.println(minSide(8, 4, 3));
        System.out.println(isEquilateralTriangle(2, 2, 1));
    }
}

