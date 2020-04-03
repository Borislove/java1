package ru.progwards.java1.lessons.abstractnum;

public class Cube extends Figure3D {

    public Cube(Number segment) {
        super(segment);
    }

    /*5 Реализовать класс Cube, переопределяющий метод
    public Number volume(), который будет возвращать объем куба по формуле Segment*Segment*Segment;*/

    @Override
    public Number volume() {
        return segment.mul(segment.mul(segment));
    }
}