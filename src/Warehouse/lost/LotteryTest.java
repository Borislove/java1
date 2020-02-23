package Warehouse.lost;

import java.util.Arrays;

/*
 * Программа генерирует случайные числа из них составляет комбинацию.
 *вытяни свой счастливый билет XD
 *
 * выдать один билет, затем запустить мега тираж и если совпали числа победа?
 * */

/**
 * @author Free Coder
 * @version 1.0 Fri Feb 21 23:31:37 MSK 2020
 */

public class LotteryTest {

    private static int aa = 1; // Начальное значение диапазона - "от"
    private static int bb = 99; // Конечное значение диапазона - "до"  //999 при таком значении 10 минут 2 числа впоймал..

    //private static int[] arrayS = new int[10]; //тут поставишь он не хранит значения..

    private static int[] arrayOver = {19, 23, 24, 24, 55, 56, 83, 86, 88, 97};

    public static void testTest() {

        int[] array = new int[10];

        //int[] arrayOver = {20, 37, 61, 61, 62, 65, 75, 75, 85, 87};
        //int[] arrayOver = {1, 2, 3, 4, 4, 7, 7, 8, 8, 9};
        //int[] arrayOver = {1, 1, 1, 1, 1, 1, 2, 3, 3, 3};

        Arrays.sort(arrayOver);

        int value = 0;

        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = true;
        boolean b4 = true;
        boolean b5 = true;
        boolean b6 = true;
        boolean b7 = true;
        boolean b8 = true;
        boolean b9 = true;
        boolean b10 = true;

        while (true) {
            //  Thread.sleep(1);

            int random_number1 = aa + (int) (Math.random() * bb); // Генерация
            int random_number2 = aa + (int) (Math.random() * bb); // Генерация

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

                    array[0] = ((random_number1 + random_number2) / 2);   //делить на 2...(11+2) / 2 сколько будет? что откинется, хотя тут складываются одни и теже числа и просто делятся, вообще зачем делить на 2...и не должно равнятся рандому 3..

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

                    array[1] = (random_number1 + random_number2) / 2;

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

                    array[2] = (random_number1 + random_number2) / 2;

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

                    array[3] = (random_number1 + random_number2) / 2;

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

                    array[4] = (random_number1 + random_number2) / 2;

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

                    array[5] = (random_number1 + random_number2) / 2;

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

                    array[6] = (random_number1 + random_number2) / 2;

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

                    array[7] = (random_number1 + random_number2) / 2;


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

                    array[8] = (random_number1 + random_number2) / 2;

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

                    array[9] = (random_number1 + random_number2) / 2;

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

        /*
         * 100 тикетов*/
/*
        for (int i = 0; i < 100; i++) {
            testTest();
        }*/


        /*
         * 10 тикетов*/

        /*for (int i = 0; i < 10; i++) {
            testTest();
        }*/

        /* 1 тикет*/
        System.out.println("тест тест тест тест");
        testTest();
        System.out.println("тест тест тест тест");


      /*  for (int i = 0; i < 100; i++) {
            testTest();
        }*/

        /*while (true) {   //не работает...

            testTest();
            if (Arrays.equals(arrayS, arrayOver)) {
                System.out.println("\u001B[31m" + "STOP!!!" + "\u001B[0m");
                System.out.println(Arrays.toString(arrayS));
                System.out.println(Arrays.toString(arrayOver));
                break;
            }
        }*/
    }
}



