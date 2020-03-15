package ru.progwards.java1.lessons.basics;


//Sun Mar 15 05:01:53 MSK 2020


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*1.1 Реализовать функцию
public static int reverseDigits(int number), которая получает параметром number трёхзначное положительное число,
а вернуть должна число в котором цифры идут в обратном порядке (например, если на вход передаётся 123, то функция должна вернуть 321).

Подсказки:
для реализации задачи вспомните особенности деления в Java (в середине лекции "БНФ, константы, операторы, приоритеты").
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class ReverseDigits {

    public static int reverseDigits(int number) {

        int numberOne = number % 10;
        int numberTwo = number % 100 / 10;
        int numberThree = number / 100;

        String str = "" + numberOne + "" + numberTwo + "" + numberThree;

        Integer integer = Integer.parseInt(str);
        return integer;
    }

    public static void main(String[] args) {

        System.out.println(reverseDigits(123));
        System.out.println(reverseDigits(987));
        System.out.println(reverseDigits(567));
    }
}
