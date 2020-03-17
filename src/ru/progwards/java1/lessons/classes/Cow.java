package ru.progwards.java1.lessons.classes;

public class Cow extends Animal {

    public Cow(double weight) {
        super(weight);
    }

    /*1.4 public AnimalKind getKind(), который возвращает COW.*/
    @Override
    public AnimalKind getKind() {
        return AnimalKind.COW;
    }

    /*1.5 public FoodKind getFoodKind(), который возвращает HAY*/
    @Override
    public FoodKind getFoodKind() {
        return FoodKind.HAY;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
