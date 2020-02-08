package com.skillbox.exception;

//Делать самому исключения
public class Exception5 {

    public static void main(String[] args) {

        try {
            throw new java.lang.Exception("Error");
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
