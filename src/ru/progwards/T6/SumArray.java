package ru.progwards.T6;

//Напишите функцию, суммирующие значения элементов одномерного массива, содержащего целые числа. Сигнатура:
//
//public int sumArrayItems(int[] a)



//ура решена!

public class SumArray {


    public static int[] a = {14, 25, 36, -48, 105, -76};  //56

    public static int sumArrayItems(int[]a){


        int sum = 0;
        for (int value: a){
            //sum += value;
            sum = value+sum;



            //System.out.println("сумма = "+sum);
        }
        //System.out.println("сумма = "+sum);

        //System.out.println(sumArrayItems(a));
        return sum;
    }



    // int b [10];  - так нельзя!

    int b[];  // так можно

   // int v[] = new int[3];    - так нельзя
//    int item = v[1][1];

    int a1[], a2[], a3[];
    int b1[][] = {a1, a2, a3};

     int adf[] = {11, 22, 33};
    int item = a[1];

    int a32[][][];  //трехмерный массив


        public static void main (String[]args){



        }
    }
