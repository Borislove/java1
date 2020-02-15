package ru.progwards.java1.lessons.interfaces;

import static ru.progwards.java1.lessons.interfaces.AnimalKind.ANIMAL;
import static ru.progwards.java1.lessons.interfaces.FoodKind.UNKNOWN;

//животные
public class Animal {

    Animal(AnimalKind animalKind, FoodKind foodKind, double FoodCoeff) {
        getKind();
        getFoodKind();
        getFoodCoeff();
    }

    //AnimalKind type;  // вид/тип животного
    // FoodKind eatType;   //тип еды
    public static double weight;
    public static double weightEat;  //вес еды

    //сохраняет вес животно
    public Animal(double weight) {
        this.weight = weight;
    }

    //возвращает вес животного
    public double getWeight() {
        return weight;
    }

    //возвращает коэффициент веса еды к весу тела животного. Для класса Animal это 0.02
    public double getFoodCoeff() {

        //  return calculateFoodWeight();
        return 0.02;
    }

    //рассчитывает необходимый вес еды,
    // по формуле - вес-еды = вес-животного * коэффициент веса тела.
    public double calculateFoodWeight() {
        weightEat = weight * getFoodCoeff();
        return weightEat;
    }

    public AnimalKind getKind() {
        return ANIMAL;
    }

    public FoodKind getFoodKind() {
        return UNKNOWN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.getWeight(), weight) == 0;
    }

    public interface FoodCompare {
        public int compareFoodPrice();
    }

    public double getFood1kgPrice() {
        return 0;
        /*  HAY : 20
            CORN: 50
            UNKNOWN: 0*/
    }

    //возвращает информацию о цене еды для данного животного по формуле calculateFoodWeight() * getFood1kgPrice()
    public double getFoodPrice() {
        return 0;
    }

    //возвращает результаты сравнения цены еды для данного животного с ценой еды для другого животного, используя Double.compare;
    public int compareFoodPrice(Animal aminal) {
        return 0;
    }

    public static void main(String[] args) {
        Animal animal = new Animal(23);
        System.out.println(animal);

        Animal animal1 = new Cow(150);
        System.out.println(animal1);

        Animal animal2 = new Duck(30);
        System.out.println(animal2);

        Animal animal3 = new Hamster(1);
        System.out.println(animal3);
    }
}








