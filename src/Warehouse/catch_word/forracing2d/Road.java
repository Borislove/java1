package Warehouse.catch_word.forracing2d;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Road extends JPanel implements ActionListener {

    Timer mainTimer = new Timer(20, (ActionListener) this);

    Image img = new ImageIcon("C:\\Users\\User\\IdeaProjects\\java1\\src\\Warehouse\\catch_word\\forracing2d\\road.jpg").getImage(); //абсолютный путь

    Car cup = new Car();

    public Road() {
        mainTimer.start();
        addKeyListener(new myKeyAdapter());
        setFocusable(true);
    }

    private class myKeyAdapter extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            cup.keyPressed(e);
        }

        public void keyReleased(KeyEvent e) {
            cup.keyReleased(e);
        }
    }

    public void paint(Graphics g) {
        g = (Graphics2D) g;
        g.drawImage(img, 0, cup.layer1, null);
        g.drawImage(img, 0, cup.layer2, null);
        g.drawImage(cup.img, cup.x, cup.y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cup.move();
        repaint();
    }
}
