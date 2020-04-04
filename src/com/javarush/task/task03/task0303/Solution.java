package com.javarush.task.task03.task0303;

/*Напиши код метода convertEurToUsd, который переводит евро в доллары по заданному курсу.
Для возврата результата из метода convertEurToUsd используй оператор return. Пример: return 123*435;
Вызови метод convertEurToUsd дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.

Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс

Требования:
•	Метод convertEurToUsd должен умножать евро на курс и возвращать полученный результат.
•	Метод main должен 2 раза вызвать метод convertEurToUsd с любыми параметрами.
•	Метод main должен выводить результаты вызовов на экран, каждый раз с новой строки.
•	Метод convertEurToUsd не должен ничего выводить на экран.*/


/*
Обмен валют
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(55, 23));
        System.out.println(convertEurToUsd(60, 22));
    }

    public static double convertEurToUsd(int eur, double course) {
        double baks = eur * course;
        return baks;
    }
}

