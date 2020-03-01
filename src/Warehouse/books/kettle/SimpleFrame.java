package Warehouse.books.kettle;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")

public class SimpleFrame extends JFrame {

    public SimpleFrame() {
        setTitle("Не щелкайте на кнопке!");  //задает текст в заголовке окна
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new JButton("Щелкните на мне!"));
        setSize(300, 100);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}

class ShowAFrame1 {

    public static void main(String[] args) {
        new SimpleFrame();
    }
}
