package Warehouse.utils;

import java.io.InputStream;

//
public class Scanner {
    public Scanner(InputStream in) {
    }

    public static void main(String[] args)
    {
        int a, b, c;
        String s1, s2;
        System.out.println("Введите два числа");
        a = new java.util.Scanner(System.in).nextInt();
        b = new java.util.Scanner(System.in).nextInt();
        c = a + b;
        System.out.println("Сумма ваших чисел равна " + c);


        //Scanner key = new Scanner(System.in);

    }
}



