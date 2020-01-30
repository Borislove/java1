package Warehouse.sleep;


// TODO: 30.12.2019    вот такая вот задумка...
// ПРИВЕТ
/**
 * П
 * Р
 * И
 * В
 * Е
 * Т
 *
 * пр
 * р
 * и
 * в
 * е
 * т
 *
 * при
 * ри
 * и
 * в
 * е
 * т
 *
 * прив
 * рив
 * ит
 * в
 * е
 * т
 */


public class Sleep_1 {
    public static void main(String[] args)throws InterruptedException  {

        long start = System.currentTimeMillis();
        Thread.sleep(500);
        System.out.println("Привет!");

        for(int i = 0 ; i < 10; i++) {
            Thread.sleep(300);
            System.out.println(Text.П);

            if (i==2) {
            Thread.sleep(300);
            System.out.println(Text.р+"и");




            }

            Thread.sleep(300);
            System.out.println(Text.р);
            Thread.sleep(300);
            System.out.println(Text.и);
            Thread.sleep(300);
            System.out.println(Text.в);
            Thread.sleep(300);
            System.out.println(Text.е);
            Thread.sleep(300);
            System.out.println(Text.т);
            System.out.println("!!!");
        }

    }
}

enum Text{
    П,р,и,в,е,т
}
