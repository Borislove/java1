package Warehouse.utils;

import java.util.Random;

// TODO: 30.01.2020 неудобно использовать
//где то было с циклом,
// даже такая простейшая программа давала результат, нужны были числа для новых страниц в хтмл
public class RandomNumbers {

    public static void main(String[] args) {
        //----------------------1----------------------------------------
        Random r = new Random();
        System.out.println("Random number " + r.nextInt(1000) );


        //----------------------2----------------------------------------
        System.out.println("1-ое случайное число: " + Math.random());
        System.out.println("2-ое случайное число: " + Math.random());
        System.out.println("3-е случайное число: " + Math.random());

        //----------------------3----------------------------------------
        int a = 0; // Начальное значение диапазона - "от"
        int b = 10; // Конечное значение диапазона - "до"

        int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
        System.out.println("1-ое случайное число: " + random_number1);

        int random_number2 = a + (int) (Math.random() * b); // Генерация 2-го числа
        System.out.println("2-ое случайное число: " + random_number2);

        int random_number3 = a + (int) (Math.random() * b); // Генерация 3-го числа
        System.out.println("3-е случайное число: " + random_number3);

        //------------------------тест--------------------------------------
        int rand = (int) Math.random()*Integer.MIN_VALUE;
        System.out.println("random" +rand);
        int rand1 = Integer.MAX_VALUE - (int)Math.random()*Integer.MIN_VALUE; //вот намудрил сам не пойму и не работает зараза
        System.out.println("random " +rand1);


        //new Random().nextInt( 100 );
    }
}
