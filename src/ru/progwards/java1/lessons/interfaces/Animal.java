package ru.progwards.java1.lessons.interfaces;

enum AnimalKind {
    ANIMAL,
    COW,
    HAMSTER,
    DUCK
}

enum FoodKind {
    UNKNOWN,
    HAY,
    CORN
}

public class Animal {

    double weight;

    /*1.0 Реализовать конструктор
    public Animal(double weight), который сохраняет вес животного.*/

    public Animal(double weight) {
        this.weight = weight;
    }

    /*1.1 Метод:
    public AnimalKind getKind(), который возвращает
    вид животного (enum AnimalKind - ANIMAL, COW, HAMSTER, DUCK). В данном классе вернуть ANIMAL*/

    public AnimalKind getKind() {
        return AnimalKind.ANIMAL;
    }

    /*1.2 Метод
    public FoodKind getFoodKind(), который возвращает
    вид еды, (enum FoodKind - UNKNOWN, HAY, CORN). В данном классе вернуть UNKNOWN*/

    public FoodKind getFoodKind() {
        return FoodKind.UNKNOWN;
    }

    /*2.1 В классе Animal реализовать метод:
    public double getWeight(), который возвращает вес животного*/

    public double getWeight() {
        return weight;
    }

    /*2.2 Реализовать метод
    public double getFoodCoeff(), который возвращает коэффициент веса еды к весу тела животного.
    Для класса Animal это 0.02*/

    public double getFoodCoeff() {
        return 0.02;
    }

    /*2.6 Для класса Animal, реализовать метод:
    public double calculateFoodWeight(), который
    рассчитывает необходимый вес еды, по формуле - вес-еды = вес-животного * коэффициент веса тела.*/
    public double calculateFoodWeight() {
        return getWeight() * getFoodCoeff();
    }

    /*1.3 Метод
    public String toString(), который возвращает информацию о животном в формате:
    I am <AnimalKind>, eat <FoodKind>*/

    @Override
    public String toString() {
        return "I am " + getKind() + ", eat " + getFoodKind();
    }

    /*2.7 Для класса Animal, создать метод
    public String toStringFull(), что бы он возвращал информацию о животном в формате:
    I am <AnimalKind>, eat <FoodKind> <CalculateFoodWeight>*/

    public String toStringFull() {
        return toString() + " " + calculateFoodWeight();
    }

/////////////////////////////////////////////////////////////////////////////////////
    class Cow extends Animal {

        public Cow(double weight) {
            super(weight);
        }

        /*1.4 public AnimalKind getKind(), который возвращает COW.*/
        @Override
        public AnimalKind getKind() {
            return AnimalKind.COW;
        }

        /*1.5 public FoodKind getFoodKind(), который возвращает HAY*/
        @Override
        public FoodKind getFoodKind() {
            return FoodKind.HAY;
        }

        /*2.3 Для класса Cow, переопределить метод:
        public double getFoodCoeff(), который должен возвращать 0.05*/
        @Override
        public double getFoodCoeff() {
            return 0.05;
        }
    }

 ////////////////////////////////////////////////////////////////////////////////////
 class Duck extends Animal {

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
//////////////////////////////////////////////////////////////////////////////////////
class Hamster extends Animal {

    public Hamster(double weight) {
        super(weight);
    }

    /*1.6  public AnimalKind getKind(), который возвращает HAMSTER.*/
    @Override
    public AnimalKind getKind() {
        return AnimalKind.HAMSTER;
    }

    /*1.7 public FoodKind getFoodKind(), который возвращает CORN*/
    @Override
    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }

    /*2.4 Для класса Hamster, переопределить метод:
    public double getFoodCoeff(), который должен возвращать 0.03*/
    @Override
    public double getFoodCoeff() {
        return 0.03;
    }
}

}

