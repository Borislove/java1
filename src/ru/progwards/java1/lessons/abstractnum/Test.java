package ru.progwards.java1.lessons.abstractnum;


public class Test {

    public static void main(String[] args) {
        Figure3D fig = new Cube(new IntNumber(3));
        System.out.println(fig.volume());

        fig = new Cube(new DoubleNumber(3));
        System.out.println(fig.volume());
/*
        fig = new Pyramid(new DoubleNumber(3));
        System.out.println(fig.volume());

        Number in = new IntNumber(3);
        Number in2 = new IntNumber(3);
        Number dn = new DoubleNumbe(3);
        System.out.println(Double.parseDouble("3"));*/
    }
}

/*7. Реализовать класс Test вычисляющий, с методом main
7.1 Объем куба в целых числах, со стороной 3
7.2 Объем куба в double, со стороной 3


7.3 Объем пирамиды в целых числах, со стороной 3
7.4 Объем пирамиды в double, со стороной 3


7.5 Вывести вычисленные значения на консоль*/


// TODO: 14.01.2020
/*В Вашем репозитории GitHub, в package ru/progwards/java1/lessons/abstractnum, обнаружены следующие проблемы с файлами задания:

Задача 1. Классы Figure3D, Cube, Pyramid:
Ошибка 1: incompatible types: ru.progwards.java1.lessons.abstractnum.DoubleNumber cannot be converted to ru.progwards.java1.lessons.abstractnum.Number
Ошибка 2: constructor Pyramid in class ru.progwards.java1.lessons.abstractnum.Pyramid cannot be applied to given types;
 required: no arguments
 found: ru.progwards.java1.lessons.abstractnum.IntNumber
 reason: actual and formal argument lists differ in length
Ошибка 3: constructor Pyramid in class ru.progwards.java1.lessons.abstractnum.Pyramid cannot be applied to given types;
 required: no arguments
 found: ru.progwards.java1.lessons.abstractnum.DoubleNumber
 reason: actual and formal argument lists differ in length
У Вас есть возможность сделать работу над ошибками. Исправьте все, что считаете нужным, обновите репозитарий, и отправьте Ваш ответ на проверку снова.*/