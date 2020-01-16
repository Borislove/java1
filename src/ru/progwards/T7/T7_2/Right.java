package ru.progwards.T7.T7_2;

import java.sql.SQLOutput;

public class Right {

    //Битовые операции
    // сдвиг вправо >>

    public static void main(String[] args) {
        int x = 0b1010101_01010101_01010101_01010101;

        int result = x >> 1;
        System.out.print("Переменная         x = ");
        System.out.println(Integer.toBinaryString(x));
       // System.out.print("Переменная    result = ");
        System.out.println(String.format("%32s", Integer.toBinaryString(result)).replace(' ', '0'));
        result++;
        System.out.println(String.format("%32s", Integer.toBinaryString(result)).replace(' ', '0'));

      /*  while (true) {

          *//*  System.out.println(String.format("%32s", Integer.toBinaryString(result)).replace(' ', '0'));
            result++;
            System.out.println(String.format("%32s", Integer.toBinaryString(result)).replace(' ', '0'));
*//*
            System.out.println(Integer.toBinaryString(result));
            result++;

        }*/
    }
}


