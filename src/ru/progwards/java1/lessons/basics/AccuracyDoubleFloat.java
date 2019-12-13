package ru.progwards.java1.lessons.basics;

//что то намудрил...валидатор проверяй!
public class AccuracyDoubleFloat {

    // формула объема шара  V = 4/3 pi * R* R* R
    final static Double pi = 3.14;
     final static Double R = 6371.2;
     final static Float Rf = 6371.2f;
     final static Float pif = 3.14f;
     final static Double R3 = (double) (R / Rf);

        public static double volumeBallDouble(double radius){  // должно:  1.082759741481069E12
          double V = (double) 4/3 * pi * R * R *R ;            //получено: 1.082759741481069E12
         System.out.println(V);
           //float Vi = (float)V;
            // System.out.println(Vi);
            return V;
        }

        public static float volumeBallFloat(float radius){    // должно: 1.08275990528E12

                       float vbf = (float) 4/3 * pif * Rf * Rf *Rf;     //  1.08275991E12
                double vbf1 = (double)vbf;         //НУЖНО БЫЛО В ДАБЛ!!!  /1.08275990528E12
          // float vbf = 4/3 *pif * Rf *Rf*Rf;                // 8.1206988E11
          //   float R =  (Rf * Rf * Rf);
          //    float V = (float)(4/3 * pi * R * R *R);
            //float vbf =  (float)4/(float)3 * pif * Rf * Rf* Rf ;   //1.08275991E12
          //  System.out.println(vbf);
            //return vbf;
            //float V = (float) (4/3 * pi * R * R *R);     //8.1206981E11
           // float V = (float)(volumeBallDouble(Rf));      //1.08275977E12
            //float V = (float)4/3 * pif * Rf * Rf *Rf ;
            //float V = (float)volumeBallDouble(Rf);
            //double V = (float)(volumeBallDouble(Rf));  //1.082759774208E12  //
            //float Vi = (float)V;
          // float vbf =  (float)4/(float)3 * pif * Rf * Rf* Rf;
            //System.out.println(Vi);
          // System.out.println(vbf);
            System.out.println(vbf1);
           return vbf;

        }

        public static double calculateAccuracy(double radius){

         //   double R3 = (double) (R / Rf);
            double R3t = (double) 4/3 * pi * R3 * R3 *R3;

          System.out.println(R3);
           return R3t;

        }
        public static void main(String[] args) {

           // sVolume();
         volumeBallDouble(R);
           volumeBallFloat(Rf);
         //   volumeBallFloat(R.floatValue());
         //   calculateAccuracy(volumeBallDouble(R) / volumeBallFloat(Rf.floatValue()));
          //  calculateAccuracy(volumeBallDouble(R) / volumeBallFloat(Rf));
            calculateAccuracy(R3);


    }


}
