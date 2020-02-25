package Warehouse.books.kettle;

import java.util.Random;
import java.util.Scanner;

//стр. 96
//Игра с угадыванием числа
public class GuessingGame {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Введите число от 1 до 10: ");
        int inputNumber = keyboard.nextInt();
        int randomNumber = new Random().nextInt(10) + 1;
        if (inputNumber == randomNumber) {
            System.out.println("*************");
            System.out.println("*Вы выиграли*");
            System.out.println("*************");
        } else {
            System.out.println("Вы проиграли.");
            System.out.print("Случайное число равно ");
            System.out.println(randomNumber + ".");
        }
        System.out.println("Спасибо за игру.");
    }
}
