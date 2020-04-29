package ru.progwards.java1.lessons.interfaces;

//3.5 Создать класс Food (еда), которое никак не связано иерархией наследования с Animal.

import java.util.Objects;

public class Food implements CompareWeight {

    //3.6 В классе Food разместить приватную переменную int weight - вес еды в граммах,
    // реализовать в классе конструктор, принимающий и устанавливающий значение веса.
    private int weight;

    public Food(int weight) {
        // super();
        this.weight = weight;
    }

    //3.7 Реализовать метод public int getWeight(), возвращающий сохраненное значение веса.
    public int getWeight() {
        return weight;
    }



    public static void main(String[] args) {


        System.out.println(new Cow(300).compareWeight(new Duck(200)));

        System.out.println(new Food(300).compareWeight(new Food(300)));

        System.out.println(new Food(300).compareWeight(new Food(400)));

        System.out.println(new Animal(300D).compareWeight(new Cow(300D)));  //Возвращено: GREATER, ожидалось: EQUAL.

        System.out.println(new Cow(300D).compareWeight(new Duck(2D))); //Возвращено: EQUAL, ожидалось: GREATER.
    }
}

