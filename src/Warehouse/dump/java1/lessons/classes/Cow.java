package Warehouse.dump.java1.lessons.classes;


import static Warehouse.dump.java1.lessons.classes.AnimalKind.COW;

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
        return FoodKind.HAY;
    }

    @Override
    public double getFoodCoeff(){
        return 0.05;
    }

   /*public String toString(){
        return ("I am " + getKind()+ ", eat "+ getFoodKind());
      //  return "Му-му...";
    } */
}


