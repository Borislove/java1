package Warehouse.books.kettle.chapter15.applets;

import javax.swing.*;
import java.awt.*;

//давно не используют...но для ознакомления сойдет
public class SimpleApplet extends JApplet {
    private static final long serialVersionUID = 1L;

    public void init() {
        setContentPane(new DummiesPanel());
    }
}

class DummiesPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    public void paint (Graphics myGraphics) {
        myGraphics.drawRect(50,60,250,75);
        myGraphics.setFont(new Font("Dialog", Font.BOLD, 24));
        myGraphics.drawString("Java for ",55,100);
    }
}
