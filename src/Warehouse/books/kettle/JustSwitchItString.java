package Warehouse.books.kettle;

import java.util.Scanner;

// TODO: 25.02.2020 Не работает!
//При использовании java 6 и более старых версий JRE аргумент switch не может иметь тип String

//стр. 117
//Использование типа String в аргументе оператора switch
public class JustSwitchItString {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Почему Эл стоит под дождем? Введите номер: ");

        //String verse = keyboard.next();                   //<<----------------------------------------------------
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


/*Error:(15, 18) java: incompatible types: int cannot be converted to java.lang.String*/