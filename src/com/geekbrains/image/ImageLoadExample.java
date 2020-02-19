package com.geekbrains.image;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

//пример загрузки картинки
public class ImageLoadExample extends JFrame {

    private static ImageLoadExample window;

    private static Image background;
    private static Image game_over;
    private static Image drop;

    public static void main(String[] args) throws IOException {

        background = ImageIO.read(ImageLoadExample.class.getResourceAsStream("background.png"));
        game_over = ImageIO.read(ImageLoadExample.class.getResourceAsStream("game_over.png"));
        drop = ImageIO.read(ImageLoadExample.class.getResourceAsStream("drop.png"));

        window = new ImageLoadExample();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocation(200, 100);
        window.setSize(906, 478);
        window.setResizable(false);
        GameField game_field = new GameField();
        window.add(game_field);
        window.setVisible(true);
    }

    private static void onRepaint(Graphics g) {
        g.drawImage(background, 0, 0, null);
        g.drawImage(drop, 100, 100, null);
        g.drawImage(game_over, 280, 120, null);
    }

    private static class GameField extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            onRepaint(g);
        }
    }
}
