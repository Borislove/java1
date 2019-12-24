package ru.progwards.java1.lessons.classes;


import static ru.progwards.java1.lessons.classes.AnimalKind.COW;
import static ru.progwards.java1.lessons.classes.FoodKind.HAY;

//му-му
public  class Cow extends Animal {
    double weight;

    public Cow(double weight) {
        super(weight);
    }

    //@Override
    public AnimalKind getKing(){
        return COW;}

    // @Override
    public FoodKind getFoodKing() {
        return HAY;}

    /*public String toString(){
        return "Му-му...";
    }
*/

    /*public String toString(){
      //  System.out.println("I am" + getKing()+ " , eat"+ getFoodKind());
        return ("I am " + getKing()+ " , eat "+ getFoodKind());
    }*/
}


