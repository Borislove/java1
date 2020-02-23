package Warehouse.catch_word.catch_word_copy;

import javax.swing.*;

//не трогать! смотреть в развертке

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Имя фрейма");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(815, 620);
        frame.add(new Field()); //поле
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);  //развертка
    }
}
