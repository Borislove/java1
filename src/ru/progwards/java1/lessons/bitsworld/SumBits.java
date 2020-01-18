package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static int sumBits(byte value){

        //Byte c = Byte.valueOf(value);
        //System.out.println(c.hashCode());
        //System.out.println(c.byteValue());

       // c.hashCode();
     //   System.out.println(c.hashCode(value));
        //return c;
        //return 1;
/*
        Integer test = new Integer(value);
        System.out.println(test);
        String test1 = test.toString();
        System.out.println("text "+test1);
        System.out.println(test1.hashCode());
        System.out.println(test1.getBytes());
        System.out.println(String.valueOf(test1).getBytes());*/



        //return 0;

        int result = 0;
        for (int i = 0; i < 8; i++) {
            if ((value & 1) == 1) {
                result ++;
            }
            value >>= 1;
        }

        return result;
    }
    public static void main(String[] args) {
      //  System.out.println(Byte.MAX_VALUE);
      //  System.out.println(Byte.MIN_VALUE);

        //sumBits((byte)0b10101);
        System.out.println(sumBits((byte)0b101011111)) ;
        sumBits((byte)0b0101011);


    }
}


/*Задача 1. Класс SumBits
1.1 Реализовать функцию public static int sumBits(byte value), которая суммирует все биты параметра value. Например, для двоичного числа 0100101 функция должна вернуть 3.

Подсказки:
используйте & с числом 1 для того, чтобы оставить только один правый значащий бит;
используйте сдвиг вправо для того, чтобы проверить следующий бит.
*/