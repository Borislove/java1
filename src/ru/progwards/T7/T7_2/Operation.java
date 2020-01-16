package ru.progwards.T7.T7_2;

// TODO: 16.01.2020  Кудато делись предыдущие классы
public class Operation {

    public static void main(String[] args) {
        int x = 0b111111_1111000_01010101_10100000;
        int y = 0b111000_1000000_01010111_11111100;
        int result = x & y;  // & (AND) - битовое И
        System.out.print("Переменная         x = ");
        System.out.println(Integer.toBinaryString(x));
        System.out.print("Переменная         y = ");
        System.out.println(Integer.toBinaryString(y));
        System.out.print("Переменная    result = ");
        System.out.println(Integer.toBinaryString(result));

    }
}
