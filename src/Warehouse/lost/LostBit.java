package Warehouse.lost;

import java.util.Random;

public class LostBit {

    public static String str2 = " ";

    public static void giveMeBinary() throws InterruptedException {

        while (true) {
            Thread.sleep(200);
            Random random = new Random();
            // System.out.println(random.nextInt(2000));
            str2 = String.valueOf(random.nextInt(100));
            Integer value = Integer.valueOf(str2);
            String str2 = String.valueOf(Integer.toBinaryString(value));
            System.out.println(str2);
            System.out.println(Integer.toBinaryString(value));
        }
    }


    public static void main(String[] args) throws InterruptedException {
        giveMeBinary();
    }

    @Override
    public String toString() {
        return (str2);
    }
}



