package ru.progwards.java1.lessons.basics;

//что то намудрил...валидатор проверяй!
//будет время из дабл во флоат и немного сократить программку
// решаешь задачу, потом понимаешь что задача не решается ибо нужно не делить, а вычитать))


public class AccuracyDoubleFloat {

    // формула объема шара  V = 4/3 pi * R* R* R
     final static Double pi = 3.14;
     final static Double R = 6371.2;
     final static Float Rf = 6371.2f;
     final static Float pif = 3.14f;

     final static Double RRf =  R / Rf ;

          public static double volumeBallDouble(double radius){  // должно:  1.082759741481069E12
          double V = (double) 4/3 * pi * R * R *R ;
          System.out.println(V);
          return V;
        }

        public static float volumeBallFloat(float radius){   // должно: 1.08275990528E12

                float v = (float) 4/3 * pif * radius *radius*radius ;

            System.out.println(v);                      //1.08275991E12
                return v;
        }

        public static double calculateAccuracy(double radius){   //должно: -163798.93103027344

        //double difference = volumeBallDouble(R) - volumeBallFloat(Rf) ;

        double difference = volumeBallDouble(radius) -volumeBallFloat( (float)radius);
            System.out.println(difference);
            return difference;
        }
        public static void main(String[] args) {

         volumeBallDouble(R);
         volumeBallFloat(Rf);
         calculateAccuracy(volumeBallDouble(R) - volumeBallFloat(Rf));
    }
}
