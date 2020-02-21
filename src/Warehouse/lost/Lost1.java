package Warehouse.lost;

import java.util.Arrays;
import java.util.Date;

public class Lost1 {

    private static int a = 5;
    private static int b = 11;
    private static int c = 22;

    private static int[] array = {a, b, c};
    private static int[] arrayFill = new int[3];

    private static int aa = 1; // Начальное значение диапазона - "от"
    private static int bb = 26; // Конечное значение диапазона - "до"

    private static Date dateOpen = new Date();

    public static void main(String[] args) throws InterruptedException {
        //System.out.println(Arrays.toString(array));
        int value = 0;
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = true;

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
                if (random_number == a) {
                    arrayFill[0] = a;
                    System.out.println(Arrays.toString(arrayFill));
                    b1 = false;
                }
            }

            if (b2 == true) {
                if (random_number == b) {
                    arrayFill[1] = b;
                    System.out.println(Arrays.toString(arrayFill));
                    b2 = false;
                }
            }

            if (b3 == true) {
                if (random_number == c) {
                    arrayFill[2] = c;
                    System.out.println(Arrays.toString(arrayFill));
                    b3 = false;
                }
            }

            System.out.println(array.equals(arrayFill));

         /*   if (array == arrayFill) {
                System.out.println("TEST");
                break;
            }

            if (array.equals(arrayFill) == true) {
                System.out.println("TEST TEST TEST");
                break;
            }*/

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
