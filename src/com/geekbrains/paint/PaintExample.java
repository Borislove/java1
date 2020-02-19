package com.geekbrains.paint;

import javax.swing.*;
import java.awt.*;

//пример рисования объектов
public class PaintExample extends JFrame {

    private static PaintExample paint;

    public static void main(String[] args) {

        paint = new PaintExample();
        paint.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        paint.setLocation(200, 100);
        paint.setSize(906, 478);
        paint.setResizable(true);
        GameField game_field = new GameField();
        paint.add(game_field);
        paint.setVisible(true);
    }

    private static void onRepaint(Graphics g) {
        g.fillOval(100, 100, 100, 100);
        g.drawLine(300, 100, 500, 100);
        g.setColor(Color.red);
        g.drawLine(99, 299, 99, 99);
    }

    private static class GameField extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            onRepaint(g);
        }
    }
}


