package com.skillbox.streams.streams1;

//Печать номер потока
public class MyThread extends Thread {

    public int threadNumber;

    @Override
    public void run() {
        while (true) {
            System.out.println(threadNumber);
        }
    }
}
