package Warehouse;

public class Test2 {

    public static void main(String[] args) {

        System.out.println((0.1 + 0.2) == 0.3); //false
        System.out.println(0.1 + 0.2 == 0.3); //false

        System.out.println((double) (0.1 + 0.2) == 0.3); //false
        System.out.println((double) (0.1 + 0.2) == (double) 0.3); //false

        System.out.println((0.1 + 0.2) * 10 == 0.3 * 10); //false

        System.out.println((0.1 + 0.2) * 10);  //3.0000000000000004
        System.out.println(0.3 * 10);  //3.0

        //   System.out.println(0.1f + 0.2f);
        System.out.println("0.1f + 0.2f == 0.3 " + ((0.1f + 0.2f) == 0.3));  //false
        System.out.print("0.1f + 0.2f == 0.3f ");
        System.out.println(0.1f + 0.2f == 0.3f);  //TRUE!
    }
}
