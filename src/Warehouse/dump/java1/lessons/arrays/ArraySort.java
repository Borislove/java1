package Warehouse.dump.java1.lessons.arrays;

/*Задача 2. Свой алгоритм сортировки, класс ArraySort

2.1 Реализовать метод, сортирующий произвольный массив целых чисел:
public static void sort(int[] a), по следующему алгоритму:
1. Берем первый элемент и сравниваем его со вторым, если второй меньше, меняем элементы в массиве местами.
2. Далее, сравниваем первый элемент с третьим, и если третий меньше, меняем их местами.
3. Так делаем для всех элементов с индексом больше первого
4. Берем второй элемент и сравниваем его с третьим, если нужно, меняем местам
5. Далее сравниваем второй элемент с четвертым, и если нужно, меняем местами.
6. Делаем так для всех элементов, с индексом больше 2-го
7. Переходим к элементу с индексом 3...
8. Обобщая, алгоритм звучит следующим образом - сделать 2 вложенных цикла, внешний по i и внутренний по j.
 Внутренний цикл начинается от i+1, и если a[i] > a[j], то нужно поменять элементы a[i] и a[j] местами. */

public class ArraySort {

    private static int[] a = {50, -35, -12, 45, -45, -94, -76};

    public static void sort(int[] a) {

        int number = 0;

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] > a[j]) {
                    number = a[i];
                    a[i] = a[j];
                    a[j] = number;
                    //    System.out.println(Arrays.toString(a));
                }
            }
        }
    }

    public static void sortTest(int[] a) {
        java.util.Arrays.sort(a);
        System.out.println(java.util.Arrays.toString(a));
    }

    public static void main(String[] args) {
        sort(a);
        //  sortTest(a);
    }
}





