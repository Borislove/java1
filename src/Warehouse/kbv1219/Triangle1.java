package Warehouse.kbv1219;

public class Triangle1 {
    //свойства
    double a, b, c;

    public boolean isOk = false;

    //конструкторы
    public Triangle1() {
        isOk = a + b > c && a + c > b && b + c > a;
    }

    public Triangle1(double a, double b, double c) {
        this();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double perimeter() {
        return a + b + c;
    }

    public double area() {

        double hP = perimeter() / 2;
        return Math.sqrt(hP * (hP - a) * (hP - b) * (hP - c));
    }

    public static void main(String[] args) {
    }
}
