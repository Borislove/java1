package com.javarush.task.task04.task0412;

/*Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.

Требования:
•	Программа должна считывать число c клавиатуры.
•	Программа должна выводить число на экран.
•	Если введенное число положительное, необходимо увеличить его в два раза и вывести.
•	Если введенное число отрицательное, необходимо увеличить его на единицу и вывести.
•	Если введенное число равно нулю, необходимо вывести ноль.*/


/*
Положительное и отрицательное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String b = reader.readLine();
        int input = Integer.parseInt(b);

        if (input > 0) {
            input = input * 2;
            System.out.println(input);
        }

        if (input == 0) {
            System.out.println(input);
        }

        if (input < 0) {
            ++input;
            System.out.println(input);
        }
    }
}
