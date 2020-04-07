package com.javarush.level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lecture08 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Программа будет вводить строки с клавиатуры, пока не будет введена строка «exit».

        //-----------option:1-------------------
        boolean isExit = false;
        while (!isExit) {
            String s = reader.readLine();
            isExit = s.equals("exit");
        }


        //-----------option:2-------------------
        while (true) {
            String s = reader.readLine();
            if (s.equals("exit"))
                break;
        }
    }
}
