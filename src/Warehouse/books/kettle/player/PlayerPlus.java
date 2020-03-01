package Warehouse.books.kettle.player;

import java.text.DecimalFormat;

public class PlayerPlus extends Player {

    private static int playerCount = 0;
    private static double totalOfAverages = .000;
    private static DecimalFormat decFormat = new DecimalFormat();

    static {
        decFormat.setMinimumIntegerDigits(0);
        decFormat.setMaximumFractionDigits(3);
        decFormat.setMaximumFractionDigits(3);
    }

    public PlayerPlus(String name, double average) {
        super(name, average);
        playerCount++;
        totalOfAverages += average;
    }

    public static double findTeamAverage() {
        return totalOfAverages / playerCount;
    }

    public static String findTeamAverageString() {
        return decFormat.format(totalOfAverages / playerCount);
    }
}
