package ru.progwards.java1.lessons.bitsworld;

/*
Подсказки:
используйте & с числом 1 для того, чтобы оставить только один правый значащий бит;
используйте сдвиг вправо для того, чтобы проверить следующий бит.
*/

public class SumBits {

    /////////////////////////////////////////////////////////////////////
    /*1.1 Реализовать функцию public static int sumBits(byte value),
    которая суммирует все биты параметра value. Например, для двоичного
    числа 0100101 функция должна вернуть 3.*/
    /////////////////////////////////////////////////////////////////////
    public static int sumBits(byte value) {
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            sum += (value >> i) & 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumBits((byte) 10100101));
    }
}
