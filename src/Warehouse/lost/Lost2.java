package Warehouse.lost;

import java.util.Arrays;
import java.util.Date;

//4 8 15 16 23 42

//через бинарный поиск попробовать?

/*Программа которая делает не пойми что.
даны определенные числа, генерируются случайные числа и когда попадают все числа в этот диапозон, завершается

* */

/**
 * @author Free Coder
 * @version 3.0 Fri Feb 21 23:21:36 MSK 2020
 *
 * */

public class Lost2 {

    private static int[] array = {4, 8, 15, 16, 23, 42};
    //private static int[] array = {4, 8, 15};
    private static int[] arrayFill = new int[6];
    //private static int[] arrayFill = Arrays.copyOf(array, array.length);

    private static int aa = 1; // Начальное значение диапазона - "от"
    private static int bb = 42; // Конечное значение диапазона - "до"

    private static Date dateOpen = new Date();

    public static void main(String[] args) throws InterruptedException {
        //System.out.println(Arrays.toString(array));
        int value = 0;

        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = true;
        boolean b4 = true;
        boolean b5 = true;
        boolean b6 = true;

        boolean t = true;

        while (true) {

            if (t == true) {
                System.out.println("Выполняется заполнение:");
                System.out.println(dateOpen);
                t = false;
            }
            Thread.sleep(400);
            System.out.println("Итерация " + value);
            int random_number = aa + (int) (Math.random() * bb); // Генерация
            System.out.println("Рандомное число " + random_number);

            if (b1 == true) {
                if (random_number == array[0]) {   //4
                    arrayFill[0] = array[0];
                    System.out.println(Arrays.toString(arrayFill));
                    b1 = false;
                }
            }

            if (b2 == true) {
                if (random_number == array[1]) {  //8
                    arrayFill[1] = array[1];
                    System.out.println(Arrays.toString(arrayFill));
                    b2 = false;
                }
            }

            if (b3 == true) {
                if (random_number == array[2]) { //15
                    arrayFill[2] = array[2];
                    System.out.println(Arrays.toString(arrayFill));
                    b3 = false;
                }
            }

            if (b4 == true) {
                if (random_number == array[3]) {   //16
                    arrayFill[3] = array[3];
                    System.out.println(Arrays.toString(arrayFill));
                    b4 = false;
                }
            }

            if (b5 == true) {
                if (random_number == array[4]) {  //23
                    arrayFill[4] = array[4];
                    System.out.println(Arrays.toString(arrayFill));
                    b5 = false;
                }
            }

            if (b6 == true) {
                if (random_number == array[5]) { //42
                    arrayFill[5] = array[5];
                    System.out.println(Arrays.toString(arrayFill));
                    b6 = false;
                }
            }
            //   System.out.println(array.equals(arrayFill));

            if (Arrays.equals(array, arrayFill) == true) {     // true
                System.out.print("Выполнено:");
                System.out.println("\u001B[33m" + " ☻" + "\u001B[0m");
                System.out.println("\u001B[32m" + " EXELENT" + "\u001B[0m");
                System.out.println("dateOpen " + dateOpen);
                Date dateClosed = new Date();
                System.out.println("dateClosed " + dateClosed);
                break;
            }
            value++;
        }
    }
}
