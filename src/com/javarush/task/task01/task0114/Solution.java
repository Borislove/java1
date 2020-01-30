package com.javarush.task.task01.task0114;

/*Напиши программу, которая выводит на экран надпись: "JavaRush. Learn once - use anywhere" 10 раз.

Требования:
•	Программа должна выводить текст.
•	Текст должен начинаться с "JavaRush".
•	Текст должен заканчиваться на "use anywhere".
•	Текст должен состоять из 10 строк.
•	Выводимый текст должен соответствовать заданию.*/


/*
JavaRush. Learn once - use anywhere
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        //можно 10 раз вывести одно и тоже, а можно и циклом
        for (int x = 0; x < 10; x++) {
            System.out.println("JavaRush. Learn once - use anywhere");
        }
    }
}

