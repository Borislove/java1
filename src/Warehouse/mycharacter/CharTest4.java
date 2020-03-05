package Warehouse.mycharacter;

//в одной строчке то удобно , но не понятно
public class CharTest4 {

    private static Character ch;
    private static int value = 1;

    public static void main(String[] args) {

        ch = 'a';
        System.out.println("----------------------");
        System.out.println("letters");
        System.out.println("----------------------");
        for (int i = 1; i < 27; i++) {
            System.out.print("value: " + value + " charMini: " + ch + " charBig: " + Character.toUpperCase(ch) + " hashCharMini: " + ch.hashCode() + " hachCharBig: "); //?
            System.out.println(" ");
            value++;
            ch++;
        }
    }
}


