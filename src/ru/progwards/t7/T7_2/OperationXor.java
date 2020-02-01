package ru.progwards.t7.T7_2;

// ^ Xor - битовое исключающее ИЛИ
public class OperationXor {
    public static void main(String[] args) {
        int x = 0b111111_1111000_01010101_10100000;
        int y = 0b111000_1000000_01010111_11111100;
        int result = x ^ y;
        System.out.print("Переменная         x = ");
        System.out.println(Integer.toBinaryString(x));
        System.out.print("Переменная         y = ");
        System.out.println(Integer.toBinaryString(y));
        System.out.print("Переменная    result = ");
        //System.out.println(Integer.toBinaryString(result));
        // TODO: 16.01.2020  Искал эту строчку... 
        //System.out.println(String.format("%32s", Integer.toBinaryString(result)).replace(' ', '0'));



    }
}


