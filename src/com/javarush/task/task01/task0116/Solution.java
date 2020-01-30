package com.javarush.task.task01.task0116;

/*Внеси изменения в программу, чтобы переменная name имела значение Amigo.

Требования:
•	Переменной name должно присваиваться значение сразу после создания.
•	Должно быть объявлено 2 переменных.
•	Значение переменной text изменять нельзя.
•	Команду вывода текста на экран изменять нельзя.
•	Программа должна выводить текст "Hello, Amigo!".*/

/*
Вносим изменения в код
*/

public class Solution {
    public static void main(String[] args) {
        String name = "Amigo";
        String text = "Hello, " + name + "!";
        System.out.println(text);
    }
}
