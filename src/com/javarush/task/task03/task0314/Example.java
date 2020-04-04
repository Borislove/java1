package com.javarush.task.task03.task0314;

public class Example {
    /*
Таблица умножения
*/
    public static void main(String[] args) {
        System.out.println(multiplicationTable(1));
        System.out.println(multiplicationTable(2));
        System.out.println(multiplicationTable(3));
        System.out.println(multiplicationTable(4));
        System.out.println(multiplicationTable(5));
        System.out.println(multiplicationTable(6));
        System.out.println(multiplicationTable(7));
        System.out.println(multiplicationTable(8));
        System.out.println(multiplicationTable(9));
        System.out.println(multiplicationTable(10));
    }

    public static String multiplicationTable(int number) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;
        int g = 7;
        int h = 8;
        int i = 9;
        int j = 10;
        String s = number * a + " " + number * b + " " + number * c + " " + number * d + " " + number * e + " " + number * f + " " + number * g + " " + number * h + " " + number * i + " " + number * j;
        return s;
    }
}

