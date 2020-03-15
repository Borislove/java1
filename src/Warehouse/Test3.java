package Warehouse;

public class Test3 {

    private static int a = 1;
    private static int b = 1;
    private static int x = 1;
    private static int d = 3;

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            int result = (a * x + b) * d;
       //     System.out.println(result);
            a++;
            b++;
            x++;
            d++;
        }
    }
}
