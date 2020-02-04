package com.javacourse.se.lesson5;


import com.javacourse.se.lesson20.Music;

public class Main {
    public static void main(String[] args) {
        Music mc = Music.CLASSIC;
        //  Music.values(); //вернется все перечисление
        //--------------------------------------------------
        /*for (Music element : Music.values()) {
            System.out.println(element);
        }*/
        //---------------------------------------------------
       /* Music mc2 = Music.valueOf(Music.class, "ROCK");
        System.out.println(mc);
        System.out.println(mc2);

        System.out.println(mc.ordinal());  //как в массивах и коллекциях индекс

        switch (mc) {
            case CLASSIC:
                System.out.println("Classic");
                break;
            case POP:
                System.out.println("Pop");
                break;
            case ROCK:
                System.out.println("ROck");
                break;
        }*/
       //---------------------------------------------
        System.out.println(mc.getI());
        System.out.println(mc.getName());

        mc.foo();
    }
}
