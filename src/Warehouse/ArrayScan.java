//https://www.youtube.com/watch?v=qiUfLIbbedw

package Warehouse;

import java.util.Scanner;

public class ArrayScan {

    public static void main(String[] args) {
        int[]a;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers of array:");
        n = in.nextInt();
        a = new int[n];
        for (int i = 0; i < n ; i++) {
            System.out.println("Enter a [" + i + "] = ");
            a[i] = in.nextInt();
        }
    }
}
