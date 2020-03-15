package ru.progwards.java1.lessons.basics;

// 15.03.2020

/*Проведём простое исследование типов double и float на разницу в точности.
 Посчитаем объём земли в кубических километрах двумя сходными функциями. Одна из них будет основана на типе double,
  а вторая на менее точном типе float.
  После чего мы сможем узнать разницу между этими значениями в кубических километрах. Радиус земли R будем считать равным 6371.2 км
   (для проверки работы методов используйте это значение), а число π возьмём равным 3.14
 */

//Формула объёма шара 4/3πR3.

/*
Подсказки:
вспомните, каким символом заканчиваются константы типа float в Java;
в функции calculateAccuracy для получения значения типа float из параметра типа double используйте конструкцию: (float) radius;
после создания функций для вычисления объёма проверьте результат на радиусе равном 1, если функция вернёт Pi, то думайте... .*/

public class AccuracyDoubleFloat {

    private static final double PI = 3.14;
    private static final float PIF = 3.14f;

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                        /*3.1 Реализовать функцию
                                    public static double volumeBallDouble(double radius),
                                    которая будет возвращать объём шара с радиусом radius и основана на типе double.*/
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static double volumeBallDouble(double radius) {
        return (double) 4 / 3 * PI * radius * radius * radius;   //  (double) 1.082759741481069E12
    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                    /*3.2 Реализовать функцию
                                    public static float volumeBallFloat(float radius),
                                    которая будет возвращать объём шара с радиусом radius и основана на типе float.*/
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static float volumeBallFloat(float radius) {
        return (float)4 / 3 * PIF * radius * radius * radius; //  1.08275990528E12
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                /*3.3 Реализовать функцию
                            public static double calculateAccuracy(double radius), которая будет возвращать разницу между функциями
                            volumeBallDouble и volumeBallFloat (они должны быть вызваны из неё с параметром radius).
                            */
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static double calculateAccuracy(double radius) {
        return volumeBallDouble(radius) - volumeBallFloat((float) radius);  //-163798.93103027344
    }
}

class Main {

    public static void main(String[] args) {

        System.out.println(AccuracyDoubleFloat.volumeBallDouble(6371.2));
        System.out.println(AccuracyDoubleFloat.volumeBallFloat(6371.2f));
        System.out.println(AccuracyDoubleFloat.calculateAccuracy(6371.2));
    }
}
