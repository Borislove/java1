package Warehouse.books.kettle;

import java.util.Scanner;

//стр. 104
//Проверка пароля, введенного пользователем
public class ChekPassword {

    public static void main(String[] args) {

        System.out.println("Введите пароль: ");
        Scanner keyboard = new Scanner(System.in);
        String password = keyboard.next();
        System.out.println("Вы ввели >>" + password + "<<");
        System.out.println();

        if (password == "swordfish") {
            System.out.println("Этого не должно быть!");
            System.out.println("Введеный и хранящийся пароли");
            System.out.println("находятся в разных местах.");
        } else {
            System.out.println("Что и ожидалось!");
            System.out.println("Это две разные строки, хотя");
            System.out.println("их символы могут совпадать.");
        }
        System.out.println();

        if (password.equals("swordfish")) {
            System.out.println("Введеный пароль правильный!");
            System.out.println("Можете войти в систему.");
        } else {
            System.out.println("Введеный пароль неправильный!");
            System.out.println("Попытайтесь еще раз...");
        }
    }
}
