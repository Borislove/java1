package ru.progwards.kbv1219.Triangle;

public class Triangle {

    //свойства
    double a,b,c;
    //конструктор
    public Triangle(double side_a, double side_b, double side_c){
        a = side_a;
        b = side_b;
        c = side_c;
    }
    //метод
    public double perimeter(){
        return a+b+c;

    }
    public double area(){

        //считаем по формуле Герона
        double hP = perimeter() / 2;
        return Math.sqrt(hP*(hP-a) * (hP-b)* (hP-c));
    }
    public static void main(String[] args) {




    }
}
