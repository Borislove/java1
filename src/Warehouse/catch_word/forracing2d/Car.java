package Warehouse.catch_word.forracing2d;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Car {

    Image img = new ImageIcon("C:\\Users\\User\\IdeaProjects\\java1\\src\\Warehouse\\catch_word\\forracing2d\\lol.png").getImage();

    int v = 3;
    int dv = 0;
    int s = 1;

    int layer1 = 0;
    int layer2 = -590;

    int x = 350;
    int y = 510;

    public void move() {
        v += dv;
        s += v;
        if (layer2 - v >= 0) {
            layer1 = 0;
            layer2 = -590;
        } else {
            layer1 += v;
            layer2 += v;
        }
    }


    public void keyPressed(KeyEvent e) {
        //  JOptionPane.showMessageDialog(null, "key pressed");
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_UP) {
            dv = 1; //ускорение
        }
        if (key == KeyEvent.VK_DOWN) {
            dv = -1;
        }
    }

    public void keyReleased(KeyEvent e) {
        //  JOptionPane.showMessageDialog(null, "key released");
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
            dv = 0; //ускорение
        }
    }
}
