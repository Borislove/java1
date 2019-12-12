package ru.progwards.ru.progwards.java1.lessons.basics;
/*
* 1.1 Реализовать функцию
public static int reverseDigits(int number), которая получает параметром number трёхзначное положительное число, а вернуть должна число в котором цифры идут в обратном порядке
*  (например, если на вход передаётся 123, то функция должна вернуть 321).
*
* 2 вариант преобразовать число в строку и сделать реверс
*/

public class ReverseDigits {

            public static int reverseDigits(int number) {

            int a;
            int b;
            int c;

            a = (number) / 100 ;
            b = (number) % 100 / 10;
            c = (number) % 10 ;

//            System.out.println("a = " +a);
//            System.out.println("b = " +b);
//            System.out.println("c = " +c);
            System.out.println(c+""+b+""+a);
            return 0;
        }

    public static void main(String[] args) {
        reverseDigits(123);
        }
}

