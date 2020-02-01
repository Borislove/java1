package ru.progwards.t6.T6_3;

import java.util.Arrays;

//сортировка через Arrays.sort()
public class ArraysSort {

    public static void main(String[] args) {

        int[] arrayInt = {-7,5,0,58,-1};
        System.out.println("Массив до сортировки: " + Arrays.toString(arrayInt));

        Arrays.sort(arrayInt);
        System.out.println("Массив после сортировки: "+Arrays.toString(arrayInt));
    }
}
