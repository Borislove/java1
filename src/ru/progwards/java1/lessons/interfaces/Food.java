package ru.progwards.java1.lessons.interfaces;

//3.5 Создать класс Food (еда), которое никак не связано иерархией наследования с Animal.

public class Food {

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
}
