package ru.progwards.t6.T6_1;

//возврат массива функцией
public class ArrayFunction1 {

    public static int[] reverse(int[] originalArray) {
        int[] reversedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[originalArray.length - 1 - i] = originalArray[i];
        }
        return reversedArray;
    }
}
