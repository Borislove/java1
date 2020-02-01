package ru.progwards.t5.Inheritance;

//наследование

public class Figure {
    //периметр фигуры
    double perimeter() {
        return 0d;
    }
    //площадь фигуры
    double area(){
        return 0d;
    }
    @Override
    public  String toString(){
        return "Абстрактная фигура";
    }
}
