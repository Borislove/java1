package Warehouse.dump.java1.lessons.compare_if_cycles;


public class CyclesGoldenFibo {

    public static Integer iter = 1;

    public static double gold = 1.61803;  // основание золотого треугольника


    //OK: Тест "Тест containsDigit с нулями" пройден успешно.
    public static boolean containsDigit(int number, int digit) {  //число и цифра

        if (number < 0) {
            number *= -1;
        }

        do {
            int n = number % 10;
            if (n == digit) {
                return true;
            }
            number = number / 10;
        }
        while (number > 0);

        return false;
    }

    //if (digit >= 0 && digit <= 9) {
    // System.out.println("Число = " + number + " Цифра = " + digit);

    //    OK: Тест "Тест fiboNumber" пройден успешно.
    public static int fiboNumber(int n) {

        if (n == 1 || n == 2)
            return 1;

        int a = 1;
        int b = 0;
        int fibo = 0;

        for (int i = 0; i < n; i++) {
            fibo = a + b;
            a = b;
            b = fibo;
            //   System.out.println("Iteration #"+(iter)+" "+"#a = "+ a+" #b = "+b +"#FIBO = "+ fibo);   //
            iter++;
            System.out.println(fibo);
        }
        return fibo;
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {

        boolean gold = false; //default false;

        double value1 = 1.61703;
        double value2 = 1.61903;

        double a1 = (double) a;
        double b1 = (double) b;
        double c1 = (double) c;

        double ab = a1 / c1;
        double ac = a1 / b1;
        double bc = b1 / a1;

        //--------
/*
        double ab  = a / b;
        double ac = a / c;
        double bc = b / c;*/

        if (a == b) {
            if (ab > value1 && ab < value2) {
                System.out.println("Золотой треугольник!" + a + " " + b + " " + c);
                gold = true;
            }
        }

        if (a == c) {
            if (ac > value1 && ac < value2) {
                System.out.println("Золотой треугольник!" + a + " " + b + " " + c);
                gold = true;
            }
        }

        if (b == c) {
            if (bc > value1 && bc < value2) {
                System.out.println("Золотой треугольник!" + a + " " + b + " " + c);
                gold = true;
            }
        }


        return gold;
    }

    public static void main(String[] args) {
        containsDigit(2, 0);
        containsDigit(3, -2);
        containsDigit(-3, 10);
        containsDigit(23123, 9);
        //  containsDigit(32,32);
        //  containsDigit(32,31);
        fiboNumber(15);
        //  fiboNumber(10);


        System.out.println(isGoldenTriangle(23, 23, 59));
        System.out.println(isGoldenTriangle(89, 55, 89)); // золотой


        //-------------------------------------
       /* for (int i = 0; i <= 100 ; i++) {
           if (TriangleSimpleInfo1.isTriangle(a,b,c) && TriangleSimpleInfo1.isIsoscelesTriangle(a,b,c)){
               //System.out.println(150+" "+150+" "+300);
               System.out.println(a+" "+b+" "+c);
           }*/

      /*  for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                for (int k = 1; k <= 100; k++) {
                    if (TriangleInfo.isTriangle(i, j, k) && TriangleInfo.isIsoscelesTriangle(i, j, k) && isGoldenTriangle(i, j, k)) {
                        System.out.println(i + " " + j + " " + k);
                    }

                }
            }
        }*/
    }
}

