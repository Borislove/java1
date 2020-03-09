package Warehouse.books.kettle.gameframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

//стр. 311
//Класс в классе
public class GameFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    int randomNumber = new Random().nextInt(10) + 1;
    int numGuesses = 0;
    JTextField textField = new JTextField(5);
    JButton button = new JButton("Сделать попытку");
    JLabel label = new JLabel(numGuesses + " попыток");

    public GameFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(textField);
        add(button);
        add(label);
        button.addActionListener(new MyActionListener());
        pack();
        setVisible(true);
    }

    class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String textFieldText = textField.getText();
            if (Integer.parseInt(textFieldText) == randomNumber) {
                button.setEnabled(false);
                textField.setText(textField.getText() + " Угадал!");
                textField.setEnabled(false);

            } else {
                textField.setText("");
                textField.requestFocus();
            }
            numGuesses++;
            String quessWord = (numGuesses == 1) ? " попытка" : " попыток";
            label.setText(numGuesses + quessWord);
        }
    }
}

class Main{
    public static void main(String[] args) {
        new GameFrame();
    }
}
