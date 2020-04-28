package ru.progwards.java1.lessons.interfaces;

//3.8 Скопировать реализацию сортировки из
// класса ArraySort из задачи 2 урока 6 и переделать сортировку массива
// целых чисел на сортировку через интерфейс CompareWeight public static void sort(CompareWeight[] a)

public abstract class ArraySort implements Comparable<CompareWeight> {

    /*public static void sort(int[] a) {
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
}


