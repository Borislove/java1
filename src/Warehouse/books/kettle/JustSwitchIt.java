package Warehouse.books.kettle;

import java.util.Scanner;

//стр. 114
//Инструкция switch
public class JustSwitchIt {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Почему Эл стоит под дождем? Введите номер: ");
        int verse = keyboard.nextInt();
        switch (verse) {
            case 1:
                System.out.println("Потому что дождь идет очень долго.");
                break;
            case 2:
                System.out.println("Потому что он очень расстроен.");
                break;
            case 3:
                System.out.println("Потому что он все равно уже мокрый.");
                break;
            default:
                System.out.println("Такой причины нет. Попытайтесь еще раз.");
                break;
        }
        System.out.println("О-оооооо....");
    }
}
