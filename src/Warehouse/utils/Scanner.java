package Warehouse.utils;

//
public class Scanner {
    public static void main(String[] args)
    {
        int a, b, c;
        String s1, s2;
        System.out.println("Введите два числа");
        a = new java.util.Scanner(System.in).nextInt();
        b = new java.util.Scanner(System.in).nextInt();
        c = a + b;
        System.out.println("Сумма ваших чисел равна " + c);
    }
}



