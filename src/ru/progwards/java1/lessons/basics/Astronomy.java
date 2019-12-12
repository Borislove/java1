package ru.progwards.java1.lessons.basics;
//В этой задаче нужно будет реализовать функции, вычисляющих разные астрономические величины.
// Во всех функциях, где это необходимо, считаем число π = 3.14
public class Astronomy {

    final static Double pi = 3.14;


    //вычисляет площадь поверхности сферы радиуса R по формуле S = 4πR2
    public static Double sphereSquare(Double r) {
        double S= 4*pi*r*r;
     //   System.out.println(S);
        return S;
    }
    public static Double earthSquare(){
        double earth = 6371.2;
        sphereSquare(earth);
       System.out.println("Площадь поверхности Земли = "+ sphereSquare(earth));
     //  long le = sphereSquare(earth).longValue();
     //   System.out.println(le);
        return sphereSquare(earth);
    }

    public static Double mercurySquare(){
        double mercury = 2439.7;
      sphereSquare(mercury);
       System.out.println("Площадь поверхности Меркурия = "+ sphereSquare(mercury));
     // long le = sphereSquare(mercury).longValue();
    //  System.out.println(le);
        return null;
    }

    public static Double jupiterSquare(){
        double jupiter = 71492;
        sphereSquare(jupiter);
       System.out.println("Площадь поверхности Юпитера = "+ sphereSquare(jupiter));
   //    long le = sphereSquare(jupiter).longValue();
   //    System.out.println(le);
        return sphereSquare(jupiter);
    }

    public static Double earthVsMercury(){

     //   double vs =  mercurySquare()*2 ;
   //   double earthVsMercury = earthSquare() / mercurySquare();
        double earthVsMercury = mercurySquare() / earthSquare();
        //long le = earthVsMercury(earthSquare()).longValue() / e;

       // long les = earthSquare().longValue() / mercurySquare().longValue();
      System.out.println("отношение площади поверхности Земли к площади поверхности Меркурия = "+ earthVsMercury);
        //Long le = (earthSquare()) / (mercurySquare());
    //    return earthVsMercury;

        return earthVsMercury;
    }

    /*public static Double earthVsJupiter(){
        double earthVsJupiter = (earthSquare()/jupiterSquare());
        System.out.println("отношение площади поверхности Земли к площади поверхности Юпитера = " +earthVsJupiter);
        return null;
    } */


    public static Double earthVsJupiter(){

    /*double ear = jupiterSquare().doubleValue() /earthSquare().doubleValue() ;
    long ears = jupiterSquare().longValue() / earthSquare().longValue();
        System.out.println(ear);
    */return null;
    }

    public static void main(String[] args) {

    //sphereSquare(2.0);

earthSquare();
mercurySquare();
jupiterSquare();

//earthVsMercury();
//earthVsJupiter();
    }
}
