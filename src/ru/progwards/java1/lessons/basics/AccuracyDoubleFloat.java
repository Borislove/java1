package ru.progwards.java1.lessons.basics;

//что то намудрил...валидатор проверяй!
public class AccuracyDoubleFloat {

    // формула объема шара  V = 4/3 pi * R* R* R
    final static Double pi = 3.14;
    final static Double R = 6371.2;


        public static double volumeBallDouble(double radius){
          double V = 4/3 * pi * R * R *R ;
          //  System.out.println(V);
            return V;
        }

        public static float volumeBallFloat(float radius){
            float V = (float)(4/3 * pi * R * R *R);
          //  System.out.println(V);
            return V;

        }

        public static double calculateAccuracy(double radius){
           double razn = (double) (volumeBallDouble(R)) / (volumeBallFloat(R.floatValue()));
           razn = 4/3 * pi * razn * razn * razn ;

           //double a = volumeBallFloat(V);
           System.out.println(razn);
            return razn;
        }
        public static void main(String[] args) {

           // sVolume();
          //volumeBallDouble(6371.2);
          //volumeBallFloat(R.floatValue());
         //   volumeBallFloat(R.floatValue());
            //calculateAccuracy(volumeBallDouble(R) / volumeBallFloat(R.floatValue()));
    }


}
