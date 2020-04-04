package com.javarush.task.task01.task0133;

/*Напиши код, который считает сколько секунд прошло с 15:00, если на часах 15:30. Выведи результат на экран.

Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен быть целым положительным числом.
•	Выведенное число должно быть кратно 60.
•	Выводимое число должно соответствовать заданию.*/

/*
Не думать о секундах…
*/

public class Solution {

    public static void main(String[] args) {
        int secondsAfter15 = 0;
        int seconds = 1;
        int minutes = 60 * seconds;
        //расчитать секунды с 15-00 до 15-30
        secondsAfter15 = minutes * 30;
        System.out.println(secondsAfter15);
    }
}
