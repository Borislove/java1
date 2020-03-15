package Warehouse.dump.java1.lessons.basics;

// TODO: 25.12.2019 исправлена переменная , исправлен радиус 
public class AccuracyDoubleFloat {

    // формула объема шара  V = 4/3 pi * R* R* R
    private final static Double pi = 3.14;
    private final static Float pif = 3.14f;

    public static double volumeBallDouble(double radius) {  // должно:  1.082759741481069E12
        double v = (double) 4 / 3 * pi * radius * radius * radius;  //1.082759741481069E12  тут округление через константу
        System.out.println(v);
        System.out.println("v " + v);

        double db = (double) 4 / 3 * Math.PI * radius * radius * radius;  //1.0833089329425829E12
        System.out.println("db " + db);
        return v;
    }

    public static float volumeBallFloat(float radius) {   // должно: 1.08275990528E12

        float v = (float) 4 / 3 * pif * radius * radius * radius;
        System.out.println(v);                      //1.08275991E12
        return v;
    }

    public static double calculateAccuracy(double radius) {   //должно: -163798.93103027344

        double difference = volumeBallDouble(radius) - volumeBallFloat((float) radius);
        System.out.println(difference);
        return difference;
    }

    public static void main(String[] args) {

        volumeBallDouble(6371.2);
        volumeBallFloat(6371.2f);
        calculateAccuracy(volumeBallDouble(6371.2) - volumeBallFloat(6371.2f));
    }
}
