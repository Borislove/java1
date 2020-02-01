package ru.progwards.t7.T7_2;
//Битовые операции на практике
public class Shifr {
    public static void main(String[] args) {
        char key = 0b01001011_10001011; //ключ который будет шифровать

        char c1 = 'А';
        char c2 = 'К';
        char c3 = 'М';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        c1 ^=key;
        c2 ^=key;
        c3 ^=key;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        c1 ^=key;
        c2 ^=key;
        c3 ^=key;


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }
}
