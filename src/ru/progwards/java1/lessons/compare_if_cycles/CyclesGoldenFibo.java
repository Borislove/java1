package ru.progwards.java1.lessons.compare_if_cycles;
public class CyclesGoldenFibo {

   public static boolean containsDigit(int number, int digit) {

        if (number == digit) {
            System.out.println("true");
            return true;}
       return false;
   }

    public static int fiboNumber(int n) {

        int fibo;
        int a = 1;
        int b = 0;

        for (int i = 0; i < n; i++) {
            fibo = a + b;
            a = b;
            b = fibo;
            System.out.println("Fibo = " + fibo);
            //continue;

        }
        return 0;
    }

    public static boolean isGoldenTriangle(int a, int b, int c){

       return false;
    }


    public static void main(String[] args) {
        containsDigit(32,32);
        containsDigit(32,31);
        fiboNumber(5);
        fiboNumber(10);
    }
}
