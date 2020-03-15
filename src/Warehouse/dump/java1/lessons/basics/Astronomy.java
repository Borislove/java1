package Warehouse.dump.java1.lessons.basics;

//jupiter = 71492 нужно сделать его в инт, потом в дабл...так работает , но не так ...ну и ладно
public class Astronomy {

    private final static Double pi = 3.14;
    final static Double earth = 6371.2;
    final static Double mercury = 2439.7;
    final static Double jupiter = 71492.0;

    public static Double sphereSquare(Double r) {
        double s = 4 * pi * r * r;
        return s;
    }

    public static Double earthSquare() {
        return sphereSquare(earth);
    }

    public static Double mercurySquare() {
        return sphereSquare(mercury);
    }

    public static Double jupiterSquare() {
        return sphereSquare(jupiter);
    }

    public static Double earthVsMercury() {
        double ea = earthSquare() / mercurySquare();
//        System.out.println(ea);
        return ea;
    }

    public static Double earthVsJupiter() {
        double ea = earthSquare() / jupiterSquare();
//        System.out.println(ea);
        return ea;
    }

    public static void main(String[] args) {

        //  earthSquare();
        //  mercurySquare();
        //  jupiterSquare();
        //  earthVsMercury();
        //  earthVsJupiter();
    }
}
