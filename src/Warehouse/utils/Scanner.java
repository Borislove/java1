package Warehouse.utils;

import java.io.InputStream;

//
public class Scanner {
    public Scanner(InputStream in) {
    }

    public static void main(String[] args) {

        //-------------------------------------------------------
      /*  int a, b, c;
        String s1, s2;
        System.out.println("Введите два числа");
        a = new java.util.Scanner(System.in).nextInt();
        b = new java.util.Scanner(System.in).nextInt();
        c = a + b;
        System.out.println("Сумма ваших чисел равна " + c);*/
        //-------------------------------------------------------

        //это пока не работает
        //Scanner key = new Scanner(System.in);


        //----------------пока этим пользуюсь
        /*int ver = new java.util.Scanner(System.in).nextInt();
        int a = Integer.valueOf(ver);*/


        // TODO: 01.02.2020 надо вспомнить
        //----------через строку----------------------------------
        while (true) {
            System.out.println("Введи текст");
            String ver = new java.util.Scanner(System.in).nextLine();
            String str = String.valueOf(ver);

            if (str == "Help") {
                System.out.println("Раздел помощь");
            }
        }
    }
}



