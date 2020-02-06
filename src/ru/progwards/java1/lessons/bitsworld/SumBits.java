package ru.progwards.java1.lessons.bitsworld;


/*Задача 1. Класс SumBits
1.1 Реализовать функцию public static int sumBits(byte value), которая суммирует все биты параметра value.
 Например, для двоичного числа 0100101 функция должна вернуть 3.
Подсказки:
используйте & с числом 1 для того, чтобы оставить только один правый значащий бит;
используйте сдвиг вправо для того, чтобы проверить следующий бит.
*/
public class SumBits {

    public static int sumBits(byte value) {

        return 0;
    }

    public static void main(String[] args) {

        System.out.println(sumBits((byte) 0100101));

       /* System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.BYTES);
        System.out.println(Byte.SIZE);*/
        // System.out.println(Byte.hashCode((byte) 0100101)); //65
    }
}

