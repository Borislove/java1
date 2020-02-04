package ru.progwards.t6.t6_2;

import ru.progwards.t5.n5_3.Inheritance.Circle;

public class CircleCompare {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);

        System.out.println(circle1 == circle2);
        System.out.println(circle1.equals(circle2));
    }
}
