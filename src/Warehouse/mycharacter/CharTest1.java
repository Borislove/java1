package Warehouse.mycharacter;

//заместо нескольких переменных 1 и меняет значение после + проверка на вес
//без Ё
public class CharTest1 {
    private static Character ch;

    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("small english letters");
        System.out.println("----------------------");
        ch = 'a';
        for (int i = 1; i < 27; i++) {
            System.out.println(ch);
            ch++;
        }
        System.out.println("--------------------------");
        System.out.println("uppercase english letters");
        System.out.println("--------------------------");
        ch = 'A';
        for (int i = 1; i < 27; i++) {
            System.out.println(ch);
            ch++;
        }
        System.out.println("--------------------------");
        System.out.println("строчные-мелкие буквы");
        System.out.println("--------------------------");
        ch = 'а';
        for (int i = 1; i < 33; i++) {
            System.out.println(ch);
            ch++;
        }
        System.out.println("--------------------------");
        System.out.println("заглавны (большие) буквы");
        System.out.println("--------------------------");
        ch = 'А';
        for (int i = 1; i < 33; i++) {
            System.out.println(ch);
            ch++;
        }
    }
}
