package Warehouse.books.kettle;

import java.util.Arrays;
import java.util.Scanner;

//не идеал...но для начала сойдет )
//наконец заработал сканер...импортились мои же пакеты XD
//в ифе уже объект сравнивается со строкой...
// TODO: 25.02.2020 попробовать через массив
abstract class MyExample1 {

    private static String[] token = {"войти", "вход"};

    public static void main(String[] args) {

        System.out.println("Введи строку");
        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.nextLine();

        if (str.equals("Menu") || str.equals("M") || str.equals("Меню") || str.equals("М") || str.equals("м") || str.equals("m") || str.equals("меню") || str.equals("menu")) {
            System.out.println("Вы в меню!");
        }

        if (str.equals("Option") || str.equals("O") || str.equals("Опции") || str.equals("О") || str.equals("о") || str.equals("o") || str.equals("опции") || str.equals("option")) {
            System.out.println("Опции");
        }

        if (str.equals("Exit")) {
            System.out.println("Выйти");
            System.out.println("Точно выйти? y/n");
            if (str.equals("y")) {
            }

       /* } else {
            System.out.println("ошибко");
        }*/

            Arrays.sort(token);
            if (str.equals(Arrays.binarySearch(token, "войти"))) {          //чет не пашет
                System.out.println("вход выполненен");
            }
        }

        if(str.equals(token[0])) {
            System.out.println("вход выполнен 2");
        }
    }
}