package Warehouse.mycharacter;

//можно аперкейс сделать  Character, через оболочку
//пропала буква Ё
// 2,46 КБ (2 523 байт)
public class CharTest {

    private static char myCharMiniEng = 'a';
    private static char myCharLargeEng = 'A';
    private static int value = 1;

    private static Character myCharMiniRu = 'а';
    private static Character myCharLargeRu = 'А';   // BIG....

    public static void main(String[] args) {

        //  System.out.println(myChar);

        System.out.println("----------------------");
        System.out.println("small english letters");
        System.out.println("----------------------");
        for (int i = 1; i < 27; i++) {
            System.out.println("value: " + value + " char:" + myCharMiniEng);
            value++;
            myCharMiniEng++;
            if (value == 27) {
                value = 1;
            }
        }
        System.out.println("--------------------------");
        System.out.println("uppercase english letters");
        System.out.println("--------------------------");
        for (int i = 1; i < 27; i++) {
            System.out.println("value: " + value + " char:" + myCharLargeEng);
            value++;
            myCharLargeEng++;
            if (value == 27) {
                value = 1;
            }
        }

        System.out.println("--------------------------");
        System.out.println("строчные-мелкие буквы");
        System.out.println("--------------------------");
        for (int i = 1; i < 33; i++) {
            System.out.println("value: " + value + " char:" + myCharMiniRu);
            value++;
            myCharMiniRu++;

            if (value == 7) {
                char e = 'ё';
                System.out.println("value: " + value + " char:" + e + "<<<<-------------Наше ВСЁ------");
                value = 8;
            }

            if (value == 34) {
                value = 1;
            }
        }

        System.out.println("--------------------------");
        System.out.println("заглавны (большие) буквы");
        System.out.println("--------------------------");

        for (int i = 1; i < 33; i++) {
            System.out.println("value: " + value + " char:" + myCharLargeRu);
            value++;
            myCharLargeRu++;

            if (value == 7) {
                char e = 'Ё';
                System.out.println("value: " + value + " char:" + e + "<<<<-------------Наше ВСЁ------");
                value = 8;
            }
        }


        //test test test  no test no test....//вроде получилось!
        for (int i = 1; i < 33; i++) {
            //Character.toUpperCase(myCharMiniRu);
            Character.toLowerCase(myCharMiniRu);
            myCharMiniRu--;
            System.out.println(myCharMiniRu);
        }
    }
}




/*В английском алфавите 26 букв
 *
 * В русском алфавите 33 буквы
 * */