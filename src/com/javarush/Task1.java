//-----------------ИМЯ ПАКЕТА---------------------
package com.javarush;

//import java.io.IOExсeption;

/**
 * User: General
 * Date: 12/21/12
 * Time: 11:59
 */

//------------------ИМЯ КЛАССА--------------------
public class Task1 {

    private static String TEXT = "Kiss my metal shiny ass"; // ПЕРЕМЕННАЯ КЛАССА

    public static void main(String[] args) {        //throws IOExсeption  зачем оно тут надо было?
        //ВЫВОД ТЕКСТА НА ЭКРАН        // ОДНОСТРОЧНЫЙ КОММЕНТАРИЙ
        System.out.println(TEXT);     //Выведет на экран одну строку
        //МНОГОСТРОЧНЫЙ КОММЕНТАРИЙ

        /*
        Это многострочный комментарий.
        Код ниже выведет на экран три одинаковые строчки.
       */

        //ОБЪЯВЛЕНИЕ ПЕРЕМЕННОЙ
        String s = "Ho-ho-ho!";
        //ВЫЗОВ МЕТОДА
        printTextMoreTimes(s, 3);
    }

                                            //АРГУМЕНТЫ МЕТОДА
    public static void printTextMoreTimes(String s, int count) {

            //  ЦИКЛ
            for (int i = 0; i < count; i++) {
                //ТЕЛО ЦИКЛА
                System.out.println(s);
            }
        }
    }



