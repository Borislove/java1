package ru.progwards.T5.Inheritance;

//прямоугольник
public class Rectangle extends Square{
    double b;
    Rectangle(double a,double b){
        super(a);
        this.b = b;
    }
    @Override
    double area(){
        return a*b;
    }
    @Override
    double perimeter(){
        return 2* (a+b);
    }
    @Override
    public String toString(){
        return "Прямоугольник "+a+" x "+b;
    }
}
