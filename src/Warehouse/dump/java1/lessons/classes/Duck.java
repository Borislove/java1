package Warehouse.dump.java1.lessons.classes;


import static Warehouse.dump.java1.lessons.classes.AnimalKind.DUCK;

//утка
public class Duck extends Animal {

  //  double weight;

    public Duck(double weight) {
        super(weight);
    }

    @Override
    //возвращает DUCK
    public AnimalKind getKind(){
        return DUCK;
    }
    //возвращает CORN
    @Override
    public FoodKind getFoodKind(){
        return FoodKind.CORN;
    }
    public double getFoodCoeff(){
        return 0.04;
    }

  /* public String toString() {
       return ("I am " + getKind() + ", eat " + getFoodKind());
    // return "Кря кря!";
   }*/
}
