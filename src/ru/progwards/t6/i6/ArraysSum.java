package ru.progwards.t6.i6;

/*Напишите функцию, суммирующие значения элементов одномерного массива, содержащего целые числа. Сигнатура:

public int sumArrayItems(int[] a)*/
public class ArraysSum {

    public static  int sumArrayItems(int[] a) {


       /* int sum = a.length;

        java.util.Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {

            //sum = i;
            sum += a.length+i + a.length-1;

            sum += i;
        }*/

       int sum = a[a.length-1];

        for (int i = 0; i < a.length; i++) {

            a[0] = a.length-1 +i;
            i++;
        }

        return sum;
    }

    public static void main(String[] args) {

    }
}
