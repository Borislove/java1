package com.javarush.task.task02.task0214;

public class Example1 {

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(min(22, 33));
    }
}
