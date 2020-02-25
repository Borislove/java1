package Warehouse.books.kettle;

 // import Warehouse.utils.Scanner; //коварный импорт!!!

import java.util.Random;
import java.util.Scanner;

//стр. 101
//Игра в отгадывание числа
public class DontTellThemTheyLost {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10: ");
        int inputNumber = keyboard.nextInt();
        int randomNumber = new Random().nextInt() + 1;
        if (inputNumber == randomNumber) {
            System.out.println("*Вы выиграли*");
        }
        System.out.println("Прекрасная попытка :-)");
        System.out.println("Правильное число равно ");
        System.out.println(randomNumber + ".");
        System.out.println("Спасибо за игру.");
    }
}
