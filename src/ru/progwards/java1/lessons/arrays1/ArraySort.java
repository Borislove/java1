package ru.progwards.java1.lessons.arrays1;

import java.util.Arrays;

/*
2.1 Реализовать метод, сортирующий произвольный массив целых чисел:
public static void sort(int[] a), по следующему алгоритму:
        1. Берем первый элемент и сравниваем его со вторым, если второй меньше, меняем элементы в массиве местами.
        2. Далее, сравниваем первый элемент с третьим, и если третий меньше, меняем их местами.
        3. Так делаем для всех элементов с индексом больше первого
        4. Берем второй элемент и сравниваем его с третьим, если нужно, меняем местам
        5. Далее сравниваем второй элемент с четвертым, и если нужно, меняем местами.
        6. Делаем так для всех элементов, с индексом больше 2-го
        7. Переходим к элементу с индексом 3...
        8. Обобщая, алгоритм звучит следующим образом - сделать 2 вложенных цикла, внешний по i и внутренний по j.
        Внутренний цикл начинается от i+1, и если a[i] > a[j], то нужно поменять элементы a[i] и a[j] местами.
*/
public class ArraySort {

    /*
    int n ;   //произвольные числа
    int[] a = {n};
    int[] b = {n};*/

    //public static int[]a = {1,2,3,4,5,6,7,8,9};
    //public static int[]a = {9,8,7,6,5,4,3,2,1};

    public static int[]a = {50,-35,-12,45,-45,-94,-76};

    public static void sort (int[]a) {

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

       /* if(a[0] > a[1]) {
          a[0] = a[1];
            System.out.println(Arrays.toString(a));
        }
        if(a[1] > a[3]) {
            a[1] = a[3];
            System.out.println(Arrays.toString(a));
        }
        if(a[2] >= a[3]){
         a[2]=a[3];
            System.out.println(Arrays.toString(a));
        }
        if(a[2] >= a[4]){
            a[2]=a[4];
            System.out.println(Arrays.toString(a));
        }
        for (int i1 = 0; i1 < a.length; i1++) {
            if (a[2] >= a[i1]) {
                a[2] = a[i1];
                System.out.println(Arrays.toString(a));
            }
        }

        for (int i = 0; i < a.length; i++) {
            if(a[1]>a[i]) {
                a[1]=a[i];
                System.out.println(Arrays.toString(a));
            }

        }*/

    }

    public static void main(String[] args) {
sort(a);

    }
}
