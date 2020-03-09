package Warehouse.mycharacter;

public class CharTest5 {

    private static Character ch = 'a';


    public static void main(String[] args) {

        for (int i = 0; i < 26; i++) {
            ch = Character.toLowerCase(ch);
            System.out.println(" ");
            System.out.print(ch +  " "+ ch.hashCode());
            System.out.print("  --->  ");
            ch = ch.toUpperCase(ch);
            System.out.print(ch + " " + ch.hashCode());
            ch++;
        }
    }
}
