package Warehouse.array;

import java.util.Arrays;
import java.util.Scanner;

//Программа для работы с массивом из консоли
/*
 *через свитч!
 * */
public class Array {

    private static Scanner scanner = new Scanner(System.in);

    private static int a = 0;

    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Показать массив : 1");
        System.out.println("Узнать длину массива : 2");
        System.out.println("Сложить все числа в массиве : 3");

        //scanner.nextInt();
        if (scanner.nextInt() == 1) {
            System.out.println(Arrays.toString(array));
        }
        if (scanner.nextInt() == 2) {
            System.out.println(array.length);
        }

        if (scanner.nextInt() == 3) {
            for (int value : array) {
                a += value;
            }
            System.out.print("Сумма всех чисел в массиве равна: ");
            System.out.print(a);
        }
    }
}
