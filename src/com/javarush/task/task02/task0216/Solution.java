package com.javarush.task.task02.task0216;

/*Написать функцию, которая вычисляет минимум из трёх чисел.

Подсказка:
Нужно написать тело существующей функции min.

Требования:
•	Программа должна выводить текст на экран.
•	Метод min не должен выводить текст на экран.
•	Метод main должен вызвать метод min четыре раза.
•	Метод main должен выводить на экран результат работы метода min. Каждый раз с новой строки.
•	Метод min должен возвращать минимальное значение из чисел a, b и с.*/

/*
Минимум трёх чисел
*/
public class Solution {
    public static int min(int a, int b, int c) {
        //напишите тут ваш код
        int min;
        if (a <= b && a <= c) {
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        } else if (c <= a && c <= b) {
            min = c;
        } else min = a;
        return min;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
