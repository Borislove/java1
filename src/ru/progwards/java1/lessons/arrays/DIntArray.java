package ru.progwards.java1.lessons.arrays;

//Реализовать динамический, саморастущий массив целых чисел, по следующей спецификации:

import java.util.Arrays;

public class DIntArray {

    //3.1 в классе разместить private переменную - массив целых чисел.
    private int[] z = {};              // z - целое число

    //3.2 конструктор - по умолчанию.   --------????
    /*public DIntArray() {
    }*/


    /////////////////////////////////////////////////////////////
   /* private DIntArray(int[] z) {
        this.z = z;
    }*/
    ////////////
    static int[] zTestAdd;   //массив после добавления num
    //////////////////////////////////////////////////////////////

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

        // int[] originalArray = new int[z.length];  // !!!! не длину надо, а значения)
        int[] originalArray = getZ();  //инициализируем массив

        //int[] arrayCopy = Arrays.copyOf(originalArray, this.z.length + 1);
        int[] arrayCopy = Arrays.copyOf(originalArray, z.length + 1);
        //int[] arrayCopy = Arrays.copyOf(originalArray, originalArray.length + 1); //копируем массив и добавляем к длине 1

        arrayCopy[arrayCopy.length - 1] = num;   //отнимаем единицу от длины массива и пихаем туда num

        System.out.println(Arrays.toString(originalArray));   //проверка значений в оригинале
        System.out.println(Arrays.toString(arrayCopy));  //проверка значений в копии (добавлена длина на 1)

        //длины массивов
        System.out.println("originalArray lenght: " + originalArray.length);
        System.out.println("arrayCopy length: " + arrayCopy.length);

        //тестовый массив
        zTestAdd = arrayCopy;
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
        /*int[] array = new int[z.length + 1];  //инициализируем массив и увеличиваем размер на 1
        int[] arrayCopy = Arrays.copyOf(array, array.length); //копируем массив
        arrayCopy[arrayCopy.length - pos] = num;
        System.out.println(Arrays.toString(arrayCopy));*/
    }
    //////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////

    /*3.4 метод
    public void atDelete(int pos) - удаляет элемент в позиции pos массива,
    при этом размер массива должен уменьшиться на 1.
    Для этого нужно будет разместить новый массив нужного размера,
     скопировать в него старый, уже без элемента, который был в позиции pos.*/
    public void atDelete(int pos) {

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

        /////////////////////////////////////
        //для конструктора
        int k = 12;
        int[] z = {1, 2, 3, 4, 5, 6, k};
        //  DIntArray dIntArray = new DIntArray(z);
        //сравнили на равенство
        System.out.println(Arrays.equals(z, zTestAdd));
        /////////////////////////////////////

        DIntArray dIntArray = new DIntArray();

        //добавли значение
        dIntArray.add(3);
    }
}


