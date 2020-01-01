package ru.progwards.T6.T6_3;

import java.util.Arrays;
//Копирование массивов объектов Arrays.copyOf
//используем классы обертки
public class ArrayCopyOfObjects {
    public static void main(String[] args) {
        Integer[] arrayInt = {-7,5,0,58,-1};
        Integer[] arrayIntCopy = Arrays.copyOf(arrayInt,arrayInt.length);

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayIntCopy));

        arrayInt[0] = 55555;  //тут срабатывает автоупаковка и автораспаковка

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayIntCopy));
    }
}
