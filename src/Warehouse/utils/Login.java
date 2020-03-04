package Warehouse.utils;

import javax.swing.*;

public class Login {

    public static void login() {

        //----------Идентификация--------------------------------------------
        String username = JOptionPane.showInputDialog("Username: ");
        String password = JOptionPane.showInputDialog("Password: ");

        if (username != null && password != null &&
                ((username.equals("Admin") &&
                        password.equals("Admin")))) {

        } else {
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        login();
    }
}
