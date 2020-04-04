package com.javarush.level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class lecture07 {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);

        //---------------более компактная
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        int age = scanner.nextInt();
    }
}
