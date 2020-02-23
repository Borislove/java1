package Warehouse.catch_word.catch_word_copy;

import javax.swing.*;
import java.awt.*;

public class Cup {

    Image img = new ImageIcon("C:\\Users\\User\\IdeaProjects\\java1\\src\\Warehouse\\catch_word\\res\\cup.png").getImage();

    int v = 3;
    int dv = 0;
    int s = 1;

    int layer1 = 0;
    int layer2 = -590;

    int x = 350;
    int y = 510;

    public void move() {
        s += v;
        if (layer2 - v >= 0) {
            layer1 = 0;
            layer2 = -590;
        } else {
            layer1 += v;
            layer2 += v;
        }
    }
}
