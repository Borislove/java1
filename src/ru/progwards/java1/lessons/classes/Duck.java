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

    /*2.5 Для класса Duck, переопределить метод:
    public double getFoodCoeff(), который должен возвращать 0.04*/
    @Override
    public double getFoodCoeff() {
        return 0.04;
    }

}
