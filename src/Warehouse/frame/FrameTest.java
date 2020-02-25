package Warehouse.frame;

import javax.swing.*;

//Пока пользователь не введет логин и пароль не будет окна
public class FrameTest extends JFrame {

    public static void main(String[] args) {

        String username = JOptionPane.showInputDialog("Username: ");
        String password = JOptionPane.showInputDialog("Password: ");

        if (username != null && password != null &&
                ((username.equals("Admin") &&
                        password.equals("Admin")))) {

            JFrame f = new JFrame();
            f.setVisible(true);
            f.setSize(300, 300);
            f.setResizable(false); //запрет на развертку окна
            f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            //.setLocation(900,500);   //расположение фрейма
            f.setLocationRelativeTo(null);  //centre
        } else {
            System.exit(1);
        }
    }
}

