package Warehouse.books.kettle;

import java.text.NumberFormat;
import java.util.Scanner;

//стр. 259
//Генерация пользовательского исключения
public class InventoryC {

    public static void main(String[] args) {

        final double boxPrice = 3.25;
        Scanner keyboard = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.print("Сколько коробок вы насчитали?");
        String numBoxesIn = keyboard.next();

        try {
            int numBoxes = Integer.parseInt(numBoxesIn);
            if (numBoxes < 0) {
                throw new OutOfRangeExeption();
            }
            System.out.print("Общая стоимость равна ");
            System.out.println(currency.format(numBoxes * boxPrice));
        } catch (NumberFormatException e) {
            System.out.println("Это не число.");
        } catch (OutOfRangeExeption e) {
            System.out.print(numBoxesIn);
            System.out.println(" ??? Это невозможно!");
        }
    }
}


@SuppressWarnings("serial")
class OutOfRangeExeption extends Exception {
}