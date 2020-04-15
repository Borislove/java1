package ru.progwards.java1.lessons.interfaces;

public class ArraySort {

    public static void sort(CompareWeight[] a){

    }

    public static void sort(int[] a) {
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
    }
}


