package Warehouse.utils.variables;

//мальца коряво . но работает

import java.util.Scanner;

public class Main {

    // private static int verse = 1;

    public static void variables() {
        System.out.println("----------------------------");
        System.out.println("Целочисленные типы:");
        System.out.println("Long  - 3");
        System.out.println("Integer - 4");
        System.out.println("Short - 5");
        System.out.println("byte - 6");
        System.out.println("----------------------------");

        System.out.println("Типы с плавающей точкой:");
        System.out.println("Float -  1");
        System.out.println("Double  - 2");
        System.out.println("----------------------------");

        System.out.println("Символьный тип:");
        System.out.println("char - 7");
        System.out.println("----------------------------");

        System.out.println("Булев тип:");
        System.out.println("boolean - 8");
    }

    public static void main(String[] args) {
        variables();
        while (true) {
            Scanner key = new Scanner(System.in);
            int verse = key.nextInt();

            switch (verse) {
                case 1:
                    Float.giveFloat();
                    break;
                case 2:
                    Double.giveDouble();
                    break;
                case 3:
                    Long.giveLong();
                    break;
                case 4:
                    Integer.giveInteger();
                    break;
                case 5:
                    Short.giveShort();
                    break;
                case 6:
                    Byte.giveByte();
                    break;
                case 7:
                    Char.giveChar();
                    break;
                case 8:
                    Boolean.giveBoolean();
                    break;
                default:
                    System.out.println("error");
                    break;
            }

            System.out.println("назад в меню: 0");
            if (key.nextInt() == 0) {
                variables();
            }
        }
    }
}


//Литералы - это неизменяемые значения

/* Целочисленные
byte
short
int
long l = 123456789012345L  или l

С плавающей точкой
double d = 12.2d  или D
float f = 123F  или f

Символьные и строковые литералы
char bigZ = 'Z';  //всегда одинарные кавычки для символов
String = "это строка" ; //всегда двойные кавычки для строк



/*Примитивные типы Java не являются объектами. К ним относятся:

boolean - булев тип, может иметь значения true или false
byte - 8-разрядное целое число


char - 16-разрядное беззнаковое целое, представляющее собой символ UTF-16 (буквы и цифры)





 */