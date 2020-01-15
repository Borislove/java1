package ru.progwards.java1.lessons.abstractnum;

//Реализовать классы Cube, Pyramid, вычисляющие объем фигуры в абстрактных числах класса Number, реализованный в целых числах, и в числах с плавающей точкой.

public class Test {

    public static void main(String[] args) {
        Figure3D fig = new Cube(new IntNumber(3));
        System.out.println(fig.volume());

        fig = new Cube(new DoubleNumber(3));
        System.out.println(fig.volume());


       Figure3D pyr = new Pyramid(new IntNumber(11));
        System.out.println(pyr.volume());

        fig = new Pyramid(new DoubleNumber(3));
        System.out.println(fig.volume());

/*        Number in = new IntNumber(3);
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

/*
ERROR: Тест "Класс Pyramid, метод volume()" не пройден. Метод volume(
) возвращает неверное значение после создания экземпляра объекта с входным параметром new IntNumber(11). Возвращен результат: 1331, ожидался: 443
        По данной задаче в целом не зачет, решение возвращено на доработку. Задача выполнена на 88.71%работу над ошибками.
         Исправьте все, что считаете нужным, обновите репозитарий, и отправьте Ваш ответ на проверку снова.*/


