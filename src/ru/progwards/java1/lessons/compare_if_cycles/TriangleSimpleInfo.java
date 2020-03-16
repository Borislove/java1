package ru.progwards.java1.lessons.compare_if_cycles;

// 16.03.2020

class TriangleSimpleInfo {
    /*
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    1.1 Реализовать функцию
    public static int maxSide(int a, int b, int c), которая получает параметрами длины сторон треугольника,
    а вернуть должна наибольшую длину стороны.
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    */
    public static int maxSide(int a, int b, int c) {

        String str = "Наибольшая сторона: ";

        System.out.println("Треугольник со сторонами:" + " А = " + a + ", B = " + b + ", C = " + c);
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("Одна из сторон не может быть 0");
            System.out.println("A = " + a + " B = " + b + " C =" + c);
            System.exit(1);
        }
        //-----------------------------------------------
        if (a > b && a > c) {
            System.out.print(str);
            System.out.println("А = " + a);
            return a;
        }
        //-----------------------------------------------
        if (b > a && b > c) {
            System.out.print(str);
            System.out.println("B = " + b);
            return b;
        }
        //------------------------------------------------
        if (c > a && c > b) {
            System.out.print(str);
            System.out.println("C = " + c);
            return c;
        } else {
            return 0;
        }
    }

    /*
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    1.2 Реализовать функцию
    public static int minSide(int a, int b, int c), которая получает параметрами длины сторон треугольника,
    а вернуть должна наименьшую длину стороны.
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    */
    public static int minSide(int a, int b, int c) {

        String str = "Наименьшая сторона: ";

        System.out.println("Треугольник со сторонами:" + " А = " + a + ", B = " + b + ", C = " + c);
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("Одна из сторон не может быть 0");
            System.out.println("A = " + a + " B = " + b + " C =" + c);
            System.exit(1);
        }
        //-----------------------------------------------
        if (a < b && a < c) {
            System.out.print(str);
            System.out.println("А = " + a);
            return a;
        }
        //-----------------------------------------------
        if (b < a && b < c) {
            System.out.print(str);
            System.out.println("B = " + b);
            return b;
        }
        //------------------------------------------------
        if (c < a && c < b) {
            System.out.print(str);
            System.out.println("C = " + c);
            return c;
        } else {
            return 0;
        }
    }


    /*
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    1.3 Реализовать функцию
    public static boolean isEquilateralTriangle(int a, int b, int c), которая получает параметрами длины сторон треугольника,
    а вернуть должна true, если треугольник равносторонний и false в противном случае.
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     */
    public static boolean isEquilateralTriangle(int a, int b, int c) {

        if (a == 0 || b == 0 || c == 0) {
            System.out.println("0");
            return false;
        }

        String str = "Равносторонний";
        if (a == b && a == c && c == b) {
            System.out.println(str);
        }
        return false;
    }

    public static void main(String[] args) {
        //    maxSide(2,3,4);
        //   maxSide(0, 2, 6);
        // maxSide(2,0,3);
        // maxSide(3, 2, 0);
        maxSide(33, 22, 31);
        System.out.println();
        minSide(33, 22, 31);
        isEquilateralTriangle(2, 2, 5);
        isEquilateralTriangle(0, 2, 3);
        isEquilateralTriangle(2, 2, 2);
    }
}
