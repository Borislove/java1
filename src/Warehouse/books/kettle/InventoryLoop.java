package Warehouse.books.kettle;

import java.text.NumberFormat;
import java.util.Scanner;

//стр. 268
//Повторение попыток ввести правильные данные
public class InventoryLoop {

    public static void main(String[] args) {

        final double boxPrice = 3.25;
        boolean gotGoodInput = false;
        Scanner keyboard = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        do {
            System.out.println("Сколько коробочек вы насчитали?");
            String numBoxesIn = keyboard.next();

            try {
                int numBoxes = Integer.parseInt(numBoxesIn);
                System.out.print("Общая стоимость равна ");
                System.out.println(currency.format(numBoxes * boxPrice));
                gotGoodInput = true;
            } catch (NumberFormatException e) {
                System.out.println();
                System.out.println("Это не целое число");
            }
        } while (!gotGoodInput);
        System.out.println("Отлично!");
    }
}
