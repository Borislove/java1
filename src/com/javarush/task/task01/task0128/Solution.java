package com.javarush.task.task01.task0128;

/*Напиши программу, которая вызывает метод sum с параметрами 2 и 2.

Требования:
•	Программа должна выводить сумму 2 и 2.
•	Метод main должен вызывать метод sum с параметрами 2 и 2.
•	Метод main не должен вызывать команду вывода текста на экран.
•	Метод sum изменять нельзя.*/

/*
Просто, как 2+2
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        sum(2, 2);
    }
    public static void sum(int a, int b) {
        int c = a + b;
        System.out.print(c);
    }
}
