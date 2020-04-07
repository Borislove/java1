package com.javarush.task.task04.task0428;

/*Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.

Примеры:
а) при вводе чисел
-4
6
6
получим вывод
2

б) при вводе чисел
-6
-6
-3
получим вывод
0
в) при вводе чисел
0
1
2
получим вывод
2
Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить количество положительных чисел в исходном наборе.
•	Если положительных чисел нет, программа должна вывести "0".
•	Учти, что "0" не относится ни к положительным, ни к отрицательным числам.*/
/*
Положительное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static boolean plus(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0;
    }

    public static boolean minus(int a, int b, int c) {
        return a <= 0 && b <= 0 && c <= 0;
    }

    public static boolean two(int a, int b, int c) {
        return a > 0 && b > 0 && c <= 0 || a > 0 && c > 0 && b <= 0 || b > 0 && c > 0 && a <= 0;
    }

    public static boolean one(int a, int b, int c) {
        return a > 0 && b <= 0 && c <= 0 || b > 0 && a <= 0 && c <= 0 || c > 0 && a <= 0 && b <= 0;
    }

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (plus(a, b, c)) {
            System.out.println(3);
        }
        if (minus(a, b, c)) {
            System.out.println(0);
        }
        if (two(a, b, c)) {
            System.out.println(2);
        }
        if (one(a, b, c)) {
            System.out.println(1);
        }
    }
}

