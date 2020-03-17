package ru.progwards.java1.lessons.classes;

public class Duck extends Animal {

    public Duck(double weight) {
        super(weight);
    }

    /*1.8 public AnimalKind getKind(), который возвращает DUCK.*/
    @Override
    public AnimalKind getKind() {
        return AnimalKind.DUCK;
    }

    /*1.9 public FoodKind getFoodKind(), который возвращает CORN*/
    @Override
    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }

    /*@Override
    public String toString() {
        return super.toString();
    }*/
}
