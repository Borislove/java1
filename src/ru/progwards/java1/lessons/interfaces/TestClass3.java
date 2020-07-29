package ru.progwards.java1.lessons.interfaces;

/*3.8 Скопировать реализацию сортировки из класса ArraySort из задачи 2 урока 6
и переделать сортировку массива целых чисел на сортировку через интерфейс
CompareWeight public static void sort(CompareWeight[] a)
*/
public class TestClass3 {

    private double weight;

    public static void sort(CompareWeight[] a) {

        CompareWeight tmp;
        for (int i = 0, n = a.length; i < n-1; ++i) {
            for (int j = i+1; j < n; ++j) {
                if (a[i].compareWeight(a[j]) == CompareWeight.CompareResult.GREATER) {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
