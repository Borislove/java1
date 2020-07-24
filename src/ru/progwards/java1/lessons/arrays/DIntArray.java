package ru.progwards.java1.lessons.arrays;

//Реализовать динамический, саморастущий массив целых чисел, по следующей спецификации:

import java.util.Arrays;

public class DIntArray {

    //3.1 в классе разместить private переменную - массив целых чисел.
    private int[] z = new int[]{};              // z - целое число

    //3.2 конструктор - по умолчанию.   ------- default

    private int[] getZ() {
        return z;
    }

    //////////////////////////////////////////////////////////////////////
    /*3.2 метод
      public void add(int num) - добавляет элемент num в конец массива,
     при этом размер массива должен увеличиться на 1.
     Для этого нужно будет разместить новый массив нужного размера,
     скопировать в него старый, и добавить в хвост элемент num.*/
    public void add(int num) {
        int[] arrayCopy = Arrays.copyOf(getZ(), getZ().length + 1); //добавляем длину
        arrayCopy[arrayCopy.length - 1] = num;   //последний индекс= num
        z = arrayCopy;
    }
    //////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////
        /*3.3 метод
     public void atInsert(int pos, int num) - добавляет элемент num в позицию pos массива,
     при этом размер массива должен увеличиться на 1.
     Для этого нужно будет разместить новый массив нужного размера,
     скопировать в него старый, c учетом того, что новый элемент
     окажется где-то в середине, и потом положить в нужный индекс элемент num.*/
    public void atInsert(int pos, int num) {
        int[] arrayCopy = new int[z.length + 1];
        for (int i = 0; i < arrayCopy.length; i++) {
            if (i < pos) {
                arrayCopy[i] = z[i];
            } else if (i == pos) {
                arrayCopy[i] = num;
            } else {
                arrayCopy[i] = z[i - 1];
            }
        }
        z = arrayCopy;
      //  System.out.println(Arrays.toString(z));
    }
    //////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////

    /*3.4 метод
    public void atDelete(int pos) - удаляет элемент в позиции pos массива,
    при этом размер массива должен уменьшиться на 1.
    Для этого нужно будет разместить новый массив нужного размера,
     скопировать в него старый, уже без элемента, который был в позиции pos.*/
    public void atDelete(int pos) {
        int[] arrayCopy = new int[getZ().length - 1];
        for (int i = 0; i < z.length; i++) {
            if (i < pos) {
                arrayCopy[i] = z[i];
            } else if (i > pos) {
                arrayCopy[i - 1] = z[i];
            }
        }
        z = arrayCopy;
    }

    //////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////

    /*3.5 метод
    public int at(int pos) - возвращает элемент по индексу pos.*/
    public int at(int pos) {
        return z[pos];
    }
    //////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {

        DIntArray dIntArray = new DIntArray();

        int test[] = {6, -48, 24, -35, 48, 78, 8, 58, -31, 2, -28, 90, -9, 51, -11, -58, 31};
        for (int i = 0; i < test.length; i++) {
            dIntArray.add(test[i]);
        }

        // dIntArray.atDelete(5); //78
        System.out.println(Arrays.toString(dIntArray.getZ()));

        //  dIntArray.atDelete(1); //78
        System.out.println(Arrays.toString(dIntArray.getZ()));

        // dIntArray.atDelete(5); //
        System.out.println(Arrays.toString(dIntArray.getZ()));

        dIntArray.atInsert(10, 999);
    }
}


