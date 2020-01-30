package com.javarush.task.task01.task0127;

/*Напиши программу, которая выводит на экран квадрат числа 5.

Требования:
•	Программа должна выводить текст.
•	Метод main должен вызывать метод sqr с параметром 5.
•	Метод main должен выводить результат метода sqr.
•	Метод sqr изменять нельзя.
•	Выводимый текст должен соответствовать заданию.*/

/*
Число в квадрате
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(sqr(5));
    }

    public static int sqr(int a) {
        return a * a;
    }
}

