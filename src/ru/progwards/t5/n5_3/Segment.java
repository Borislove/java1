package ru.progwards.t5.n5_3;

//Класс Segment(отрезок)
public class Segment extends Figure {
    double a; //хранится длина отрезка

    Segment(double a) { //конструктор
        this.a = a;
    }

    @Override
    double perimeter() {
        return a;
    }
}
