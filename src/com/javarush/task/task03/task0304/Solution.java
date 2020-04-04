package com.javarush.task.task03.task0304;

/*Напиши код метода addTenPercent, который увеличивает переданное целое число на 10%.
Для возврата результата из метода addTenPercent используй оператор return.

Пример:
return 123 * 435;

Требования:
•	Метод addTenPercent должен увеличивать переданное число на 10% процентов.
•	Метод main должен вызывать метод addTenPercent.
•	Метод main должен выводить результаты вызова на экран.
•	Метод addTenPercent не должен ничего выводить на экран.*/

/*
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        double p = i + (i * 0.10);
        return p;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
