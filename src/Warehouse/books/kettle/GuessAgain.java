package Warehouse.books.kettle;

import java.util.Random;
import java.util.Scanner;

//стр. 120
//Игра с отгадыванием чисел.
public class GuessAgain {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int numGuesses = 0; //попытка
        int randomNumber = new Random().nextInt(10) + 1;
        System.out.println("*************");
        System.out.println("Добро пожаловать в игру!");
        System.out.println("*************");
        System.out.println();
        System.out.println("Введите число от 1 до 10: ");
        int inputNumber = keyboard.nextInt();
        numGuesses++;
        while (inputNumber != randomNumber) {
            System.out.println();
            System.out.println("Попытайтесь еще раз...");
            System.out.println("Введите число от 1 до 10: ");
            inputNumber = keyboard.nextInt();
            numGuesses++;
        }
        System.out.println("Вы угодали после ");
        System.out.println(numGuesses + " попток.");
    }
}
