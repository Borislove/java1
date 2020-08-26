package ru.progwards.java1.lessons.collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Creator {

    //////////////////////////////////////////////////////////////////////////////////////////////////////
    /*1.1 Реализовать метод
    public static Collection<Integer> fillEven(int n) - создать коллекцию и заполнить
     последовательностью четных возрастающих чисел начиная с 2, количество элементов в коллекции n*/
    public static Collection<Integer> fillEven(int n) {

        ArrayList<Integer> list = new ArrayList(n);
        list.add(0, 2);

        if (n % 2 != 0) {
            list.add(n);
        }
        return list;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////


    //////////////////////////////////////////////////////////////////////////////////////////////////////
    /*1.2 Реализовать метод
    public static Collection<Integer> fillOdd(int n) - создать коллекцию и заполнить
     последовательностью нечетных убывающих чисел, минимальное число в коллекции 1, количество элементов в коллекции n*/
    public static Collection<Integer> fillOdd(int n) {
        ArrayList<Integer> list = new ArrayList(n);
        list.add(0, 1);

        if (n % 3 != 0) {
            list.add(n);
        }
        return list;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////


    //////////////////////////////////////////////////////////////////////////////////////////////////////
    /*1.3 Реализовать метод
    public static Collection<Integer> fill3(int n) - создать коллекцию и заполнить ее тройками чисел.
    Каждая тройка создается по алгоритму: первое число тройки - индекс числа в коллекции,
    второе - индекс в квадрате, третье - индекс в кубе, количество элементов в коллекции n*3*/
    public static Collection<Integer> fill3(int n) {
        ArrayList<Integer> list = new ArrayList(n);
        return list;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////


    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        fillEven(10);
    }
}
