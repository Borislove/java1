package Warehouse.catch_word;

import javax.swing.*;

/*Программа которая будет ловить ключевые слова java в кружку...или не будет, как пойдет

двигаюсь по шаблону, переделывая и внося изменения...
*Доделать движок
*Кружку рисуют // TODO: 22.02.2020
*Просто делать...
*

картинки грузятся только с абсолютного пути...это напрягает

 */


public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Имя фрейма");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(815, 620);
        frame.add(new Field()); //поле
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }
}
