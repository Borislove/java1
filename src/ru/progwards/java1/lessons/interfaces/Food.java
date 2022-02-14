package ru.progwards.java1.lessons.interfaces;

//3.5 Создать класс Food (еда), которое никак не связано иерархией наследования с Animal.
public class Food implements CompareWeight {

    //3.6 В классе Food разместить приватную переменную int weight - вес еды в граммах, реализовать в классе конструктор,
    //принимающий и устанавливающий значение веса.

    private int weight;

    public Food(int weight) {
        this.weight = weight;
    }

    //3.7 Реализовать метод public int getWeight(), возвращающий сохраненное значение веса.

    public int getWeight() {
        return weight;
    }


        /*3.7 Для класса Food реализовать интерфейс CompareWeight..Сравнение сделать на основе веса еды.
    Метод CompareResult compareWeight должен возвращать
    LESS если свой вес < веса параметра метода
    EQUAL если свой вес = веса параметра метода
    GREATER если свой вес > веса параметра метода*/

    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt) {

        Food food = (Food) smthHasWeigt;

//        if (food.getWeight() > this.getWeight()) return CompareResult.LESS;
        //if (food.getWeight() > this.weight) return CompareResult.LESS;

        if (this.weight < food.getWeight()) return CompareResult.LESS;

        if (this.weight == food.getWeight()) return CompareResult.EQUAL;

        if (this.weight > food.getWeight()) return CompareResult.GREATER;

        //return CompareResult.NULL;
        return null;
    }

    public static void main(String[] args) {

    }

}
