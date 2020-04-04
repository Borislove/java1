package com.javarush.task.task02.task0214;

/*Написать функцию, которая возвращает минимум из двух чисел.

Подсказка:
Нужно написать тело существующей функции min.

Требования:
•	Программа должна выводить текст на экран.
•	Метод min не должен выводить текст на экран.
•	Метод main должен вызвать метод min три раза.
•	Метод main должен выводить на экран результат работы метода min. Каждый раз с новой строки.
•	Метод min должен возвращать минимальное значение из чисел a и b.*/
/*
Минимум двух чисел
*/
public class Solution {

    public static int min(int a, int b) {
        //напишите тут ваш код
        int m2;
        if (a < b)
            m2 = a;
        else
            m2 = b;
        return m2;
    }

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}


