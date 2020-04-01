package Warehouse;

import java.util.Arrays;

//добавляет в массив число
public class Test9 {

    private static int[] array = {};

    public static void add(int num) {

        int arrayCopy[] = new int[array.length + 1];
        System.arraycopy(array, 0, arrayCopy, 0, array.length);
        arrayCopy[array.length] = num;
        array = arrayCopy;

        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        add(2);
        add(22);
        add(2312);
    }
}
