package ru.progwards.java1.lessons.basics;

//В этой задаче нужно будет реализовать функции, вычисляющих разные астрономические величины.
// Во всех функциях, где это необходимо, считаем число π = 3.14
public class Astronomy {

    final static Double pi = 3.14;


    //вычисляет площадь поверхности сферы радиуса R по формуле S = 4πR2
    public static Double sphereSquare(Double r) {

        double S= 4*pi*r*2;
        System.out.println(S);
        return S;
    }
    //площадь поверхности Земли, считая радиус равным 6 371.2 км и используют функцию sphereSquare
    public static Double earthSquare() {

        final Double er = 6371.2;
        System.out.println(er);

        return er;
    }

    //лощадь поверхности Меркурия, считая радиус равным 2 439,7 км  и используют функцию sphereSquare
    public static Double mercurySquare() {
        final Double er = 2439.7;
        System.out.println(er);
        return er;
    }
//площадь поверхности Юпитера, считая радиус равным 71 492 км  и используют функцию sphereSquare
    public static Double jupiterSquare(){
        final Double er = 71492.0;
        System.out.println(er);
        return er;

    }

    //public static Double earthVsMercury(), которая вычисляет отношение площади поверхности Земли к площади поверхности Меркурия используя готовые функции площадей планет
    public static void main(String[] args) {

    sphereSquare(5.0);
    sphereSquare(earthSquare());
    sphereSquare(mercurySquare());
    sphereSquare(jupiterSquare());

    }
}
