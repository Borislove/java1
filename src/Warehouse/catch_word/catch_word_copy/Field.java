package Warehouse.catch_word.catch_word_copy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Field extends JPanel implements ActionListener {

    Timer mainTimer = new Timer(20, (ActionListener) this);

    Image img = new ImageIcon("C:\\Users\\User\\IdeaProjects\\java1\\src\\Warehouse\\catch_word\\res\\background.jpg").getImage(); //абсолютный путь

    Cup cup = new Cup();

    public Field() {
        mainTimer.start();
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
