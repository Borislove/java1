package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int num;
    private int[] numbers = new int[num];

    public DIntArray(int n, int[] numbers) {
        this.num = num;
        this.numbers = numbers;
    }
    //метод
    public void add(int num) {

        int[] numbersCopy = Arrays.copyOf(numbers,numbers.length+1);
        //Arrays.fill(numbers,n);

    }

    //метод
    public void atInsert(int pos, int num) {
    }

    //метод
    public void atDelete(int pos) {
        int[] numbersCopy = Arrays.copyOf(numbers,numbers.length-1);
    }

    //метод
    public int at(int pos) {
        return 0;
    }


    public static void main(String[] args) {

    }
}

/*Задача 3. Класс DIntArray
Реализовать динамический, саморастущий массив целых чисел, по следующей спецификации:
3.1 в классе разместить private переменную - массив целых чисел.
3.2 конструктор - по умолчанию.
3.2 метод
public void add(int num) - добавляет элемент num в конец массива, при этом размер массива должен увеличиться на 1.
 Для этого нужно будет разместить новый массив нужного размера, скопировать в него старый, и добавить в хвост элемент num.


3.3 метод
public void atInsert(int pos, int num) - добавляет элемент num в позицию pos массива, при этом размер массива должен увеличиться на 1.
 Для этого нужно будет разместить новый массив нужного размера, скопировать в него старый, c учетом того, что новый элемент окажется где-то в середине, и потом положить в нужный индекс элемент num.


3.4 метод
public void atDelete(int pos) - удаляет элемент в позиции pos массива, при этом размер массива должен уменьшиться на 1.
 Для этого нужно будет разместить новый массив нужного размера, скопировать в него старый, уже без элемента, который был в позиции pos.
3.5 метод

public int at(int pos) - возвращает элемент по индексу pos.
*/