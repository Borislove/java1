package ru.progwards.java1.lessons.classes;

/*Реализовать класс Cow, потомок класса Animal, переопределяющий методы:
1.4 public AnimalKind getKind(), который возвращает COW.
1.5 public FoodKind getFoodKind(), который возвращает HAY */

public class Cow extends Animal {

    public Cow(double weight) {
        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        return AnimalKind.COW;
    }

    @Override
    public FoodKind getFoodKind() {
        return FoodKind.HAY;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    /*2.3 Для класса Cow, переопределить метод:
    public double getFoodCoeff(), который должен возвращать 0.05*/
    @Override
    public double getFoodCoeff(){
        return 0.05;
    }
}
