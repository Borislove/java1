package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Ввести с клавиатуры три целых числа.
Одно из чисел отлично от двух других, равных между собой.
 Вывести на экран порядковый номер числа, отличного от остальных.

Пример для чисел 4 6 6:
1

Пример для чисел 6 6 3:
3

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна использовать команды System.out.println() или System.out.print().
•	Программа должна выводить на экран порядковый номер числа, отличного от остальных.
•	Если все числа разные, ничего не выводить.*/
public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputOneNumber = Integer.parseInt(reader.readLine());
        int inputTwoNumber = Integer.parseInt(reader.readLine());
        int inputTreeNumber = Integer.parseInt(reader.readLine());

        if (inputOneNumber == inputTwoNumber && inputOneNumber != inputTreeNumber) {
            System.out.println(3);
        }
        if (inputOneNumber == inputTreeNumber && inputOneNumber != inputTwoNumber) {
            System.out.println(2);
        }
        if (inputTwoNumber == inputTreeNumber && inputTwoNumber != inputOneNumber) {
            System.out.println(1);
        }
    }
}
