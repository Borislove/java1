package ru.progwards.java1.lessons.arrays;

//Реализовать динамический, саморастущий массив целых чисел.
public class DintArray {

    //3.1 в классе разместить private переменную - массив целых чисел.
    private int[] array;

    //3.2 конструктор - по умолчанию.
    public DintArray(int[] array) {
        this.array = array;
    }

    /*3.2 метод
    public void add(int num) - добавляет элемент num в конец массива, при этом размер массива должен увеличиться на 1.
    Для этого нужно будет разместить новый массив нужного размера, скопировать в него старый, и добавить в хвост элемент num.*/
    public void add(int num) {

        int arrayNum[] = new int[array.length + 1];
        System.arraycopy(array, 0, arrayNum, 0, arrayNum.length);
        for (int i = 0; i < array.length - 1; i++) {
            arrayNum[i] += num;
        }
    }

    /*3.3 метод
    public void atInsert(int pos, int num) - добавляет элемент num в позицию pos массива, при этом размер массива должен увеличиться на 1.
    Для этого нужно будет разместить новый массив нужного размера, скопировать в него старый, c учетом того, что новый элемент
    окажется где-то в середине, и потом положить в нужный индекс элемент num.*/
    public void atInsert(int pos, int num) {

    }

    /*3.4 метод
    public void atDelete(int pos) - удаляет элемент в позиции pos массива, при этом размер массива должен уменьшиться на 1.
    Для этого нужно будет разместить новый массив нужного размера, скопировать в него старый, уже без элемента, который был в позиции pos.*/
    public void atDelete(int pos) {

    }
    /*3.5 метод
    public int at(int pos) - возвращает элемент по индексу pos.*/

    public static void main(String[] args) {
    }
}
