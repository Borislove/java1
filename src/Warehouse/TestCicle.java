package Warehouse;

//цикл в цикле
public class TestCicle {

    private static int value = 1;

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            System.out.println("Цикл 1 iteration: " + i + " value:" + value);
            //value++;

            for (int j = 1; j < i; j++) {
                //value--;
                System.out.println("Цикл 2 iteration: " + j + " value:" + value);
                //value++;

                for (int k = 1; k < 11; k++) {
                    System.out.println("Цикл 3 iteration: " + k + " value:" + value);
                }
            }
            value++;
        }
    }
}
