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
        int B = Integer.parseInt(b);

        if (B > 0) {
            B = B * 2;
            System.out.println(B);
        }

        if (B == 0) {
            System.out.println(B);
        }

        if (B < 0) {
            ++B;
            System.out.println(B);
        }
    }
}
