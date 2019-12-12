package ru.progwards.java1.lessons.basics;

public class Astronomy {

    final static Double pi = 3.14;
    final static Double earth = 6371.2;
    final static Double mercury = 2439.7;
    final static Double jupiter = 71492.0;

    public static Double sphereSquare(Double r) {
        double S= 4*pi*r*r;
        return S;
    }
    public static Double earthSquare(){
        double eartS = sphereSquare(earth);
        System.out.println("S Земли = "+ sphereSquare(earth));
        return null;
    }

    public static Double mercurySquare(){
        double eartS = sphereSquare(mercury);
     System.out.println("S Меркурия = "+ sphereSquare(mercury));
         return null;
    }

    public static Double jupiterSquare(){
        double eartS = sphereSquare(jupiter);
        System.out.println("S Юпитера = "+ sphereSquare(jupiter));
        return null;
    }

    public static Double earthVsMercury(){
        double ea = earth / mercury ;
        ea = sphereSquare(ea);
        System.out.println(ea);
        return ea;
    }

    public static Double earthVsJupiter(){
        double ea = earth / jupiter ;
        ea = sphereSquare(ea);
        System.out.println(ea);
        return null;
    }

    public static void main(String[] args) {

    earthSquare();
    mercurySquare();
    jupiterSquare();
    earthVsMercury();
    earthVsJupiter();

    }
}
