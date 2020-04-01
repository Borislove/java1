package ru.progwards.java1.lessons.arrays;
/*

import java.util.Arrays;

//Реализовать динамический, саморастущий массив целых чисел.
public class DIntArray {

    //3.1 в классе разместить private переменную - массив целых чисел.
    private int[] array = {77, -83, -77, -93, 36, -46, -65, 13, -84, -51, -7, -71, -31, 11, 19};

    //3.2 конструктор - по умолчанию.

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    */
/*3.2 метод
    public void add(int num) - добавляет элемент num в конец массива,
    при этом размер массива должен увеличиться на 1.
    Для этого нужно будет разместить новый массив нужного размера,
     скопировать в него старый, и добавить в хвост элемент num.*//*

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void add(int num) {

        int arrayCopy[] = new int[array.length + 1];
        System.arraycopy(array, 0, arrayCopy, 0, array.length);
        arrayCopy[array.length] = num;
        array = arrayCopy;
        System.out.println(Arrays.toString(array));
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    */
/*3.3 метод
    public void atInsert(int pos, int num) - добавляет элемент num в позицию pos
    массива, при этом размер массива должен увеличиться на 1.
    Для этого нужно будет разместить новый массив нужного размера,
     скопировать в него старый, c учетом того, что новый элемент
    окажется где-то в середине, и потом положить в нужный индекс элемент num.*//*

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void atInsert(int pos, int num) {

        int[] arrayCopy = new int[array.length + 1];
        System.arraycopy(array, pos, arrayCopy, pos + 1, array.length - pos);
        arrayCopy[pos] = num;
        array = arrayCopy;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    */
/*3.4 метод
    public void atDelete(int pos) - удаляет элемент в позиции pos массива, при этом размер
     массива должен уменьшиться на 1. Для этого нужно будет разместить новый массив нужного размера, скопировать в него
     старый, уже без элемента, который был в позиции pos.*//*

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void atDelete(int pos) {

        int[] arrayCopy = new int[array.length - 1];
        System.arraycopy(array, pos + 1, arrayCopy, pos, array.length - pos - 1);
        array = arrayCopy;
        System.out.println(Arrays.toString(array));
    }

    /////////////////////////////////////////////////////////////////////////
    */
/*3.5 метод
    public int at(int pos) - возвращает элемент по индексу pos.*//*

    public int at(int pos) {
        return pos;
    }

    public static void main(String[] args) {
        DIntArray dIntArray = new DIntArray();
        dIntArray.add(13);
        dIntArray.atDelete(12);
    }
}
*/


public class DIntArray {

    private int[] nums = {};

    public void add(int num) {
        int[] nums1 = new int[nums.length + 1];
        System.arraycopy(nums, 0, nums1, 0, nums.length);
        nums1[nums.length] = num;
        nums = nums1;
    }

    public void atInsert(int pos, int num) {
        int[] nums1 = new int[nums.length + 1];
        System.arraycopy(nums, pos, nums1, pos + 1, nums.length - pos);
        nums1[pos] = num;
        nums = nums1;
    }

    public void atDelete(int pos) {
        int[] nums1 = new int[nums.length - 1];
        System.arraycopy(nums, pos + 1, nums1, pos, nums.length - pos - 1);
        nums = nums1;
    }

    public int at(int pos) {
        return nums[pos];
    }
}
