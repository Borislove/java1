package ru.progwards.T6.T6_2;

public class ObjectsCompare {

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));

        obj2 = obj1;

        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));
    }
}
