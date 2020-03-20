package Warehouse;

import java.util.Arrays;

public class Test8 {

    private static int p = 2;
    private static int[] number = new int[10];
    private boolean[] sieve;

    public static void sift() {

        for (int i = 0; i < number.length; i++) {
            number[0] = p;
            p++;
            //number[i] += i;
            Arrays.fill(number, 0, number[number.length - 1], number.length);
            System.out.println(Arrays.toString(number));
        }
    }

    public static void main(String[] args) {

        sift();
    }
}

