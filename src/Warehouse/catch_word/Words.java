package Warehouse.catch_word;

import javax.swing.*;
import java.awt.*;


public class Words {

    int x;
    int y;
    int v;

    Image img = new ImageIcon("C:\\Users\\User\\IdeaProjects\\java1\\src\\Warehouse\\catch_word\\res\\drop.png").getImage();

    Field field;

    public Rectangle getRect() {    //размер дропа
return new Rectangle(x,y,64,64);
    }

    public Words(int x, int y, int v, Field field) {
        this.x = x;
        this.y = y;
        this.v = v;
        this.field = field;
    }

    //движение объекта
    public void move() {
        //x = x - field.cup.v - v;  //справа налево
        //y = y - field.cup.v - v; //снизу вверх

        y = y + field.cup.v + v;  //сверху вниз
    }
}
