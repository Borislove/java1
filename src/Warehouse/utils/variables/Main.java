package Warehouse.utils.variables;


import java.util.Scanner;

public class Main {

    // private static int verse = 1;

    public static void variables() {
        System.out.println("----------------------------");
        System.out.println("Long  - 3");
        System.out.println("Integer - 4");
        System.out.println("Short - 5");
        System.out.println("----------------------------");

        System.out.println("Типы с плавающей точкой");
        System.out.println("Float -  1");
        System.out.println("Double  - 2");
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {

        variables();
        while (true) {
            Scanner key = new Scanner(System.in);
            int verse = key.nextInt();

            //Float.Float();
            //Long.Long();
            //Double.Double();
            // Integer.Integer();
            // Short.Short();
            switch (verse) {
                case 1:
                    Float.Float();
                    break;
                case 2:
                    Double.Double();
                    break;
                case 3:
                    Long.Long();
                    break;
                case 4:
                    Integer.Integer();
                    break;
                case 5:
                    Short.Short();
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            variables();
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