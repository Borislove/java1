package com.skillbox.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        //9-63
        ArrayList<Integer> numbers = new ArrayList<>(); //коллекция из целых чисел
        for (int i = 9; i <= 63; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);  //перемешиваем коллекцию

        for (int i = 0; i < 3; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
