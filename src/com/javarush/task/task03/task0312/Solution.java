package com.javarush.task.task03.task0312;

/*Добавь метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
Вызови его дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.

Требования:
•	Добавь метод convertToSeconds, он должен быть public static, возвращать и принимать int.
•	Метод convertToSeconds должен переводить переданные часы в секунды.
•	Метод main должен дважды вызывать метод convertToSeconds.
•	Метод main должен выводить результаты вызова на экран, каждый раз с новой строки.
•	Метод convertToSeconds не должен ничего выводить на экран.*/

/*
Конвертируем время
*/

public class Solution {

    public static int convertToSeconds(int hour) {

        int seconds = 1;
        int minutes = seconds * 60;
        int h = minutes * 60 * hour;

        //  System.out.println(h);
        return h;
    }

    public static int converToSeconds1(int hour) {
        return hour * 3600;
    }

    public static void main(String[] args) {

        System.out.println(convertToSeconds(10));
        System.out.println(convertToSeconds(2));
        System.out.println(" ");
        System.out.println(converToSeconds1(10));
        System.out.println(converToSeconds1(2));
    }
}
