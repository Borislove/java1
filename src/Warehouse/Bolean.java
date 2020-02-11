package Warehouse;

public class Bolean {

    private static int a = 1;
    private static int b = 2;
    private static int c = 3;

    public static void main(String[] args) {

        boolean abc = a + b == c;
        System.out.println(abc);

        boolean abc1 = a - b == c;
        System.out.println(abc1);

        boolean abc2 = a > b ;
        System.out.println(abc2);

        boolean abc3 = a < b ;
        System.out.println(abc3);

        boolean abc4 = a !=b;
        System.out.println(abc4);

        boolean abc5 = a+b !=b;
        System.out.println(abc5);
    }
}
