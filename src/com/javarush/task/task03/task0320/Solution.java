package com.javarush.task.task03.task0320;

/*Ввести с клавиатуры имя и вывести надпись:
name зарабатывает $5,000. Ха-ха-ха!

Пример:
Тимур зарабатывает $5,000. Ха-ха-ха!

Требования:
•	Программа должна выводить текст.
•	Программа должна считывать данные с клавиатуры.
•	Выведенный текст должен содержать введенное имя.
•	Выведенный текст должен полностью соответствовать заданию.*/


/*
Скромность украшает программиста
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");

    }
}

