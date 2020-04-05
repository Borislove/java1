package com.javarush.task.task04.task0421;

/*Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить.

Требования:
•	Программа должна считывать две строки c клавиатуры.
•	Программа должна содержать System.out.println() или System.out.print()
•	Если имена одинаковые вывести сообщение "Имена идентичны"
•	Если имена разные, но их длины равны , вывести сообщение "Длины имен равны"
•	Если имена и длины имен разные - ничего не выводить.*/


/*
Настя или Настя?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = String.valueOf(reader.readLine());
        String name2 = String.valueOf(reader.readLine());

        if (name1.equals(name2)) {
            System.out.println("Имена идентичны");
        } else if (name1.length() == name2.length()) {
            System.out.println("Длины имен равны");
        }
    }
}
