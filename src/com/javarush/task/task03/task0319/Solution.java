package com.javarush.task.task03.task0319;

/*Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
"Имя" получает "число1" через "число2" лет.

Пример:
Коля получает 3000 через 5 лет.

Требования:
•	Программа должна выводить текст.
•	Программа должна считывать данные с клавиатуры.
•	Выведенный текст должен содержать введенное имя.
•	Выведенный текст должен содержать введенное число1.
•	Выведенный текст должен содержать введенное число2.
•	Выведенный текст должен полностью соответствовать заданию.*/

/*
Предсказание на будущее
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        String b = reader.readLine();
        String l = reader.readLine();
        int B = Integer.parseInt(b);
        int L = Integer.parseInt(l);
        System.out.println(n + " получает " + b + " через " + l + " лет.");
    }
}

