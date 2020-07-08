package ru.progwards.java1.lessons.compare_if_cycles;

//Задача 2. Класс TriangleInfo

public class TriangleInfo {

    /*2.1 Реализовать функцию
    public static boolean isTriangle(int a, int b, int c), которая возвращает true,
    если по данным трём сторонам (a, b, c) можно построить треугольник.
    Из геометрии известно, что в треугольнике длина каждой из сторон меньше суммы длин двух других сторон.*/

    public static boolean isTriangle(int a, int b, int c) {

        //проверка сторон на 0
        if (a <= 0 || b <= 0 || c <= 0) {
            System.err.println("сторона не может быть меньше 0 или равнятся");
            return false;
        }

        //проверка сторон
        boolean side_a = b + c > a;
        boolean side_b = a + c > b;
        boolean side_c = a + b > c;

        return side_a && side_b && side_c;
    }

    /*2.2 Реализовать функцию
    public static boolean isRightTriangle(int a, int b, int c),
    которая возвращает true, если треугольник со сторонами a, b, c является прямоугольным.
    Из геометрии известно, что для прямоугольного треугольника выполняется теорема Пифагора
    (сумма квадратов катетов равна квадрату гипотенузы).*/
    public static boolean isRightTriangle(int a, int b, int c) {

        // TODO: 08.07.2020  SQRT это не квадрат!!!
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        //сумма квадратов катетов равна квадрату гипотенузы
        boolean side_c = a * a + b * b == c * c;
        boolean side_b = a * a + c * c == b * b;
        boolean side_a = b * b + c * c == a * a;

        return side_c || side_b || side_a;
    }

    /*2.3 Реализовать функцию
    public static boolean isIsoscelesTriangle(int a, int b, int c),
    которая возвращает true, если треугольник со сторонами a, b, c является равнобедренным.
    Из геометрии известно, что в равнобедренном треугольнике есть две равные стороны.*/

    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        return a == b || b == c || a == c;
    }

    public static void main(String[] args) {
 /*       System.out.println(isTriangle(1, 2, 4));
        System.out.println(isTriangle(2, 2, 4));
        System.out.println(isTriangle(2, 2, 5));
        System.out.println(isTriangle(4, 2, 5));
        System.out.println(isTriangle(4, 2, 0));
        System.out.println(isTriangle(4, -2, 2));

        System.out.println(isRightTriangle(2, 3, 4));
        System.out.println(isRightTriangle(1, 3, 4));


        System.out.println(isIsoscelesTriangle(2,2,3));
        System.out.println(isIsoscelesTriangle(1,2,3));
        System.out.println(isIsoscelesTriangle(3,2,3));*/

        //   System.out.println(isRightTriangle(5, 7, 7));
        System.out.println(isRightTriangle(3, 4, 5));
    }
}
