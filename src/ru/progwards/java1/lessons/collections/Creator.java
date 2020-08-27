package ru.progwards.java1.lessons.collections;


import java.util.*;

public class Creator {

    //////////////////////////////////////////////////////////////////////////////////////////////////////
    /*1.1 Реализовать метод
    public static Collection<Integer> fillEven(int n) - создать коллекцию и заполнить
     последовательностью четных возрастающих чисел начиная с 2, количество элементов в коллекции n*/
    public static Collection<Integer> fillEven(int n) {

        List<Integer> arrayList = new ArrayList();
        int num = 0;
        for (int i = 0; i < n; i++) {
            num += 2;
            arrayList.add(num);
        }
        return arrayList;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////


    //////////////////////////////////////////////////////////////////////////////////////////////////////
    /*1.2 Реализовать метод
    public static Collection<Integer> fillOdd(int n) - создать коллекцию и заполнить
     последовательностью нечетных убывающих чисел, минимальное число в коллекции 1, количество элементов в коллекции n*/
    public static Collection<Integer> fillOdd(int n) {
        // List<Integer> arrayList = new ArrayList();
       /* int num = 0;
        for (int i = 0; i < n; i++) {
            num += 3;
            arrayList.add(num);
        }
        return arrayList;*/
        //--------------------------------------
        List<Integer> linkedList = new LinkedList();
        for (int i = 0; i < n; i++) {
            linkedList.add(i + 1);
        }
        //for (Iterator<Integer> iterator = linkedList.iterator(); iterator.hasNext(); ) {
        linkedList.removeIf(intObj -> intObj % 2 == 0);
        // System.out.println(linkedList);
        return linkedList;
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

     /*   ArrayList list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        fillEven(10);*/

        // fillEven(14);
        //  System.out.println(fillEven(14));

        fillOdd(15);
    }
}

