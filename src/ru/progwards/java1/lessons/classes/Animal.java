package ru.progwards.java1.lessons.classes;

//v2

public class Animal {

    ////////////////////////////////////////////////////////////////////
    /*1.0 Реализовать конструктор
    public Animal(double weight), который сохраняет вес животного.*/
    ////////////////////////////////////////////////////////////////////
    protected double weight;

    public Animal(double weight) {
        this.weight = weight;
    }

    ////////////////////////////////////////////////////////////////////
    /*1.1 Метод:
    public AnimalKind getKind(), который возвращает вид животного
    (enum AnimalKind - ANIMAL, COW, HAMSTER, DUCK). В данном классе вернуть ANIMAL*/
    ////////////////////////////////////////////////////////////////////
    public AnimalKind getKind() {
        return AnimalKind.ANIMAL;
    }

    ////////////////////////////////////////////////////////////////////
        /*1.2 Метод
    public FoodKind getFoodKind(), который возвращает вид еды,
    (enum FoodKind - UNKNOWN, HAY, CORN). В данном классе вернуть UNKNOWN*/
    ////////////////////////////////////////////////////////////////////
    public FoodKind getFoodKind() {
        return FoodKind.UNKNOWN;
    }

    ////////////////////////////////////////////////////////////////////
            /*1.3 Метод
        public String toString(), который возвращает информацию о животном в формате:
        I am <AnimalKind>, eat <FoodKind>*/
    ////////////////////////////////////////////////////////////////////
    public String toString() {
        return "I am" + getKind() + " , " + getFoodKind();
    }

    ////////////////////////////////////////////////////////////////////
    /*2.1 В классе Animal реализовать метод:
    public double getWeight(), который возвращает вес животного*/
    ////////////////////////////////////////////////////////////////////
    public double getWeight() {
        return weight;
    }

    ////////////////////////////////////////////////////////////////////
       /*2.2 Реализовать метод
    public double getFoodCoeff(), который возвращает коэффициент веса еды к весу тела животного.
    Для класса Animal это 0.02*/
    ////////////////////////////////////////////////////////////////////
    public double getFoodCoeff() {
        return 0.02;
    }

    ////////////////////////////////////////////////////////////////////
        /*2.6 Для класса Animal, реализовать метод:
       public double calculateFoodWeight(), который
       рассчитывает необходимый вес еды, по формуле - вес-еды = вес-животного * коэффициент веса тела.*/
    ////////////////////////////////////////////////////////////////////
    public double calculateFoodWeight() {
        return getWeight() * getFoodCoeff();
    }

    ////////////////////////////////////////////////////////////////////
    /*2.7 Для класса Animal, создать метод
    public String toStringFull(), что бы он возвращал информацию о животном в формате:
    I am <AnimalKind>, eat <FoodKind> <CalculateFoodWeight>*/
    ////////////////////////////////////////////////////////////////////
    public String toStringFull() {
        return toString() + " " + calculateFoodWeight();
    }
}
