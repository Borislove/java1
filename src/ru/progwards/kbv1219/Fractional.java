package ru.progwards.kbv1219;

/*
* Напишите метод, который возвращает дробную часть числа. Сигнатура метода static double fractional(double num)

Например fractional(1.53) должен выдать 0.53
 */
public class Fractional {

    //static double num;
    static double fractional(double num) {

     //Integer value = new Integer((int) num);


     /*   int value = (int)num;  //сократил
     double number = num - value;
       System.out.println(number);
       return number; */


        //System.out.println(num);
       //return new Integer((int)num)  ;

        //вариант 2
        /*
         num = num - (int)num %(100) ;
        System.out.println(num);
        return num ; */

        //упрощенный вариант 2
        return num - num %(100) ;
    }

     public static void main(String[] args) {

        fractional(0.0);
        fractional(1.0);
        fractional(1.53);
        fractional(98.45);

    }
}
