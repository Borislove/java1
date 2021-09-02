package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {

    ////////////////////////////////////////////////////////////////////////////////
    /*3.1 Реализовать функцию
    public static double volumeBallDouble(double radius),
    которая будет возвращать объём шара с радиусом radius и основана на типе double.*/
    public static double volumeBallDouble(double radius) {
        return (double) 4 / 3 * 3.14 * radius * radius * radius;
    }
    ////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////
    /*3.2 Реализовать функцию
    public static float volumeBallFloat(float radius),
    которая будет возвращать объём шара с радиусом radius и основана на типе float.*/
    public static float volumeBallFloat(float radius) {
        return (float) 4 / 3 * 3.14f * radius * radius * radius;
    }
    ////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////
    /*3.3 Реализовать функцию
    public static double calculateAccuracy(double radius),
     которая будет возвращать разницу между функциями volumeBallDouble и volumeBallFloat
      (они должны быть вызваны из неё с параметром radius).*/
    public static double calculateAccuracy(double radius) {
        return volumeBallDouble(radius) - volumeBallFloat((float) radius);
    }
    ////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        System.out.println(AccuracyDoubleFloat.volumeBallDouble(6371.2));
        System.out.println(AccuracyDoubleFloat.volumeBallFloat(6371.2f));
        System.out.println(AccuracyDoubleFloat.calculateAccuracy(6371.2));
    }
}
