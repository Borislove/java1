package Warehouse.books.kettle;

import javax.swing.*;

//стр. 106
//Проверка имени пользователя (username) и пароля (password)
public class Authenticator {

    public static void main(String[] args) {

        String username = JOptionPane.showInputDialog("Username: ");
        String password = JOptionPane.showInputDialog("Password: ");

        if (username != null && password != null &&
                ((username.equals("Admin") &&
                        password.equals("Admin")) ||
                        (username.equals("root") &&
                                password.equals("root")) ||
                        (username.equals("User") &&
                                password.equals("1234")))) {
            JOptionPane.showMessageDialog(null, "Вы допущены в систему!");
        } else {
            JOptionPane.showMessageDialog(null, "Попытайтесь еще раз...");
        }
    }
}
