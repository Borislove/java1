package ru.progwards.t6.t6_3.t6_3_Test3;

import java.util.Arrays;

/*
Реализуйте функцию, возвращающую максимальный по значению элемент массива.
Если в массиве 0 элементов, вернуть 0. Сигнатура функции

public int arrayMax(int[] a)

Подсказка - для быстрой реализации удобно использовать функцию Arrays.sort()
* */

// TODO: 01.01.2020 в ходе задачи научился выводить последний символ массива
// TODO: 01.01.2020 Arrays.binarySearch() нужно бы применить...быстрый поиск в массиве
public class ArrayMax {

    static int[] a = {1,3,-4,0,100,-231,3523,312312};
    //static int[] a= {};

    public static int arrayMax(int[] a) {

        // TODO: 01.01.2020 когда 0 вернет 0
     /*   for (int value : a) {
            if (value == 0) {
                System.out.println("Элемент " + value);
                return 0;
            }
        }*/

        //-------------решение--------------------
        if(a.length == 0) {   //если длина массива 0 , вернуть 0
            return 0;
        }
        Arrays.sort(a);  //сортировали
        int noll = 0;
        int max = (a[a.length - 1]);
        return max;
    }


//        a.equals() ;
        //Arrays.equals(0);


        //int min = a[0];
        //int max = a[-1];
        //max = [0];
        //a[-1] = a[-1];

        //------------------------интересно
       /* if( a[0] < 0) {
            System.out.println("min " + a[0]) ;
          //  return min;
        }
        if (a.length-1 > 0) {
            System.out.println("max "+ (a[a.length-1]));
            return max;
        }*/
        //-------------------------



        /*for (int i = 0; i < a.length ; i++) {
            if (i == 0){
                System.out.println("В массиве (после сортировки) присутсвует 0 "+ Arrays.binarySearch(a,0));
                return 0;
            }
        }*/

       // System.out.println(Arrays.toString(a));

        //return max;
        //return 0;


    public static void main(String[] args) {

     //   int[] b = {1,0};
      System.out.println("orig = "+ Arrays.toString(a));

     //   Arrays.sort(a);
       System.out.println("sort = "+Arrays.toString(a));

        arrayMax(a);
      //  arrayMax(b);
    }

}
