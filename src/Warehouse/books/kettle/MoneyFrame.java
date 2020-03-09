package Warehouse.books.kettle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;

//стр. 306
//Конвертирование местных валют
public class MoneyFrame extends JFrame implements KeyListener, ItemListener, MouseListener {

    private static final long serialVersionUID = 1L;

    JLabel fromCurrencyLabel = new JLabel(" ");
    JTextField textField = new JTextField(5);
    JLabel label = new JLabel("     ");
    JComboBox combo = new JComboBox();

    NumberFormat currencyUS = NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat currencyUK = NumberFormat.getCurrencyInstance(Locale.UK);

    public MoneyFrame() {
        setLayout(new FlowLayout());

        add(fromCurrencyLabel);
        add(textField);
        combo.addItem("Доллары в фунты");
        combo.addItem("Фунты в доллары");
        add(label);
        add(combo);

        textField.addKeyListener(this);
        combo.addItemListener(this);
        label.addMouseListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(300, 100);
        setVisible(true);
        setLocation(null);
    }

    void setTextOnLabel() {
        String amountString = "";
        String fromCurrency = "";
        try {
            double amount = Double.parseDouble(textField.getText());
            if (combo.getSelectedItem().equals("Доллары в фунты")) ;
            {
                amountString = " = " + currencyUK.format(amount * 0.61214);
                fromCurrency = "$";
            }
            if (combo.getSelectedItem().equals("Фунты в доллары")) {
                amountString = " = " + currencyUS.format(amount * 1.63361);
                fromCurrency = "\u00A3";
            }

        } catch (NumberFormatException e) {
        }
        label.setText(amountString);
        fromCurrencyLabel.setText(fromCurrency);
    }

    @Override
    public void keyReleased(KeyEvent k) {
        setTextOnLabel();
    }

    @Override
    public void keyPressed(KeyEvent k) {

    }

    @Override
    public void keyTyped(KeyEvent k) {

    }

    @Override
    public void itemStateChanged(ItemEvent i) {
        setTextOnLabel();
    }

    @Override
    public void mouseEntered(MouseEvent m) {
        label.setForeground(Color.red);
    }

    @Override
    public void mouseExited(MouseEvent m) {
        label.setForeground(Color.black);
    }

    @Override
    public void mouseClicked(MouseEvent m) {

    }

    @Override
    public void mousePressed(MouseEvent m) {

    }

    @Override
    public void mouseReleased(MouseEvent m) {

    }
}

class ShowMoneyFrame {
    public static void main(String[] args) {
        new MoneyFrame();
    }
}
