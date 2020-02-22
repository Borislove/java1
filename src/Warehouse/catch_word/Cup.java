package Warehouse.catch_word;

import javax.swing.*;
import java.awt.*;

public class Cup {

   Image img = new ImageIcon("C:\\Users\\User\\IdeaProjects\\java1\\src\\Warehouse\\catch_word\\res\\cup.png").getImage();

    int v = 3;
    int dv = 0;
    int s = 1;

    int layer1 = 0;

    int x = 350;
    int y = 510;

    public void move() {
        s += v;
        layer1 += v;
    }
}
