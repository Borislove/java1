package Warehouse.Utils;

import java.util.Random;

//где то было с циклом,
// даже такая простейшая программа давала результат, нужны были числа для новых страниц в хтмл
public class RandomNumbers {

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("Random number " + r.nextInt(1000) );

    }
}
