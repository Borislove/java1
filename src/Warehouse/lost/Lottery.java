package Warehouse.lost;

/*
 * Программа генерирует случайные числа из них составляет выигрышную комбинацию.
 *
 * */

import java.util.Arrays;

/**
 * @author Free Coder
 * @version 1.0 Fri Feb 21 23:31:37 MSK 2020
 */


//хотел через коллекцию, запутался


public class Lottery {

    private static int aa = 1; // Начальное значение диапазона - "от"
    private static int bb = 99; // Конечное значение диапазона - "до"  //999 при таком значении 10 минут 2 числа впоймал..

    // private static int[] array = new int[10];   //  тут не заполняется

    public static void main(String[] args) throws InterruptedException {

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

        int[] array = new int[10];

        while (true) {
              Thread.sleep(1000);
            System.out.print("-------------------------");
            System.out.print("<<<Итерация>>>" + value);
            System.out.print("-------------------------");
            int random_number1 = aa + (int) (Math.random() * bb); // Генерация
            int random_number2 = aa + (int) (Math.random() * bb); // Генерация

            System.out.print("  random_number1 " + random_number1);
            System.out.println("  random_number2 " + random_number2);

         /*   if (random_number1 == random_number2) {
                System.out.println("совпали");
                break;
            }*/

            System.out.println(Arrays.toString(array));

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
                    System.out.println("Числа совпали");
                    array[0] = ((random_number1 + random_number2) / 2);   //делить на 2...(11+2) / 2 сколько будет? что откинется, хотя тут складываются одни и теже числа и просто делятся, вообще зачем делить на 2...и не должно равнятся рандому 3..
                    System.out.println(Arrays.toString(array));
                    //System.out.println(array.length);
                    System.out.println("0");
                    System.out.println("random 3 ----===--->>>> " + random_number3);
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
                    System.out.println("Числа совпали");
                    array[1] = (random_number1 + random_number2) / 2;
                    System.out.println(Arrays.toString(array));
                    //System.out.println(array.length);
                    System.out.println("1");
                    System.out.println("random 3 ----===--->>>> " + random_number3);
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
                    System.out.println("Числа совпали");
                    array[2] = (random_number1 + random_number2) / 2;
                    System.out.println(Arrays.toString(array));
                    //System.out.println(array.length);
                    System.out.println("2");
                    System.out.println("random 3 ----===--->>>> " + random_number3);
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
                    System.out.println("Числа совпали");
                    array[3] = (random_number1 + random_number2) / 2;
                    System.out.println(Arrays.toString(array));
                    //System.out.println(array.length);
                    System.out.println("3");
                    System.out.println("random 3 ----===--->>>> " + random_number3);
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
                    System.out.println("Числа совпали");
                    array[4] = (random_number1 + random_number2) / 2;
                    System.out.println(Arrays.toString(array));
                    //System.out.println(array.length);
                    System.out.println("4");
                    System.out.println("random 3 ----===--->>>> " + random_number3);
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
                    System.out.println("Числа совпали");
                    array[5] = (random_number1 + random_number2) / 2;
                    System.out.println(Arrays.toString(array));
                    //System.out.println(array.length);
                    System.out.println("5");
                    System.out.println("random 3 ----===--->>>> " + random_number3);
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
                    System.out.println("Числа совпали");
                    array[6] = (random_number1 + random_number2) / 2;
                    System.out.println(Arrays.toString(array));
                    //System.out.println(array.length);
                    System.out.println("6");
                    System.out.println("random 3 ----===--->>>> " + random_number3);
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
                    System.out.println("Числа совпали");
                    array[7] = (random_number1 + random_number2) / 2;
                    System.out.println(Arrays.toString(array));
                    //System.out.println(array.length);
                    System.out.println("7");
                    System.out.println("random 3 ----===--->>>> " + random_number3);
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
                    System.out.println("Числа совпали");
                    array[8] = (random_number1 + random_number2) / 2;
                    System.out.println(Arrays.toString(array));
                    //System.out.println(array.length);
                    System.out.println("8");
                    System.out.println("random 3 ----===--->>>> " + random_number3);
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
                    System.out.println("Числа совпали");
                    array[9] = (random_number1 + random_number2) / 2;
                    System.out.println(Arrays.toString(array));
                    //System.out.println(array.length);
                    System.out.println("9");
                    System.out.println("random 3 ----===--->>>> " + random_number3);
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
                System.out.println("The end XD");
                break;
                //continue;
            }
            value++;
        }

    }
}


//совпадение <<<Итерация>>>13650              в командой строке не хотел компилироваться оО из-за этих строчек
//<<<Итерация>>>28975
//<<<Итерация>>>18903


