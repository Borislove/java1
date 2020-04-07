package com.javarush.task.task04.task0425;

/*Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.

Пример для чисел 4 6:
1

Пример для чисел -6 -6:
3

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Если точка находится в первой координатной четверти, вывести "1".
•	Если точка находится во второй координатной четверти, вывести "2".
•	Если точка находится в третей координатной четверти, вывести "3".
•	Если точка находится в четвёртой координатной четверти, вывести "4".*/


/*
Цель установлена!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputOneNumber = Integer.valueOf(reader.readLine());

        int inputTwoNumber = Integer.valueOf(reader.readLine());

        if (inputOneNumber > 0 && inputTwoNumber > 0) {
            System.out.println(1);
        }
        if (inputOneNumber < 0 && inputTwoNumber > 0) {
            System.out.println(2);
        }
        if (inputOneNumber < 0 && inputTwoNumber < 0) {
            System.out.println(3);
        }
        if (inputOneNumber > 0 && inputTwoNumber < 0) {
            System.out.println(4);
        }
    }
}
