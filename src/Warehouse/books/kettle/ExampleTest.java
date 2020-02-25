package Warehouse.books.kettle;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

//Получаем рандомное число, переводим в строку и показываем в заголовке фрейма Оо
public class ExampleTest {

    public static void main(String[] args) {
/*
        JFrame myFrame;
        myFrame = new JFrame();*/

        JFrame myFrame = new JFrame();

       /* String myTitle = "Пустой фрейм";
        myFrame.setTitle(myTitle);
*/

        //   myFrame.setTitle("test");

        Random random = new Random();
        String str = String.valueOf(random.nextInt(100));
        Integer value = Integer.valueOf(str);
        myFrame.setTitle(value.toString());

        myFrame.setSize(800, 600);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);


        //----------2окно-------------
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setSize(200, 200);
        jFrame.setTitle("2окно");
        jFrame.setLocation(0, 50);

        JButton button = new JButton();
        jFrame.getContentPane().add(BorderLayout.SOUTH, button);


    }
}
