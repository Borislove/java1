package Warehouse.books.kettle;

import java.text.NumberFormat;
import java.util.Scanner;

//стр. 261
public class InventoryD {

    public static void main(String[] args) {

        final double boxPrice = 3.25;
        Scanner keyboard = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.println("Сколько коробочек вы насчитали?");
        String numBoxesIn = keyboard.next();

        try {
            int numBoxes = Integer.parseInt(numBoxesIn);

            if (numBoxes < 0) {
                throw new OutOfRangeExeption1();
            }
            if (numBoxes > 1000) {
                throw new NumberTooLargeException();
            }

            System.out.println("Общая стоимость равна");
            System.out.println(currency.format(numBoxes * boxPrice));
        } catch (NumberFormatException e) {
            System.out.println("Это не число.");
        } catch (OutOfRangeExeption1 e) {
            System.out.print(numBoxesIn);
            System.out.println("??? это невозможно!");
        } catch (Exception e) {
            System.out.print("Что-то здесь не так, ");
            System.out.print("но что именно, непонятно");
            System.out.println("Тип исключения неизвестен.");
        }
        System.out.println("Вышли из блоков try-catch.");

    }
}

@SuppressWarnings("serial")
class NumberTooLargeException extends OutOfRangeExeption1 {
}

@SuppressWarnings("serial")
class OutOfRangeExeption1 extends Exception {
}