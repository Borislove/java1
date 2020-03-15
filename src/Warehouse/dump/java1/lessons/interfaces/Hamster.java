package Warehouse.dump.java1.lessons.interfaces;


import static Warehouse.dump.java1.lessons.interfaces.FoodKind.CORN;

//хомяк
public class Hamster extends Animal {

    //  double weight;

    public Hamster(double weight) {
        super(weight);
    }

    //возвращает HAMSTER.
    @Override
    public AnimalKind getKind() {
        return AnimalKind.HAMSTER;
    }

    @Override
    //    возвращает CORN
    public FoodKind getFoodKind() {
        return CORN;
    }

    public double getFoodCoeff() {
        return 0.03;
    }
}