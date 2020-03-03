package Warehouse.catch_word;

import Warehouse.lost.LostBit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Field extends JPanel implements ActionListener, Runnable {


    LostBit lostBit = new LostBit();

    Timer mainTimer = new Timer(20, (ActionListener) this);

    Image img = new ImageIcon("C:\\Users\\User\\IdeaProjects\\java1\\src\\Warehouse\\catch_word\\res\\background.jpg").getImage(); //абсолютный путь


    Cup cup = new Cup();

    Thread wordsFactory = new Thread(this);

    List<Words> words = new ArrayList<Words>();


    public Field() {
        mainTimer.start();
        wordsFactory.start();
        addKeyListener(new MyKeyAdapter());
        setFocusable(true);
    }

    @Override
    public void run() {
        while (true) {
            Random random = new Random();
            try {
                Thread.sleep(random.nextInt(2000));
                //горизонтально
              /*  words.add(new Words(715,          //позиция объекта  x 715 defolt
                        random.nextInt(600),
                        random.nextInt(60),
                        this
                ));*/
                //вертикально
                words.add(new Words(random.nextInt(600),
                        -519,
                        random.nextInt(30),
                        this
                ));

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private class MyKeyAdapter extends KeyAdapter {
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

        //надпись
       /* g.setColor(Color.GREEN);
        Font font = new Font("Arial", Font.PLAIN, 10);
        g.setFont(font);
        g.drawString("сообщение", 30, 560);*/

        g.setColor(Color.green);
        Font font = new Font("Arial", Font.HANGING_BASELINE, 200);
        g.setFont(font);
        g.drawString("☻", 5, 800);

        g.setColor(Color.BLUE);
        Font font1 = new Font("Arial", Font.BOLD, 30);
        g.setFont(font1);
        g.drawString("Thank you!", 300, 800);

        //прикольно
       /* g.drawString("X", cup.x, 20);
        g.drawString("Y", 20, cup.y);*/

        //g.drawString("" + Integer.toBinaryString(value), 200, 200);

        // g.drawString("" + new LostBit(), 200, 200);

        g.setColor(Color.green);
        Font font3 = new Font("Arial", Font.ITALIC, 15);
        g.setFont(font3);
        //   g.drawString("" + new Timer_4(), -188, 10); //оно не пашет как надо!

        // g.drawString("" +new Timer_4().toString(), 250, 250); //почти...теперь он не считает...

        Iterator<Words> i = words.iterator();
        while (i.hasNext()) {
            Words e = i.next();
            //if (e.x >= 800 || e.x <= -800) {
            if (e.y >= 800 || e.y <= -800) {        //удаляет?
                i.remove();
            } else {
                e.move();
                g.drawImage(e.img, e.x, e.y, null);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cup.move();
        repaint();
        //    System.out.println(words.size());  //вывод слов
        testCollisionWithWords();
    }

    private void testCollisionWithWords() {
        Iterator<Words> i = words.iterator();
        while (i.hasNext()) {
            Words e = i.next();
            if (cup.getRect().intersects(e.getRect())) {
                i.remove();  //удаляем слово из коллекции
            }
        }
    }
}

