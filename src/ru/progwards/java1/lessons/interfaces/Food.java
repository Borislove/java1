package ru.progwards.java1.lessons.interfaces;

//3.5 Создать класс Food (еда), которое никак не связано иерархией наследования с Animal.

import java.util.Objects;

public class Food implements CompareWeight {

    //3.6 В классе Food разместить приватную переменную int weight - вес еды в граммах,
    // реализовать в классе конструктор, принимающий и устанавливающий значение веса.
    private int weight;

    public Food(int weight) {
        this.weight = weight;
    }

    //3.7 Реализовать метод public int getWeight(), возвращающий сохраненное значение веса.
    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return weight == food.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt) {
        if (weight < smthHasWeigt.weight) {
            return CompareResult.LESS;
        }
        if (weight == smthHasWeigt.weight) {
            return CompareResult.EQUAL;
        }
        if (weight > smthHasWeigt.weight) {
            return CompareResult.GREATER;
        }
        return CompareResult.NULL;
    }


    public static void main(String[] args) {
        new Cow(300).compareWeight(new Duck(200));

        System.out.println(new Cow(300).compareWeight(new Duck(200)));

        new Food(300).compareWeight(new Food(300));
        System.out.println(new Food(300).compareWeight(new Food(300)));

        System.out.println(new Food(300).compareWeight(new Food(400)));

        System.out.println(new Animal(300D).compareWeight(new Cow(300D)));

    }
}

