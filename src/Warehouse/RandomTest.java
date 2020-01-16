package Warehouse;

import java.util.Random;

// TODO: 16.01.2020 число в хеш из этого хеша символ...
public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        //System.out.println("Random number " + r.nextInt(100) );

        //System.out.println("Random hash " + r.nextInt(127));   //сколько в юникоде?
        Integer rand = r.nextInt(127);
        System.out.println("Рандомное число" +rand);

      /*  rand = rand.hashCode() ;
        System.out.println("hash"+rand.hashCode());
        System.out.println(rand);
*/

      //rand = rand.toString(rand);
     //   System.out.println(rand.toString(rand).hashCode());

        String test = String.valueOf(rand.toString(rand).hashCode()) ;

        System.out.println(test);
        System.out.println(test.hashCode());

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
    }
}
