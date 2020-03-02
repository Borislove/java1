package Warehouse.books.kettle;

import java.text.NumberFormat;
import java.util.Scanner;

//стр. 254
//Ввод количества коробок с клавиатуры
public class InventoryA {

    public static void main(String[] args) {

        final double boxPrice = 3.25;
        Scanner keyboard = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.print("Сколько коробок вы насчитали?");
        String numBoxesIn = keyboard.next();
        try {
            int numBoxes = Integer.parseInt(numBoxesIn);

            System.out.print("Общая стоимость равна ");
            System.out.println(currency.format(numBoxes * boxPrice));
        } catch (NumberFormatException e) {
            System.out.println("Это не целое число.");
        }
    }
}
