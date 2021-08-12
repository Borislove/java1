package ru.progwards.java1.lessons.basics;

/*1.1 Реализовать функцию
public static int reverseDigits(int number), которая получает параметром number трёхзначное положительное число,
а вернуть должна число в котором цифры идут в обратном порядке (например, если на вход передаётся 123, то функция должна вернуть 321).

Рекомендации:
для реализации задачи вспомните особенности деления в Java (в середине лекции "БНФ, константы, операторы, приоритеты")
Для тестирования решения используйте функцию main, и проверьте как минимум 3 значения, например 123, 456, 789*/

public class ReverseDigits {

    public static int reverseDigits(int number) {
        if (checkNum(number)) {
            return unit(number) + dozens(number) + hundred(number);
        } else
            return 0;
    }

    //единицыл
    private static int unit(int number) {
        return number % 10 * 100;
    }

    //десятки
    private static int dozens(int number) {
        return number / 10 % 10 * 10;
    }

    //сотни
    private static int hundred(int number) {
        return number / 100;
    }

    //проверка числа
    public static boolean checkNum(int number) {

//   TODO: 12.08.2021 String.valueOf(number).length() // оболочка
        if (Integer.toString(number).length() == 3) {
            return true;
        } else
            System.err.println("Число не трехзначное!!!или отрицательное!!!" + " получено: " + number);
        return false;
    }

    //печать
    private static String print(int number) {
        if (checkNum(number)) {
            System.out.println("Получено число: " + number);
            System.out.println("Реверс числа: " + reverseDigits(number));
        }
        return " ";
    }

    public static void main(String[] args) {
        print(2221);
        print(21);
        print(231);
        print(-231);
        print(0);
        print(120);
        // TODO: 12.08.2021    120 -- 21

        System.out.println(unit(123));
        System.out.println(dozens(456));
        System.out.println(hundred(789));
    }
}
