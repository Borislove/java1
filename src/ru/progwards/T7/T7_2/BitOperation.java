package ru.progwards.T7.T7_2;

//Битовые операции
public class BitOperation {

    public static void main(String[] args) {
        //---------------------------------------------------------------------
        // >> (сдвиг вправо)
        //---------------------------------------------------------------------
  /*      int x = 0b11111111_11110000_01010101_00000000;
        int result = x >> 1;
        System.out.print("Переменная         x = ");
        System.out.println(Integer.toBinaryString(x));
        System.out.print("Переменная    result = ");
        System.out.println(String.format("%32s", Integer.toBinaryString(result)).replace(' ', '0'));

      *///---------------------------------------------------------------------
        // >>> (сдвиг вправо c заполнением нулями)
        //---------------------------------------------------------------------
     /*   int x = 0b11111111_11110000_01010101_00000000;
        int result = x >>> 1;
        System.out.print("Переменная         x = ");
        System.out.println(Integer.toBinaryString(x));
        System.out.print("Переменная    result = ");
        System.out.println(String.format("%32s", Integer.toBinaryString(result)).replace(' ', '0'));*/

        //---------------------------------------------------------------------
        // << (сдвиг влево) аналогичен умножению на 2, сдвиг на 2 на 4, на 3 на 8
        //---------------------------------------------------------------------
      /*  int x = 0b11111111_11110000_01010101_00000000;
        int result = x << 1;
        System.out.print("Переменная         x = ");
        System.out.println(Integer.toBinaryString(x));
        System.out.print("Переменная    result = ");
        System.out.println(String.format("%32s", Integer.toBinaryString(result)).replace(' ', '0'));
*/
        //---------------------------------------------------------------------
        // ~ NOT = битовое отрицание
        //---------------------------------------------------------------------
        int x = 0b11111111_11110000_01010101_00000000;
        int result = ~x;
        System.out.print("Переменная         x = ");
        System.out.println(Integer.toBinaryString(x));
        System.out.print("Переменная    result = ");
        System.out.println(String.format("%32s", Integer.toBinaryString(result)).replace(' ', '0'));
    }
}


