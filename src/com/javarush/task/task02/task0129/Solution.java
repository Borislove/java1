package com.javarush.task.task02.task0129;

/*Выведи на экран длину окружности, рассчитанную по формуле: L = 2 * Pi * radius.
Результат - дробное число (тип double).
В качестве значения Pi используй значение 3.14.

Требования:
•	В методе printCircleLength нужно вывести длину окружности, рассчитанную по формуле: 2 * Pi * radius.
•	Метод main должен вызывать метод printCircleLength с параметром 5.
•	Метод main не должен вызывать команду вывода текста на экран.
•	Программа должна выводить длину окружности с радиусом 5.*/

/*
Считаем длину окружности
*/

public class Solution {
    public static void main(String[] args) {
        printCircleLength(5);
    }

    public static void printCircleLength(int radius) {
        //напишите тут ваш код
        double Pi = 3.14;
        double Radius = 2 * Pi * radius;
        System.out.println(Radius);
    }
}