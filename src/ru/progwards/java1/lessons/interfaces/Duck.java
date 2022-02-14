package ru.progwards.java1.lessons.interfaces;

/*Реализовать класс Duck, потомок класса Animal, переопределяющий методы:
1.8 public AnimalKind getKind(), который возвращает DUCK.
1.9 public FoodKind getFoodKind(), который возвращает CORN */

public class Duck extends Animal {

    static{
        System.out.println("Утка создана");
    }

    public Duck(double weight) {
        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        return AnimalKind.DUCK;
    }

    @Override
    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    /*2.5 Для класса Duck, переопределить метод:
    public double getFoodCoeff(), который должен возвращать 0.04*/
    @Override
    public double getFoodCoeff() {
        return 0.04;
    }
}
