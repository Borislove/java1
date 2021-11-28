package ru.progwards.java1.lessons.arrays;

//Задача 2. Свой алгоритм сортировки, класс ArraySort

/*2.1 Реализовать метод, сортирующий произвольный массив целых чисел:
public static void sort(int[] a), по следующему алгоритму:
1. Берем первый элемент и сравниваем его со вторым, если второй меньше, меняем элементы в массиве местами.
2. Далее, сравниваем первый элемент с третьим, и если третий меньше, меняем их местами.
3. Так делаем для всех элементов с индексом больше первого
4. Берем второй элемент и сравниваем его с третьим, если нужно, меняем местам
5. Далее сравниваем второй элемент с четвертым, и если нужно, меняем местами.
6. Делаем так для всех элементов, с индексом больше 2-го
7. Переходим к элементу с индексом 3...
8. Обобщая, алгоритм звучит следующим образом - сделать 2 вложенных цикла, внешний по i и внутренний по j.
Внутренний цикл начинается от i+1, и если a[i] > a[j], то нужно поменять элементы a[i] и a[j] местами. */

import java.util.Arrays;

public class ArraySort {

    public static void sort(int[] a) {
        print("My array:");
        int lenght = a.length;

        for (int i = 0; i < lenght; i++) {
            for (int j = i + 1; j < lenght; j++) {
                if (max(a[i], a[j])) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        stringArray(a);
    }

    private static boolean max(int a, int b) {
        return a > b;
    }

    private static void sortArray(int[] a) {
        print("Arrays.sort:");
        Arrays.sort(a);
        stringArray(a);
    }

    private static void originalArray(int[] a) {
        print("Original arrays:");
        stringArray(a);
    }

    private static void stringArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }


    private static String print(String str) {
        return str;
    }

    public static void main(String[] args) {
        // ArraySort arraySort = new ArraySort();

        int[] array = {2, 3, 4, 5, -1, 99, 232, 33, 99, -9909};

        // originalArray(array);
        // sortArray(array);

        sort(array);
    }
}


