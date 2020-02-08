package com.skillbox;

import java.util.Scanner;

public class Cofee {

    public static void main(String[] args) {

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
                System.out.println("Недостаточно средств :");
            }
        }
    }
}


