package ru.progwards.java1.lessons.interfaces;


public class ArraySort implements Comparable<CompareWeight> {


    static CompareWeight.CompareResult a[] = {CompareWeight.CompareResult.EQUAL, CompareWeight.CompareResult.GREATER, CompareWeight.CompareResult.LESS};

    public static void sort(CompareWeight[] a) {

        Comparable item;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i].compareWeight(a[j])) {
                    item = (Comparable) a[i];
                    a[i] = a[j];
                    a[j] = (CompareWeight) item;
                }
            }
        }
    }


   /* public static void sort(int[] a) {
        int number = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    number = a[i];
                    a[i] = a[j];
                    a[j] = number;
                }
            }
        }
    }*/

    @Override
    public int compareTo(CompareWeight o) {
        return 0;
    }

}


