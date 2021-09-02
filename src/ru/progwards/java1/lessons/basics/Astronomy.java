package ru.progwards.java1.lessons.basics;

//v3
public class Astronomy {

    private static enum Constants {
        ;
        private static final double EARTH_RADIUS = 6371.2;
        private static final double MERCURY_RADIUS = 2439.7;
        private static final double JUPITER_RADIUS = 71492;
        private static final double PI = 3.14;
    }

    ////////////////////////////////////////////////////////////////////////////////
    /* 2.1 Реализовать функцию
    public static Double sphereSquare(Double r),
     которая вычисляет площадь поверхности сферы радиуса R по формуле S = 4πR2.*/
    public static Double sphereSquare(Double r) {
        return 4 * Constants.PI * SquareNumber(r);
    }
    ////////////////////////////////////////////////////////////////////////////////

    ////////////Квадрат числа/////////////
    public static Double SquareNumber(Double r) {
        return r * r;
    }

    ////////////////////////////////////////////////////////////////////////////////
    /* 2.2 Реализовать функцию
    public static Double earthSquare(), которая вычисляет площадь поверхности Земли,
    считая радиус равным 6 371.2 км и используют функцию sphereSquare*/
    ////////////////////////////////////////////////////////////////////////////////
    public static Double earthSquare() {
        return sphereSquare(Constants.EARTH_RADIUS);
    }

    ////////////////////////////////////////////////////////////////////////////////
    /*2.3 Реализовать функцию
    public static Double mercurySquare(), которая вычисляет площадь поверхности Меркурия,
    считая радиус равным 2 439,7 км  и используют функцию sphereSquare*/
    public static Double mercurySquare() {
        return sphereSquare(Constants.MERCURY_RADIUS);
    }
    ////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////
    /* 2.4 Реализовать функцию
    public static Double jupiterSquare(), которая вычисляет площадь поверхности Юпитера,
    считая радиус равным 71 492 км  и используют функцию sphereSquare*/
    public static Double jupiterSquare() {
        return sphereSquare(Constants.JUPITER_RADIUS);
    }
    ////////////////////////////////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////////////////////////////
    /*2.5 Реализовать функцию
    public static Double earthVsMercury(),
    которая вычисляет отношение площади поверхности Земли
    к площади поверхности Меркурия используя готовые функции площадей планет*/
    public static Double earthVsMercury() {
        return earthSquare() / mercurySquare();
    }
    ////////////////////////////////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////////////////////////////
    /* 2.6 Реализовать функцию
    public static Double earthVsJupiter(),
    которая вычисляет отношение площади поверхности Земли
     к площади поверхности Юпитера используя готовые функции площадей планет*/
    public static Double earthVsJupiter() {
        return earthSquare() / jupiterSquare();
    }
    ////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
    }
}
