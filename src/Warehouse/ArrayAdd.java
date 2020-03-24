package Warehouse;

import java.util.Arrays;

//Увеличивает в массиве значения на 1
public class ArrayAdd {

    private static int[] arrayAdds = {2, 2, 3, 4, 5, 6};
    private int[] array;

    public ArrayAdd(int[] array) {
        this.array = array;
    }

    public void add(int num) {

        int arrayNum[] = new int[array.length];
        System.arraycopy(array, 0, arrayAdds, 0, arrayAdds.length);
        for (int i = 0; i < array.length ; i++) {
            arrayAdds[i] += num;
        }
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayAdds));

        ArrayAdd arrayAdd = new ArrayAdd(arrayAdds);
        arrayAdd.add(1);
        System.out.println(Arrays.toString(arrayAdds));
    }
}

