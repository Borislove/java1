package com.skillbox.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception4 {

    public static void main(String[] args) {

        try {
            FileInputStream is = new FileInputStream("test");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
