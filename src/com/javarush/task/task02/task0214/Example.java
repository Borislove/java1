package com.javarush.task.task02.task0214;

public class Example {

    public static int min(int a, int b) {
        //return Integer.min(a, b);
        return Math.min(a, b);
    }

    public static void main(String[] args) {
        System.out.println(min(2, 3));
    }
}
