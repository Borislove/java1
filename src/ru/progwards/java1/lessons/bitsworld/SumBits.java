package ru.progwards.java1.lessons.bitsworld;


/*Задача 1. Класс SumBits
1.1 Реализовать функцию public static int sumBits(byte value), которая суммирует все биты параметра value.
Например, для двоичного числа 0100101 функция должна вернуть 3.

Подсказки:
используйте & с числом 1 для того, чтобы оставить только один правый значащий бит;
используйте сдвиг вправо для того, чтобы проверить следующий бит.*/

public class SumBits {

    private static int sumBits(byte value) {
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            sum += last(value);
            value = shift(value);
        }
        return sum;
    }

    //правый младший бит
    private static int last(byte value) {
        return value & 1;
    }

    //сдвиг бита
    private static byte shift(byte value) {
        return (byte) (value >> 1);
    }

    private static void printBinary(byte value) {
        System.out.println(Integer.toBinaryString(value));
    }

    public static void main(String[] args) {

     //   byte b = 0b01111111;
        byte b = 0b0100101;
        System.out.println(sumBits(b));

        printBinary(b);
    }
}
