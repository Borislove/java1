package Warehouse.mycharacter;

//от a до z
public class CharTest7 {

    private static Character ch = 'a';

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 26; i++) {
            System.out.print(ch + "\r");
            Thread.sleep(300);
            //System.out.print("\r");
            ch++;
        }
    }
}
