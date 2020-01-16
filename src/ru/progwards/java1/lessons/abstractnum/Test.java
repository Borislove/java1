package ru.progwards.java1.lessons.abstractnum;

//Реализовать классы Cube, Pyramid, вычисляющие объем фигуры в абстрактных числах класса Number, реализованный в целых числах, и в числах с плавающей точкой.
// TODO: 16.01.2020 я запутался...где теперь правильное решение
// TODO: 16.01.2020  __/(o_O)\__

public class Test {

    public static void main(String[] args) {
        Figure3D fig = new Cube(new IntNumber(3));
        System.out.println(fig.volume());

        fig = new Cube(new DoubleNumber(3));
        System.out.println(fig.volume());


       Figure3D pyr = new Pyramid(new IntNumber(11)  );  //orig

        //Figure3D pyr = new Pyramid(new IntNumber(11) /(new  IntNumber(3) ));   //

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


// TODO: 14.01.2020 Еще больше ошибок..

/*Задача 1. Классы Figure3D, Cube, Pyramid: не пройдено, оценка: 43.0
Комментарий:
OK: Тест "Класс IntNumber, конструктор Number(int number)" пройден успешно.
OK: Тест "Класс IntNumber, метод mul(Number n1, Number n2)" пройден успешно.
OK: Тест "Класс IntNumber, метод div(Number n1, Number n2)" пройден успешно.
OK: Тест "Класс IntNumber, метод newNumber(String strNum)" пройден успешно.
OK: Тест "Класс DoubleNumber, конструктор Number(int number)" пройден успешно.
ERROR: Тест "Класс DoubleNumber, метод mul(Number n1, Number n2)" не пройден. Во время выполнения возникло исключение java.lang.NullPointerException
OK: Тест "Класс DoubleNumber, метод div(Number n1, Number n2)" пройден успешно.
OK: Тест "Класс DoubleNumber, метод newNumber(String strNum)" пройден успешно.
OK: Тест "Класс Figure3D, конструктор Figure3D(Number segment)" пройден успешно.
OK: Тест "Класс Figure3D, метод volume()" пройден успешно.
ERROR: Тест "Класс Cube, метод volume()" не пройден. Во время выполнения возникло исключение java.lang.NullPointerException
ERROR: Тест "Класс Pyramid, метод volume()" не пройден. Метод volume() возвращает неверное значение после создания экземпляра объекта с входным параметром new IntNumber(935). Возвращен результат: 817400375, ожидался: 272466791
По данной задаче в целом не зачет, решение возвращено на доработку. Задача выполнена на 69.35%

 */