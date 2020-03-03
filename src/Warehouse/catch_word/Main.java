package Warehouse.catch_word;

import javax.swing.*;

/*Программа которая будет ловить ключевые слова java в кружку...или не будет, как пойдет

двигаюсь по шаблону, переделывая и внося изменения...
*Доделать движок
*Кружку рисуют // TODO: 22.02.2020 // уже есть жук...
*Просто делать...
*
вертиально заставить двигаться объект +
удалять из коллекции объект + не не удаляет)
*

картинки грузятся только с абсолютного пути...это напрягает



попробовать
Image img = new ImageIcon(getClass().getResource("/res/road.png")).getImage();

*Добавлено
Tue Feb 25 07:18:22 MSK 2020
Логин и пароль...в игру не пустит просто так! - не включено , сделал через метод
 */

public class Main {

    //----------Идентификация--------------------------------------------
    public static void login() {

        String username = JOptionPane.showInputDialog("Username: ");
        String password = JOptionPane.showInputDialog("Password: ");

        if (username != null && password != null &&
                ((username.equals("Admin") &&
                        password.equals("Admin")))) {

        } else {
            System.exit(1);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        login();
        JFrame frame = new JFrame("Bug");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(815, 620);
        frame.add(new Field()); //поле
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);  //развертка
    }
}