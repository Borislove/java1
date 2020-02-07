//https://www.youtube.com/watch?v=PPAJBhcqIQo&feature=emb_logo

package com.skillbox;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws AWTException {

        System.out.println("Кофе-машина");

        int[] drinkPrices = {150, 80, 20};
        String[] drinkNames = {"капучино", "эспрессо", "воду"};
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int moneyAmount = scan.nextInt();
            boolean canBuyAnything = false;
            for (int i = 0; i < 3; i = i + 1) {
                if (moneyAmount >= drinkPrices[i]) {
                    System.out.println("Вы можете купить " + drinkNames[i]);
                    canBuyAnything = true;
                }
            }
            if (!canBuyAnything) {
                System.out.println("Недостаточно средств :( Учите Java и зарабатывайте много :)");
            }
            // 20200206_201535  .png
            SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
            Date date = new Date();
            System.out.println(formatter.format(date));

            BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            System.out.println(image.getWidth() + "x" + image.getHeight());
            //#уменяполучилось
        }
    }
}
