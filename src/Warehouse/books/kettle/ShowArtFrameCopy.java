package Warehouse.books.kettle;

import javax.swing.*;
import java.awt.*;

//попытка подвинуть объект...
//оно вроде рисует, но зависает конкретно...и старый объект надо удалять как то..
class ShowFrameCopy {

    public static void main(String[] args) {

        ArtFrame1 artFrame1 = new ArtFrame1(new Drawing1());

        artFrame1.setSize(500, 500);
        artFrame1.setVisible(true);
        artFrame1.setLocationRelativeTo(null);
    }
}

class Drawing1 {

    // public int x = 40, y = 40, width = 40, height = 40;

    public void paint(Graphics g) throws InterruptedException {

        //   g.drawOval(x, y, width, height);
        //g.drawOval(x + 50, y, width, height);
        //  Thread.sleep(1000);
        //  g.clearRect(x, y, width, height); //очищает..

        for (int x = 0, y = 0, width = 50, height = 50; x <= 500; ) {
            g.setColor(Color.BLUE);
            x += 30;
            // g.clearRect(x, y, width, height); //интересно
            g.drawOval(x, y, width, height);
            Thread.sleep(1000);

        }
    }
}

class ArtFrame1 extends JFrame {
    private static final long serialVersionUID = 1L;

    Drawing1 drawing1;

    public ArtFrame1(Drawing1 drawing1) {
        this.drawing1 = drawing1;
        setTitle("овальчик");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        try {
            drawing1.paint(g);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}