package Warehouse;

import java.util.Arrays;

//постепенное заполнение
public class Test5 {

    public static void main(String[] args) {

        int[] number = new int[10];

        for (int i = 0; i < number.length; i++) {
            int a = 2;
            number[i] = a;
            a++;
            System.out.println(Arrays.toString(number));
        }
    }
}
