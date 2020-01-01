package ru.progwards.T6.T6_3;

import java.util.Arrays;

//Arrays.fill  заполнить массив значениями
public class ArraysFill {
    public static void main(String[] args) {

        int[] arrayInt = new int[5];
        System.out.println(Arrays.toString(arrayInt));

        Arrays.fill(arrayInt,-1);
        System.out.println(Arrays.toString(arrayInt));

    }
}
