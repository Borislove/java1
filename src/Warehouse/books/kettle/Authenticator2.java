package Warehouse.books.kettle;

import java.util.Scanner;

//стр. 111
//Вложенные операторы if
public class Authenticator2 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Имя пользователя: ");
        String username = keyboard.next();
        if (username.equals("User")) {
            System.out.println("Пароль: ");
            String password = keyboard.next();
            if (password.equals("1234")) {
                System.out.println("Вы в системе!");
            } else {
                System.out.println("Неправильный пароль.");
            }
        } else {
            System.out.println("Незивестный пользователь");
        }
    }
}
