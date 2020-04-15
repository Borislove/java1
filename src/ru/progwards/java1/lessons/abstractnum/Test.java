package ru.progwards.java1.lessons.abstractnum;

//7. Реализовать класс Test вычисляющий, с методом main
public class Test {

    public static void main(String[] args) {

        //7.1 Объем куба в целых числах, со стороной 3
        Figure3D figure3D = new Cube(new IntNumber(3));
        System.out.println(figure3D.volume());

        //7.2 Объем куба в double, со стороной 3
        Figure3D figure3D1 = new Cube(new DoubleNumber(3));
        System.out.println(figure3D1.volume());

        //7.3 Объем пирамиды в целых числах, со стороной 3
        Pyramid pyramid = new Pyramid(new IntNumber(3));
        System.out.println(pyramid.volume());

        //7.4 Объем пирамиды в double, со стороной 3
        Pyramid pyramidDouble = new Pyramid(new DoubleNumber(3));
        System.out.println(pyramidDouble.volume());


        //-------------------test----------------------------------
        Pyramid pyramid1Test = new Pyramid(new IntNumber(315));
        System.out.println("ru/progwards/java1/lessons/test " + pyramid1Test.volume());
    }
}
