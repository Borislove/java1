package Warehouse.dump.java1.lessons.classes;

import static Warehouse.dump.java1.lessons.classes.AnimalKind.HAMSTER;
import static Warehouse.dump.java1.lessons.classes.FoodKind.CORN;

//хомяк
public class Hamster extends Animal {

  //  double weight;

    public Hamster(double weight) {
        super(weight);
    }

    //возвращает HAMSTER.
    @Override
    public AnimalKind getKind() {
        return HAMSTER;
    }

    @Override
    //    возвращает CORN
    public FoodKind getFoodKind() {
        return CORN;
    }

    public double getFoodCoeff(){
        return 0.03;
    }

   /* public String toString(){
        return ("I am " + getKind()+ ", eat "+ getFoodKind());
        //return "я хомяк!";
    }*/
}