package Warehouse.proverbs;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Proverbs1 {

    private static int score = 1;

    public static void main(String[] args) throws IOException {

        ArrayList<String> proverbs = new ArrayList<String>();
        Scanner diskScanner = new Scanner(new File("C:\\Users\\User\\IdeaProjects\\java1\\src\\Warehouse\\proverbs\\proverbs.txt"));

        while (diskScanner.hasNext()) {
            proverbs.add(diskScanner.nextLine());
        }

        for (String value : proverbs) {
            System.out.println(value + " (" + score + ")");
            score++;
        }
    }
}

