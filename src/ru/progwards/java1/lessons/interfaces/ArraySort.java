package ru.progwards.java1.lessons.interfaces;

//3.8 Скопировать реализацию сортировки из
// класса ArraySort из задачи 2 урока 6 и переделать сортировку массива
// целых чисел на сортировку через интерфейс CompareWeight public static void sort(CompareWeight[] a)

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {

    public static void main(String[] args) {

         CompareWeight[] a = {new Animal(200.5), new Animal(10.3), new Animal(300.0)};
           Arrays.sort(a);
          System.out.println(Arrays.toString(a));
/*
        Animal ad0 = new Animal(30);
        Animal ad1 = new Animal(30);
        Animal ad2 = new Animal(30);
        Animal ad3 = new Animal(30);

        CompareWeight[] a = {ad0, ad1, ad2, ad3};

        Arrays.sort(a);*/
    }
}

    /*

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
*/



