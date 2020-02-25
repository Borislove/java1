package Warehouse.books.kettle;

import javax.swing.*;

//стр. 83
// Использование ссылочного типа
public class ShowAFrame {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        String myTitle = "Пустой фрейм";
        myFrame.setTitle(myTitle);
        myFrame.setSize(300, 300);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}
