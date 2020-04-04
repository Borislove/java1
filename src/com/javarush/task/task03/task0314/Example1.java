package com.javarush.task.task03.task0314;

public class Example1 {

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 1; i < 11; i++) {
            for (int b = 1; b < 10; b++) {
                System.out.print(i * b + " ");
            }
            System.out.println(i * 10);
        }
    }
}
