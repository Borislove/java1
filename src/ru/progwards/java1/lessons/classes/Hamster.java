package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal {

    public Hamster(double weight) {
        super(weight);
    }

    /*1.6  public AnimalKind getKind(), который возвращает HAMSTER.*/
    @Override
    public AnimalKind getKind() {
        return AnimalKind.HAMSTER;
    }

    /*1.7 public FoodKind getFoodKind(), который возвращает CORN*/
    @Override
    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }

    /*@Override
    public String toString() {
        return super.toString();
    }*/
}
