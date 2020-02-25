package Warehouse.frame;

import javax.swing.*;

//Тут видно окно, но оно блокируется l/p ,пока не ведутся данные будет не активно
public class FrameTest2 extends JFrame {

    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setSize(300, 300);
        f.setResizable(false); //запрет на развертку окна
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //.setLocation(900,500);   //расположение фрейма
        f.setLocationRelativeTo(null);  //centre
        f.setVisible(true);

        String username = JOptionPane.showInputDialog("Username: ");
        String password = JOptionPane.showInputDialog("Password: ");

        if (username != null && password != null &&
                ((username.equals("Admin") &&
                        password.equals("Admin")))) {

            //f.setVisible(true);

        } else {
            System.exit(1);
        }
    }
}

