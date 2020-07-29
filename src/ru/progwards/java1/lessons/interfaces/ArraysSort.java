package ru.progwards.java1.lessons.interfaces;

/*3.8 Скопировать реализацию сортировки из класса ArraySort из задачи 2 урока 6
и переделать сортировку массива целых чисел на сортировку через интерфейс
CompareWeight public static void sort(CompareWeight[] a)
*/
public class ArraysSort implements CompareWeight {

    private double weight;

    public static void sort(CompareWeight[] a) {

     /*   for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
             *//*   if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }*//*
            }
        }
    }*/



        CompareWeight tmp;
        for (int i = 0, n = a.length; i < n-1; ++i) {
            for (int j = i+1; j < n; ++j) {
                if (a[i].compareWeight(a[j]) == CompareResult.GREATER) {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }


    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt) {
        return null;
    }

    public static void main(String[] args) {

    }
}
