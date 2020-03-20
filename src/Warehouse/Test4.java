package Warehouse;

import java.util.Arrays;

public class Test4 {

    private static int p = 2;
    private static int n = 49;
    private static int[] number = new int[n];

    public static void main(String[] args) {

        for (int i = 0; i < number.length; i++) {

            Arrays.fill(number, p);
            p++;

            if (i < i + 1) {
                int[] test = {i};
            System.out.print(Arrays.toString(test));
            }
            //System.out.println(Arrays.toString(number));
        }
        //------------------------------------------------------
        int[] resheto = new int[number.length];
        System.arraycopy(number, 0, resheto, 0, resheto.length);
        //  System.out.println(Arrays.toString(resheto));
    }
}
