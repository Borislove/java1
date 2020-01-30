package Warehouse.Hello;

import java.util.Random;

//без комментариев
public class HelloJava_10 {

    static int x = (int) (2*Math.PI); // классная эта Math


    static Random rnumb = new Random();

    public static int number = 0;

    static void hmm() {

    }

    static void hmm20() {
        System.out.println("HELLO HELLO");
    }

    static void hmm30() {
        System.out.println("WORLD WORLD");
    }

    static void hmm40() {
        System.out.println("JAVA JAVA JAVA");
    }

    static void hmm50() {
        System.out.println("РЕКЛАМНОЕ МЕСТО СДАЕТСЯ");
    }

    static void hmm60() {
        System.out.println("Random number " + rnumb.nextInt(5));
    }


    public static void main(String[] args) throws InterruptedException {


        System.out.println("Hello world");
        System.out.println("hello world");
        System.out.println("сколько мне этих хеллов напечатать еще?");
        System.out.println("сколько мне этих хеллов напечатать еще?");

        System.out.println("надо автоматизировать");

        for (int i = 0; i < 100; i++) {
            //сделаю 100 хеловов
            System.out.println("HELLO WORLD! HELLO JAVA!" + number);
          //  number++;

            switch (i) {
                case 20:
                    hmm20();
                    break;
                case 30:
                    hmm30();
                    break;
                case 40:
                    hmm40();
                    break;
                case 50: //рекламное место
                    for (int j = 0; j < 10; j++) {
                        hmm50();
                    }
                    break;
                case 60: // рандомное число
                    for (int j = 0; j < 5 ; j++) {
                        System.out.println("Сейчас выпадет рандомное число, ждите... ");
                        if(rnumb.equals(3)) { //походу не работает тут
                            System.out.println("ERROR");
                            continue;
                        }
                        Thread.sleep(1500);
                    hmm60(); }
                    break;
//                default:
                //                  System.out.println("Default");


            }
           number++;

        }
    }
}



