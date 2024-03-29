package ru.progwards.java1.lessons.bitsworld;


/*Задача 2. Класс CheckBit
2.1 Реализовать функцию public static int checkBit(byte value, int bitNumber)
которая возвращает значение бита с порядковым номером bitNumber от параметра value.
При этом следует помнить, что нумерация начинается с нуля и нулевой бит является младшим.

Подсказки:
при реализации этой функции следует использывать опыт, полученный при решении предыдущей задачи;
кроме того, удобно использовать битовую операцию сдвиг вправо >>.*/
public class CheckBit {

    public static int checkBit(byte value, int bitNumber) {
        return (value >> bitNumber) & 0b0000_0001;
    }

    public static void main(String[] args) {

        //   System.out.println(checkBit((byte) 0b011110101_01000000_11110001_00101010, 5));


        //System.out.println(checkBit((byte) 0b0111001, 6));

        //System.out.println(checkBit((byte) 0b0111001, 5));
        System.out.println(checkBit((byte) 0b0111001, 0));
    }
}
