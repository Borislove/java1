package ru.progwards.java1.lessons.arrays;


//Реализовать динамический, саморастущий массив целых чисел, по следующей спецификации:

import java.util.Arrays;

public class DIntArray {

    //3.1 в классе разместить private переменную - массив целых чисел.
    private static int[] numbersArray = new int[]{};

    //конструктор - по умолчанию. //default hidden

    /*public DIntArray(int[] numbersArray) {
        this.numbersArray = numbersArray;
    }*/

    //---------------------------------------------------------------------------------
    /*3.2 метод public void add(int num) - добавляет элемент num в конец массива,
    при этом размер массива должен увеличиться на 1.
    Для этого нужно будет разместить новый массив нужного размера,
    скопировать в него старый, и добавить в хвост элемент num.*/

    public static void add(int num) {
        //копируем массив //+1 на один больше будет
        int[] arrayIntCopy = Arrays.copyOf(numbersArray, numbersArray.length + 1);
        //пихаем в последний индекс число
        arrayIntCopy[arrayIntCopy.length - 1] = num;
        //промежуточные числа перемещаем обратно в массив, чтобы подростал
        numbersArray = arrayIntCopy;
        System.out.println("прилипло: " + num);
        stringArray(arrayIntCopy);
    }

    //---------------------------------------------------------------------------------
    /*3.3 метод
    public void atInsert(int pos, int num) - добавляет элемент num в позицию pos массива,
     при этом размер массива должен увеличиться на 1
    Для этого нужно будет разместить новый массив нужного размера, скопировать в него старый,
    c учетом того, что новый элемент окажется где-то в середине, и потом положить в нужный индекс элемент num.*/
    public static void atInsert(int pos, int num) {
        System.out.println("position: " + pos + " число: " + num);
        int[] arrayIntCopy = Arrays.copyOf(numbersArray, numbersArray.length + 1);
        add(num);

        if (arrayIntCopy.length > pos)
            arrayIntCopy[pos] = num;

        stringArray(arrayIntCopy);

        numbersArray = arrayIntCopy;
        stringArray(numbersArray);
    }

    private static void originalArray(int[] a) {
        print("Original array:");
        stringArray(a);
    }

    private static void stringArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }


    private static void print(String str) {
        System.out.println(str);
    }

    //---------------------------------------------------------------------------------
    /*3.5 метод
    public int at(int pos) - возвращает элемент по индексу pos.*/
    public int at(int pos) {
        System.out.println("Индекс: " + pos);
        System.out.println("Number: " + numbersArray[pos]);
        return numbersArray.length > pos ? numbersArray[pos] : 0;
    }

    //---------------------------------------------------------------------------------
    /*
    3.4 метод
    public void atDelete(int pos) - удаляет элемент в позиции pos массива,
     при этом размер массива должен уменьшиться на 1.
     Для этого нужно будет разместить новый массив нужного размера,
     скопировать в него старый, уже без элемента, который был в позиции pos.*/
    public void atDelete(int pos) {

        if (pos > numbersArray.length) {
            System.out.println("позиция не может быть больше длины массива");
        }

      //  originalArray(numbersArray);

        int[] arr = new int[numbersArray.length - 1];

        for (int i = 0; i < numbersArray.length; i++) {
            if (i < pos) {
                arr[i] = numbersArray[i];
            }
            if (i > pos) {
                arr[i - 1] = numbersArray[i];
            }
            // stringArray(arr);
        }
        stringArray(arr);

      //  at(pos);

        numbersArray = arr;
        originalArray(numbersArray);
    }


    public static void main(String[] args) {

        DIntArray dIntArray = new DIntArray();

        //  dIntArray.numbersArray = new int[]{11, 22, 33, 44, 55, 66, 77};

        //originalArray(dIntArray.numbersArray);

        //  add(1);

        //
        /*for (int i = 0; i < 10; i++) {
            if(i==5){
                add(777);
                i++;
            }
            add(i);
        }*/

        //   add(10);
        //  add(11);
        // add(13);

       /* numbersArray = new int[]{1, 2, 3, 4};
        originalArray(numbersArray);
        add(55);*/
        // stringArray(numbersArray);

        ///////////////////////////////////////////////
       /* dIntArray.atInsert(0, 22);
        dIntArray.atInsert(1, 25);
        dIntArray.atInsert(2, 27);

        System.out.println(dIntArray.at(1));*/
        ///////////////////////////////////////////////

     /*   add(10);
        add(12);
        add(14);
        add(16);
        //[10, 12, 14, 16]
        //  dIntArray.atInsert(1,999);
        //прилипло: 999
        //[10, 12, 14, 16, 999]
        //[10, 999, 14, 16, 0]

        dIntArray.atDelete(2);*/


       /* add(54);
        add(-76);
        add(-32);
        add(21);
        add(89);
        add(90);
        add(-10);
        add(96);
        add(-13);
        add(-28);
        add(-82);
        add(13);
        add(-85);
        add(-85);

        DIntArray.atInsert(1, 67);*/

        ////////////////////////////////////////////
        //originalArray(numbersArray);
        //dIntArray.atDelete(2);


        //  dIntArray.atDelete(3);

        //{11, 22, 33, 44, 55};

        //dIntArray.atDelete(3);

        //-11,-16,67,-41,-80

        add(-11);
        add(-16);
        add(67);
        add(-41);
        add(80);

        dIntArray.atDelete(1);

        dIntArray.at(1);
    }
}



/* последовательно добавлены значения: 82,-6,-81,-79,92. Вызван метод atDelete(0). Вызов метода at(0) возвратил значение: -63. Ожидалось: -6*/