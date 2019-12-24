package ru.progwards.java1.lessons.classes;


import static ru.progwards.java1.lessons.classes.AnimalKind.COW;
import static ru.progwards.java1.lessons.classes.FoodKind.HAY;

//му-му
public class Cow extends Animal {

//    double weight;

    public Cow(double weight) {
        super(weight);
    }

    @Override
    //возвращает му-му
    public AnimalKind getKind(){
        return COW;
    }

     @Override
     //возвращает сено
    public FoodKind getFoodKind() {
        return HAY;
    }

    @Override
    public double getFoodCoeff(){
        return 0.05;
    }

  /*  public String toString(){
        return ("I am " + getKind()+ ", eat "+ getFoodKind());
      //  return "Му-му...";
    }*/
}


