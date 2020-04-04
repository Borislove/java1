package com.javarush.task.task03.task0322;

/*Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!

Пример:
Вася + Ева + Анжелика = Чистая любовь, да-да!

Требования:
•	Программа должна выводить текст.
•	Программа должна считывать данные с клавиатуры.
•	Выведенный текст должен содержать введенное имя name1.
•	Выведенный текст должен содержать введенное имя name2.
•	Выведенный текст должен содержать введенное имя name3.
•	Выведенный тест должен полностью соответствовать заданию.*/

/*
Большая и чистая
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");

    }
}
