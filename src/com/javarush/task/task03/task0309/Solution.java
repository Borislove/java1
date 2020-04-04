package com.javarush.task.task03.task0309;

/*Вывести на экран сумму чисел от 1 до 5 построчно (должно быть 5 строк):
1
1+2=3
1+2+3=6
...

Пример вывода:
1
3
6
...

Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 5 строк.
•	Число в каждой новой строке должно быть больше предыдущего.
•	Выводимый текст должен соответствовать заданию.*/

/*
Сумма 5 чисел
*/

public class Solution {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        System.out.println(a);
        System.out.println(a + b);
        System.out.println(a + b + c);
        System.out.println(a + b + c + d);
        System.out.println(a + b + c + d + e);
    }
}
