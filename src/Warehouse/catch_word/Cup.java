package Warehouse.catch_word;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Cup {

    //Image img = new ImageIcon("C:\\Users\\User\\IdeaProjects\\java1\\src\\Warehouse\\catch_word\\res\\cup.png").getImage();
    //Image img = new ImageIcon("C:\\Users\\User\\Desktop\\Проекты\\msjacman.png").getImage();
    //Image img = new ImageIcon("C:\\Users\\User\\Desktop\\123.jpg").getImage();   //с рабочего стола загрузка

    Image img_c = new ImageIcon("C:\\Users\\User\\IdeaProjects\\java1\\src\\Warehouse\\catch_word\\res\\bug.png").getImage();
    Image img_left = new ImageIcon("C:\\Users\\User\\IdeaProjects\\java1\\src\\Warehouse\\catch_word\\res\\bug_left.png").getImage();
    Image img_right = new ImageIcon("C:\\Users\\User\\IdeaProjects\\java1\\src\\Warehouse\\catch_word\\res\\bug_right.png").getImage();
    Image img_down = new ImageIcon("C:\\Users\\User\\IdeaProjects\\java1\\src\\Warehouse\\catch_word\\res\\bug_down.png").getImage();

    Image img = img_c;

    public Rectangle getRect() {    //размер дропа
        return new Rectangle(x, y, 21, 23);
    }

    int v = 1;
    int dv = 0;
    int s = 1;

    int layer1 = 0;
    int layer2 = -590;

    int x = 350;
    int y = 510;

    int dy = 0;

    public void move() {
        s += v;
        v -= dv;
        v -= dy;

        if (layer2 - v >= 0) {
            layer1 = 0;
            layer2 = -590;
        } else {
            layer1 += v;
            layer2 += v;
        }
    }

    public void keyPressed(KeyEvent e) {
        //JOptionPane.showMessageDialog(null, "key pressed");
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_RIGHT && x <= 720) {
            x += 20;
            System.out.println("ВПРАВО");
            img = img_right;
        }

        if (key == KeyEvent.VK_LEFT && x >= 30) {

            x -= 20;
            System.out.println("ВЛЕВО");
            img = img_left;
        }

        if (key == KeyEvent.VK_UP && y >= 30) {
            y -= 20;
            System.out.println("ВВЕРХ");
            img = img_c;
        }

        if (key == KeyEvent.VK_DOWN && y <= 500) {
            y += 20;
            System.out.println("ВНИЗ");
            img = img_down;
        }

        if (key == KeyEvent.VK_UP & key == KeyEvent.VK_RIGHT) {   //тут надо зажатие
            y *= 2;
            x *= 2;
        }
        System.out.println("координата x: " + x + " координата y: " + y);

    }

    public void keyReleased(KeyEvent e) {
        //JOptionPane.showMessageDialog(null, "key released");
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_LEFT) {
            dv = 0;


            if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
                dy = 0;
                // img = img_c;
            }
        }
    }
}
