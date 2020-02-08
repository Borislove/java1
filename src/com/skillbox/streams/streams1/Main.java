package com.skillbox.streams.streams1;

public class Main {

    //запускает и печатает два потока паралельно
    public static void main(String[] args) {

        MyThread thread1 = new MyThread();
        thread1.threadNumber = 1;

        MyThread thread2 = new MyThread();
        thread2.threadNumber = 2;

        thread1.start();
        thread2.start();
    }
}
