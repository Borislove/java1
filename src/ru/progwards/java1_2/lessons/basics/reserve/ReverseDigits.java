package ru.progwards.java1_2.lessons.basics.reserve;


//Sun Mar 15 05:01:53 MSK 2020
//ноль исчезает...плохой реверс!

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
        System.out.println(reverseDigits(560));

       /* System.out.println(ReverseDigitsTest.reverseDigits(890));
        System.out.println(ReverseDigitsTest.reverseDigits(891));*/

        System.out.println(ReverseDigitsTest1.reverseDigits(567));
        System.out.println(ReverseDigitsTest.reverseDigits(560));
    }
}


class ReverseDigitsTest {

    public static int reverseDigits(int number) {
        String str1 = Integer.toString(number % 10);
        String str2 = Integer.toString(number % 100 / 10);
        String str3 = Integer.toString(number / 100);
        String str = str1 + str2 + str3;
        System.out.println(str);
        return Integer.parseInt(str1 + "" + str2 + str3);
    }
}


class ReverseDigitsTest1 {

    public static int reverseDigits(int number) {
        String str1 = Integer.toString(number % 10 + number % 100 / 10 + number / 100);   //все не то
        return Integer.parseInt(str1);
    }
}


// TODO: 07.07.2020 опять потерялось решение!
/*

public class ReverseDigits {


    static int number ;
    public static int reverseDigits (int number){

        Integer numb = Integer.valueOf(number);
        String str = numb.toString();
        // str = new String(str);
        StringBuffer rev = new StringBuffer(str);
        rev.reverse();

        int reva = Integer.parseInt(rev.toString());
        System.out.println(reva);
        return reva;
    }


    public static void main(String[] args) {
        reverseDigits(number);

        reverseDigits(212);
    }
}*/
