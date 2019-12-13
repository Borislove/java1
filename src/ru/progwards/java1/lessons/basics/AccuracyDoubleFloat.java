package ru.progwards.java1.lessons.basics;

//что то намудрил...валидатор проверяй!
public class AccuracyDoubleFloat {

    // формула объема шара  V = 4/3 pi * R* R* R
     final static Double pi = 3.14;
     final static Double R = 6371.2;
     final static Float Rf = 6371.2f;
     final static Float pif = 3.14f;

          public static double volumeBallDouble(double radius){  // должно:  1.082759741481069E12
          double V = (double) 4/3 * pi * R * R *R ;
          System.out.println(V);
          return V;
        }

        public static float volumeBallFloat(float radius){   // должно: 1.08275990528E12

                float vbf = (float) 4/3 * pif * Rf * Rf *Rf;
                double vbf1 = (double)vbf;
                System.out.println(vbf1);
                return vbf;
        }
        

     /*   public static double calculateAccuracy(double radius){   //должно: -163798.93103027344
                } */
        public static void main(String[] args) {

         volumeBallDouble(R);
         volumeBallFloat(Rf);
    }
}
