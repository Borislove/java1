package Warehouse.catch_word.forracing2d;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Имя фрейма");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(815, 620);
        frame.add(new Road()); //поле
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);  //развертка
    }
}
