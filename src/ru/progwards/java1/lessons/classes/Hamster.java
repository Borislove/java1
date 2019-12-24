package ru.progwards.java1.lessons.classes;

import static ru.progwards.java1.lessons.classes.AnimalKind.HAMSTER;
import static ru.progwards.java1.lessons.classes.FoodKind.CORN;

//хомяк
public class Hamster extends Animal {

    double weight;

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

  /*  public String toString() {
    return "я хомяк!";

    }*/

    public String toString(){
        //  System.out.println("I am" + getKing()+ " , eat"+ getFoodKind());
        return ("I am " + getKind()+ " , eat "+ getFoodKind());
    }
}