package com.skillbox.exception;

public class Exception2 {

    public static void main(String[] args) {

        int[] drinkPrices = {120, 80, 20};

        System.out.println("BEFORE"); //до или перед
        try {   //блок где будет вылазить ошибка
            System.out.println(drinkPrices[3]);
        } catch (java.lang.Exception ex) {
            System.out.println("EXCEPTION"); //сама ошибка
        }
        System.out.println("AFTER"); //после
    }
}




