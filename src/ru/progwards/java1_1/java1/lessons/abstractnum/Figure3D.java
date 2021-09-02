package ru.progwards.java1_1.java1.lessons.abstractnum;

public class Figure3D {

    Number segment;

    /*4.1 конструктор
    public Figure3D(Number segment), который будет сохранять в
    классе значение длины отрезка. Для куба это будет длина стороны, для шара - радиус*/
    public Figure3D(Number segment) {
        this.segment = segment;
    }

    /*4.2 метод
     public Number volume(), который будет возвращать объем фигуры. Для класса Figure3D это будет null;*/
    public Number volume() {
        return null;
    }
}
