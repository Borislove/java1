package Warehouse.books.kettle;

import javax.swing.*;
import java.awt.*;

//стр. 283
//Отображение фрейма ArtFrame //рисование овала
class ShowFrame {

    public static void main(String[] args) {

        ArtFrame artFrame = new ArtFrame(new Drawing());

        artFrame.setSize(200, 100);
        artFrame.setVisible(true);
    }
}

class Drawing {  //сделаешь паблик не работает
    /*public int x = 40;
    public int y = 40;
    public int width = 40;
    public int height = 40;*/

    public int x = 40, y = 40, width = 40, height = 40;

    public void paint(Graphics g) {
        g.drawOval(x, y, width, height);
    }
}

class ArtFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    Drawing drawing;

    public ArtFrame(Drawing drawing) {
        this.drawing = drawing;
        setTitle("Произведение абстрактно искусства");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        drawing.paint(g);
    }
}