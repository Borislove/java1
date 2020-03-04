package Warehouse.lost;

import java.util.Arrays;

   //  b2 = !b2; поменять


public class LotteryTestCopy {

    private static int aa = 1; // Начальное значение диапазона - "от"
    private static int bb = 99; // Конечное значение диапазона - "до"  //999 при таком значении 10 минут 2 числа впоймал..

    private static int[] arrayOver = {19, 23, 24, 24, 55, 56, 83, 86, 88, 97};


    private static boolean b1 = true;
    private static boolean b2 = true;
    private static boolean b3 = true;
    private static boolean b4 = true;
    private static boolean b5 = true;
    private static boolean b6 = true;
    private static boolean b7 = true;
    private static boolean b8 = true;
    private static boolean b9 = true;
    private static boolean b10 = true;


    private static int num;


    public static void testTest() {

    /*    boolean b1 = true;
        boolean b2 = true;
        boolean b3 = true;
        boolean b4 = true;
        boolean b5 = true;
        boolean b6 = true;
        boolean b7 = true;
        boolean b8 = true;
        boolean b9 = true;
        boolean b10 = true;*/

        int[] array = new int[10];
        Arrays.sort(arrayOver);
        int value = 0;

        while (true) {

            int random_number1 = aa + (int) (Math.random() * bb); // Генерация
            int random_number2 = aa + (int) (Math.random() * bb); // Генерация

            num = random_number1 + random_number2 / 2;
            //   System.out.println(num);

            if (b1 == true) {
                int random_number3 = aa + (int) (Math.random() * bb); // Генерация
                if (random_number1 == random_number2
                        && random_number1 == random_number3
                        || array[0] == 0
                        && array[0] != array[1]
                        && array[0] != array[2]
                        && array[0] != array[3]
                        && array[0] != array[4]
                        && array[0] != array[5]
                        && array[0] != array[6]
                        && array[0] != array[7]
                        && array[0] != array[8]
                        && array[0] != array[9]) {

                    array[0] = num;

                    b1 = false;
                    //  break;
                }
            }

            if (b2 == true) {
                int random_number3 = aa + (int) (Math.random() * bb); // Генерация
                if (random_number1 == random_number2
                        && random_number1 == random_number3
                        || array[1] == 0
                        && array[1] != array[0]
                        && array[1] != array[2]
                        && array[1] != array[3]
                        && array[1] != array[4]
                        && array[1] != array[5]
                        && array[1] != array[6]
                        && array[1] != array[7]
                        && array[1] != array[8]
                        && array[1] != array[9]) {

                    array[1] = num;

                    b2 = false;
                }
            }

            if (b3 == true) {
                int random_number3 = aa + (int) (Math.random() * bb); // Генерация
                if (random_number1 == random_number2
                        && random_number1 == random_number3
                        || array[2] == 0
                        && array[2] != array[0]
                        && array[2] != array[1]
                        && array[2] != array[3]
                        && array[2] != array[4]
                        && array[2] != array[5]
                        && array[2] != array[6]
                        && array[2] != array[7]
                        && array[2] != array[8]
                        && array[2] != array[9]) {

                    array[2] = num;

                    b3 = false;
                }
            }

            if (b4 == true) {
                int random_number3 = aa + (int) (Math.random() * bb); // Генерация
                if (random_number1 == random_number2
                        && random_number1 == random_number3
                        || array[3] == 0
                        && array[3] != array[0]
                        && array[3] != array[1]
                        && array[3] != array[2]
                        && array[3] != array[4]
                        && array[3] != array[5]
                        && array[3] != array[6]
                        && array[3] != array[7]
                        && array[3] != array[8]
                        && array[3] != array[9]) {

                    array[3] = num;

                    b4 = false;
                }
            }

            if (b5 == true) {
                int random_number3 = aa + (int) (Math.random() * bb); // Генерация
                if (random_number1 == random_number2
                        && random_number1 == random_number3
                        || array[4] == 0
                        && array[4] != array[0]
                        && array[4] != array[1]
                        && array[4] != array[2]
                        && array[4] != array[3]
                        && array[4] != array[5]
                        && array[4] != array[6]
                        && array[4] != array[7]
                        && array[4] != array[8]
                        && array[4] != array[9]) {

                    array[4] = num;

                    b5 = false;
                }
            }

            if (b6 == true) {
                int random_number3 = aa + (int) (Math.random() * bb); // Генерация
                if (random_number1 == random_number2
                        && random_number1 == random_number3
                        || array[5] == 0
                        && array[5] != array[0]
                        && array[5] != array[1]
                        && array[5] != array[2]
                        && array[5] != array[3]
                        && array[5] != array[4]
                        && array[5] != array[6]
                        && array[5] != array[7]
                        && array[5] != array[8]
                        && array[5] != array[9]) {

                    array[5] = num;

                    b6 = false;
                }
            }

            if (b7 == true) {
                int random_number3 = aa + (int) (Math.random() * bb); // Генерация
                if (random_number1 == random_number2
                        && random_number1 == random_number3
                        || array[6] == 0
                        && array[6] != array[0]
                        && array[6] != array[1]
                        && array[6] != array[2]
                        && array[6] != array[3]
                        && array[6] != array[4]
                        && array[6] != array[5]
                        && array[6] != array[7]
                        && array[6] != array[8]
                        && array[6] != array[9]) {

                    array[6] = num;

                    b7 = false;
                }
            }

            if (b8 == true) {
                int random_number3 = aa + (int) (Math.random() * bb); // Генерация
                if (random_number1 == random_number2
                        && random_number1 == random_number3
                        || array[7] == 0
                        && array[7] != array[0]
                        && array[7] != array[1]
                        && array[7] != array[2]
                        && array[7] != array[3]
                        && array[7] != array[4]
                        && array[7] != array[5]
                        && array[7] != array[6]
                        && array[7] != array[8]
                        && array[7] != array[9]) {

                    array[7] = num;


                    b8 = false;
                }
            }

            if (b9 == true) {
                int random_number3 = aa + (int) (Math.random() * bb); // Генерация
                if (random_number1 == random_number2
                        && random_number1 == random_number3
                        || array[8] == 0
                        && array[8] != array[0]
                        && array[8] != array[1]
                        && array[8] != array[2]
                        && array[8] != array[3]
                        && array[8] != array[4]
                        && array[8] != array[5]
                        && array[8] != array[6]
                        && array[8] != array[7]
                        && array[8] != array[9]) {

                    array[8] = num;

                    b9 = false;
                }
            }

            if (b10 == true) {
                int random_number3 = aa + (int) (Math.random() * bb); // Генерация
                if (random_number1 == random_number2
                        && random_number1 == random_number3
                        || array[9] == 0
                        && array[9] != array[0]
                        && array[9] != array[1]
                        && array[9] != array[2]
                        && array[9] != array[3]
                        && array[9] != array[4]
                        && array[9] != array[5]
                        && array[9] != array[6]
                        && array[9] != array[7]
                        && array[9] != array[8]) {

                    array[9] = num;

                    b10 = false;
                }
            }

            //-----------------завершение-----------------
            if (array[0] != 0
                    && array[1] != 0
                    && array[2] != 0
                    && array[3] != 0
                    && array[4] != 0
                    && array[5] != 0
                    && array[6] != 0
                    && array[7] != 0
                    && array[8] != 0
                    && array[9] != 0
            ) {
                System.out.println(Arrays.toString(array));
                //  System.out.println("<<<Итерация>>>" + value);

                System.out.println("----------------------------------");
                System.out.println("***********Ticket:" + value + "**********");

                System.out.println("***** " + array[0] + " | " + array[1] + " | " + array[2] + " |" + array[3] + " | " + array[4] + " *****");
                System.out.println("***** " + array[5] + " | " + array[6] + " | " + array[7] + " |" + array[8] + " | " + array[9] + " *****");
                System.out.println("*********************************");
                System.out.println("----------------------------------");

                System.out.println("отсортированный");
                Arrays.sort(array);
                System.out.println(Arrays.toString(array));
                break;
                //continue;
            }
            value++;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        testTest();

    }
}



