package Warehouse.algoritm;

import java.util.Scanner;

//Алгоритм Евклида
//наибольший общий делитель
public class Evklid {

    private static Scanner key = new Scanner(System.in);

    public static int evklid(int m, int n) {

        int result = 0;
        while (n != 0) {
            result = m % n;
            m = n;
            n = result;
        }
        return m;
    }

    public static int evklid2(int a, int b) {

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public static void main(String[] args) {

        /*System.out.println(evklid(150, 210));
        System.out.println(evklid(99, 315));
        System.out.println(evklid2(5, 15));*/

        System.out.println(evklid2(key.nextInt(), key.nextInt()));
    }
}
