package Warehouse.catch_word;

import javax.swing.*;
//import java.awt.*;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Rectangle;

//слова
public class Words {

    int x;
    int y;
    int v;

     Image img = new ImageIcon("C:\\Users\\User\\IdeaProjects\\java1\\src\\Warehouse\\catch_word\\res\\drop.png").getImage();   //стабильно
    //Image img = new ImageIcon(getClass().getResource("/res/drop.png")).getImage();   //не считывает!
    //Image img = new ImageIcon ( "res\\public.png").getImage();   //в коллекции видит , в окне нет
    // Image img = new ImageIcon ( "src\\res\\public.png").getImage();   //в коллекции видит , в окне нет

    //Image img = new ImageIcon("src\\public.png").getImage();   //увидел , но перебросил  в папку src
    //Image img = new ImageIcon("src\\Warehouse\\catch_word\\public.png").getImage();   //тоже видет
   // Image img = new ImageIcon("src\\Warehouse\\catch_word\\res\\public.png").getImage();   //тоже видет

   // Image img = new ImageIcon (getClass().getClassLoader().getResource("public.png")).getImage() ;

    Field field;

    public Rectangle getRect() {    //размер дропа
        return new Rectangle(x, y, 64, 64);
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
