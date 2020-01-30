package Warehouse.Hello;

import java.util.Random;

//без комментариев
public class HelloJava_10 {

    public static int number = 1;

    static void hmm() {

    }

    public static void main(String[] args) {

        Random rnumb = new Random();

        System.out.println("Hello world");
        System.out.println("hello world");
        System.out.println("сколько мне этих хеллов напечатать еще?");
        System.out.println("сколько мне этих хеллов напечатать еще?");

        System.out.println("надо автоматизировать");

        for (int i = 0; i < 100; i++) {
            //сделаю 100 хеловов
            System.out.println("HELLO WORLD! HELLO JAVA!" + number);
            number++;

            if (number == 20) {
                System.out.println("HELLO HELLO");
            }
            if (number == 30) {
                System.out.println("WORLD WORLD");
            }
            if (number == 40) {
                System.out.println("JAVA JAVA JAVA");
            }
            if (number == 50) {
                for (int j = 0; j < 10; j++) {
                    System.out.println("РЕКЛАМНОЕ МЕСТО СДАЕТСЯ");
                    number--; //тут поставил и дальше не ползет цикл в 49 упирается и сброс
                }
            }

            if (number == 60) {
                for (int j = 0; j < 10; j++) {
                    System.out.println("Random number " + rnumb.nextInt(1000));
                }
            }
        }
    }
}


