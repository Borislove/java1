package ru.progwards.java1.lessons.compare_if_cycles;


public class CyclesGoldenFibo {
    public static  Integer iter= 1;


    public static double gold = 1.61803;  // основание золотого треугольника


    //OK: Тест "Тест containsDigit с нулями" пройден успешно.
   public static boolean containsDigit(int number, int digit) {
        if (number == digit) {
            System.out.println("true");
            return true;}
       return false;
   }

    public static int fiboNumber(int n) {

        int a = 1;
        int b = 0;
        int fibo ;

        for (int i = 0; i < n ; i++) {
            fibo = a+b;
            a = b;
            b = fibo;
            System.out.println("Iteration #"+(iter)+" "+"#a = "+ a+" #b = "+b +"#FIBO = "+ fibo);   //
            iter++;
        }
        return 0;
    }

    public static boolean isGoldenTriangle(int a, int b, int c){

    double a1 = 1.61703d;
    double a2 = 1.61903d;
    boolean gold;

       //if(a,b,c == gold) {
       //    return true;
        //}

       return false;
    }


    public static void main(String[] args) {
        containsDigit(32,32);
        containsDigit(32,31);
        fiboNumber(15);
      //  fiboNumber(10);

    }
}
