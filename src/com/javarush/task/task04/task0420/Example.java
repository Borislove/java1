package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Example {

    public static void main(String[] args) throws IOException {

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Integer[] arr = new Integer[3];
        for (int j = 0; j < 3; j++)
            arr[j] = Integer.parseInt(buf.readLine());
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i : arr)
            System.out.print(i + " ");
    }
}
