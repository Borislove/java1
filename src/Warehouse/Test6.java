package Warehouse;

import java.util.Arrays;

public class Test6 {

    private static int a = 2;

    public static void main(String[] args) {

        int[] number = new int[10];

        for (int i = 0; i < number.length; i++) {
            number[i] = a;
            a++;
            //   System.out.println(Arrays.toString(number));
            if (i == 9) {
                System.out.println(Arrays.toString(number));
            }
        }
    }
}



