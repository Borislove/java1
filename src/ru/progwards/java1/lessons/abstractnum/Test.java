package ru.progwards.java1.lessons.abstractnum;

public class Test {

    public static void main(String[] args) {
        Figure3D fig = new Cube(new IntNumber(3));
        System.out.println(fig.volume());

     /*   fig = new Cube(new DoubleNumber(3));
        System.out.println(fig.volume());

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
