package Warehouse.books.kettle.player;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

//стр. 202
public class Player {
    private String name;
    private double average;

    public Player(String name, double average) {
        this.name = name;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    public String getAverageString() {
        DecimalFormat decFormate = new DecimalFormat();
        decFormate.setMaximumIntegerDigits(0);
        decFormate.setMinimumFractionDigits(3);
        decFormate.setMinimumFractionDigits(3);
        return decFormate.format(average);
    }
}

@SuppressWarnings("serial")
class TeamFrame extends JFrame {

    public TeamFrame() throws IOException {
        PlayerPlus player;
        Scanner keyboard = new Scanner(new File("C:\\Users\\User\\IdeaProjects\\java1\\src\\Warehouse\\books\\kettle\\Hankees.txt"));

        for (int num = 1; num <= 9; num++) {
            player = new PlayerPlus(keyboard.nextLine(),
                    keyboard.nextDouble());
            keyboard.nextLine();

            addPlayerInfo(player);
        }

        add(new JLabel());
        add(new JLabel(" -----"));
        add(new JLabel("Средний бэттинг команды: "));
        add(new JLabel(PlayerPlus.findTeamAverageString()));

        setTitle("Средние бэттинги Ханков");
        setLayout(new GridLayout(11, 2, 20, 3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    void addPlayerInfo(Player player) {
        add(new JLabel(" " + player.getName()));
        add(new JLabel(player.getAverageString()));
    }
}

class ShowTeamFrame {

    public static void main(String[] args) throws IOException {

        new TeamFrame();
    }
}