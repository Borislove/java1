package ru.progwards.Test;

/*Реализуйте функцию, возвращающую максимальный по значению элемент массива. Если в массиве 0 элементов, вернуть 0. Сигнатура функции

public int arrayMax(int[] a)

Подсказка - для быстрой реализации удобно использовать функцию Arrays.sort()*/

public class Arrays {

    public int arrayMax(int[] a) {


        //почти
        for (int value : a) {
            int[] abc = new int[a.length];
            java.util.Arrays.sort(abc);
            //abc[0] = abc[a.length - 1];
            int max = abc[a.length-1];
            return max;
        }
        return 0;
    }


   /*     int[] abc = new int[a.length];
        java.util.Arrays.sort(abc);
        abc[0] = abc[a.length - 1];
        String str = abc.toString();
        System.out.println(str);
        int max = Integer.valueOf(abc[0]);
        System.out.println(max);
        //return abc[0];
        return max;


    }*/


    public static void main(String[] args) {

        int[] a = {1, 1, 3, 5, 5};

    }
}


/*int[] a = {1, 1, 3, 5, 5};
int max = arrayMax(a);
5
[I@6ff3c5b5
0
int[] a = {99, 1, 3, 5, 77};
int max = arrayMax(a);
99
[I@6ff3c5b5
0
int[] a = {1};
int max = arrayMax(a);
1
[I@6ff3c5b5
0
int[] a = {};
int max = arrayMax(a);
0
***Error***
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0
        at __tester__.arrayMax(__tester__.java:8)
        at __tester__.runTests(__tester__.java:24)
        at __tester__.main(__tester__.java:18)
        */