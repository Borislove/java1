package com.javarush.task.task03.task0325;

/*Ввести с клавиатуры число n.
Вывести на экран надпись "Я буду зарабатывать $n в час".

Пример:
Я буду зарабатывать $50 в час

Требования:
•	Программа должна выводить текст.
•	Программа должна считывать данные с клавиатуры.
•	Выведенный текст должен содержать введенное число n.
•	Выведенный тест должен полностью соответствовать заданию.*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        System.out.println("Я буду зарабатывать $" + n + " в час");
    }
}

