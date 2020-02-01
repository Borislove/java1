package Warehouse.utils;

import java.util.Random;


// TODO: 01.02.2020 Борис подогнал генератор пароля

public class RandomTest {

    public static String[] data = {"Q", "q", "W", "w", "E", "e", "R", "r", "T", "t", "A", "a", "S", "s", "F", "f",
            "G", "g", "Z", "z", "X", "x", "C", "c", "V", "v", "B", "b", "Y", "y", "U", "u", "I", "i", "O", "o",
            "{", "[", "}", "}", "H", "h", "J", "j", "K", "k", "L", "l", ":", ";", "", "N", "n", "M", "m", "<",
            ">", "?", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "!", "#", "@", "$", "%", "&", "*"};


    static private int randomNum(int min, int max) {
        Random r = new Random();
        return r.nextInt(max) + min;
    }

    public static void main(String[] args) {

        String password = "";
        int length = randomNum(8, 12);
        String[] p = new String[length];

        for (int i = 0; i < length; i++) {
            p[i] = data[randomNum(0, data.length)];
        }
        for (String s : p) {
            password += s;
            System.out.print(s);
        }
    }

}


        //Random r = new Random();
        //System.out.println("Random number " + r.nextInt(100) );

        //System.out.println("Random hash " + r.nextInt(127));   //сколько в юникоде?
       // Integer rand = r.nextInt(127);
      //  System.out.println("Рандомное число" +rand);

      /*  rand = rand.hashCode() ;
        System.out.println("hash"+rand.hashCode());
        System.out.println(rand);
*/

      //rand = rand.toString(rand);
     //   System.out.println(rand.toString(rand).hashCode());
/*

        String test = String.valueOf(rand.toString(rand).hashCode()) ;

        System.out.println(test);
        System.out.println(test.hashCode());
*/

        //Character c = Character.valueOf(r.nextInt(127));

        //Character c = Character.valueOf();






        //----------------------------------
        /*Random ra = new Random();
        String rus = "абвгдеёжзийклмнопрстуфхцчъыьэюя";
        String eng = "abcdefghijklmnopqrstuvwxyz";
        String dig = "0123456789";
        String sum = rus + rus.toUpperCase() +
                eng + eng.toUpperCase() +
                dig;
        char c = sum.charAt(r.nextInt(sum.length()) );
*/

