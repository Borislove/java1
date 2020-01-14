package Warehouse.test;

import java.io.IOException;

// TODO: 12.01.2020  Вышла замечательная программа из-за которой завис коомпьютер...
// заменить 11строку   for (int i = 1; i < 100000; i--)
public class HappyJava {

    public static void main(String[] args) throws InterruptedException, IOException {
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 100; i++) {
            Thread.sleep(1);
            Runtime.getRuntime().exec("cmd /C start cls");
            System.out.println("nyam"+i);
        }
    }
}


