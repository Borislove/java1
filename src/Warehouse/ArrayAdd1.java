package Warehouse;

import java.util.Arrays;

//меняет последний индекс в массиве на 1
public class ArrayAdd1 {

    private int[] array;

    private static int[] arrayAdd = {2, 2, 3, 4, 5, 6};


    public ArrayAdd1(int[] array) {
        this.array = array;
    }


    public void add(int num) {

        int arrayNum[] = new int[array.length + 1];
        System.arraycopy(array, 0, arrayAdd, 0, arrayAdd.length);
        for (int i = 0; i < array.length; i++) {
            arrayAdd[i] += num;
        }
    }

    public static void main(String[] args) {


        ArrayAdd1 arrayAdd1 = new ArrayAdd1(arrayAdd);
        arrayAdd1.add(1);
        System.out.println(Arrays.toString(arrayAdd));
    }
}

