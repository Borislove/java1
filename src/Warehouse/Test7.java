package Warehouse;

import java.util.Arrays;

public class Test7 {

    public static void main(String[] args) {

        int[] n = {0};
        for (int i = 0; i < n.length; i++) {
            //System.out.println(i);
            System.out.printf("%2d", i);
            System.out.println(" ");
        }
        for (int i = 0; i < n.length; i++) {
            System.out.println(Arrays.toString(n));
            //System.out.printf("%4d", Arrays.toString(n));
        }
    }
}
