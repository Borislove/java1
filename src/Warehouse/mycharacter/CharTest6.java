package Warehouse.mycharacter;

public class CharTest6 {

    private static Character ch = 'a';

    public static void main(String[] args) {

        //прикольно
        for (int i = 0; i < 26; i++) {
            ch = Character.toLowerCase(ch);
            System.out.print(" ");
            System.out.println(ch);
            ch = ch.toUpperCase(ch);
            System.out.println(ch);
            ch++;
        }
    }
}
