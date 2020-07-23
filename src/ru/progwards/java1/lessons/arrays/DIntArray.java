package ru.progwards.java1.lessons.arrays;

//Реализовать динамический, саморастущий массив целых чисел, по следующей спецификации:

import java.util.Arrays;

public class DIntArray {

    //3.1 в классе разместить private переменную - массив целых чисел.
    //выделяем память под массив!!!
    private int[] z = new int[]{};              // z - целое число

    //private int[] z = {};              // <--- так не делать! веселье еще то...

    //3.2 конструктор - по умолчанию.   --------???? по default
    /*public DIntArray() {
    }*/

    /////////////////////////////////////////////////////////////
   /* private DIntArray(int[] z) {
        this.z = z;
    }*/
    ////////////
    // static int[] zTestAdd;   //массив после добавления num

    //////////////////////////////////////////////////////////////

    //надо же кудато воткнуть...
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
        int[] arrayCopy = Arrays.copyOf(getZ(), getZ().length + 1);
        //int[] arrayCopy = Arrays.copyOf(originalArray, originalArray.length + 1); //копируем массив и добавляем к длине 1

        arrayCopy[arrayCopy.length - 1] = num;   //отнимаем единицу от длины массива и пихаем туда num

        //  System.out.println(Arrays.toString(originalArray));   //проверка значений в оригинале
        //  System.out.println(Arrays.toString(arrayCopy));  //проверка значений в копии (добавлена длина на 1)

        //длины массивов
        //  System.out.println("originalArray lenght: " + originalArray.length);
        //  System.out.println("arrayCopy length: " + arrayCopy.length);

        //тестовый массив
        // zTestAdd = arrayCopy;

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


    }
    //////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////

    /*3.4 метод
    public void atDelete(int pos) - удаляет элемент в позиции pos массива,
    при этом размер массива должен уменьшиться на 1.
    Для этого нужно будет разместить новый массив нужного размера,
     скопировать в него старый, уже без элемента, который был в позиции pos.*/
    public void atDelete(int pos) {
        int[] arrayCopy = Arrays.copyOf(getZ(), getZ().length);

        //найдем элемент pos, окажется в начале
        for (int i = pos; i < arrayCopy.length; i++) {
            arrayCopy[i - pos] = arrayCopy[i];

        }
        System.out.println(Arrays.toString(arrayCopy));
        System.out.println(Arrays.toString(z));

        //развернем массив pos окажется в конце
        int[] reversedArray = new int[arrayCopy.length];
        for (int i = 0; i < arrayCopy.length; i++) {
            reversedArray[arrayCopy.length - 1 - i] = arrayCopy[i];

        }
        System.out.println(Arrays.toString(reversedArray));

        //удалим последний элемент
        int[] end = Arrays.copyOf(reversedArray, reversedArray.length - 1);
        z = end;
        System.out.println(Arrays.toString(z));
    }

    /*
        }
        //////////////////////////////////////////////////////////////////////

        //////////////////////////////////////////////////////////////////////

        /*3.5 метод
        public int at(int pos) - возвращает элемент по индексу pos.*/
    public int at(int pos) {
        //return z[pos] = num; //возвратил последнее значение
        return z[pos];
    }
    //////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {

        /////////////////////////////////////
        //для конструктора
//        int k = 12;
////        int[] z = {1, 2, 3, 4, 5, 6, k};
        //  DIntArray dIntArray = new DIntArray(z);
        //сравнили на равенство
        // System.out.println("equals " + Arrays.equals(z, zTestAdd));
        /////////////////////////////////////


        DIntArray dIntArray = new DIntArray();
        //добавли значение
        // int number = 10;
        //dIntArray.add(number);
        //dIntArray.add(number + 10);

        //System.out.println(Arrays.toString(dIntArray.getZ()));


        int test[] = {6, -48, 24, -35, 48, 78, 8, 58, -31, 2, -28, 90, -9, 51, -11, -58, 31};
        for (int i = 0; i < test.length; i++) {

            dIntArray.add(test[i]);
        }

        dIntArray.atDelete(5); //78
        System.out.println(Arrays.toString(dIntArray.getZ()));
    }
}


