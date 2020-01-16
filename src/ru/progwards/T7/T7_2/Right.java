package ru.progwards.T7.T7_2;

// TODO: 16.01.2020 Надо будет переделать.. 

public class Right {

    //Битовые операции
    //
    // свдиг вправо с заполнениями нулями
    //сдвиг влево <<  , аналогичен умножению на 2, на 2 свдиг на 4, на 3 умножению на 9 и т.д
    // ~ NOT = битовое отрицание

    public static void main(String[] args) {


        //---------------------------------------------------------------------
        // сдвиг вправо >>
        //---------------------------------------------------------------------
        int x = 0b1010101_01010101_01010101_01010101;
        int result = x >> 1;
        System.out.print("Переменная         x = ");
        System.out.println(Integer.toBinaryString(x));
        System.out.print("Переменная    result = ");
        System.out.println(String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0'));




        //int result = x >> 1;
        //int result = x >>> 1;
       /* int result = ~x;
        System.out.print("Переменная         x = ");
        System.out.println(Integer.toBinaryString(x));
       // System.out.print("Переменная    result = ");
        System.out.println(String.format("%32s", Integer.toBinaryString(result)).replace(' ', '0'));*/




        //---------------------------------------------------------------------
        // ~ NOT = битовое отрицание
        //---------------------------------------------------------------------
     /*   int x = 0b1010101_01010101_01010101_01010101;
        int result = ~x;
        System.out.print("Переменная         x = ");
        System.out.println(Integer.toBinaryString(x));
        System.out.println(String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0'));
        System.out.print("Переменная    result = ");
        System.out.println(String.format("%32s", Integer.toBinaryString(result)).replace(' ', '0'));

*/
    }
}


