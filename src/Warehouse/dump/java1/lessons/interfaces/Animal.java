package Warehouse.dump.java1.lessons.interfaces;

import java.util.Objects;

import static Warehouse.dump.java1.lessons.interfaces.FoodKind.UNKNOWN;

//животные
public class Animal implements FoodCompare {

    Animal(AnimalKind animalKind, FoodKind foodKind, double FoodCoeff) {
        getKind();
        getFoodKind();
        getFoodCoeff();
    }

    //AnimalKind type;  // вид/тип животного
    // FoodKind eatType;   //тип еды
    public static double weight;
    public static double weightEat;  //вес еды

    FoodPrice foodPrice = FoodPrice.UNKNOWN;

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
        return 0.02;
    }

    //рассчитывает необходимый вес еды,
    // по формуле - вес-еды = вес-животного * коэффициент веса тела.
    public double calculateFoodWeight() {
        weightEat = weight * getFoodCoeff();
        return weightEat;
    }

    public AnimalKind getKind() {
        return AnimalKind.ANIMAL;
    }

    public FoodKind getFoodKind() {
        return UNKNOWN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return weight == animal.getWeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }


    public interface FoodCompare {
        public int compareFoodPrice();
    }

    public double getFood1kgPrice() {

        switch (foodPrice) {
            case HAY:
                //return foodPrice =20;
                return (double) 20;

            case CORN:
                return (double) 50;
            //return 50;

            case UNKNOWN:
                return 10;

            default:
                return 10;
        }
    }

    //возвращает информацию о цене еды для данного животного по формуле calculateFoodWeight() * getFood1kgPrice()
    public double getFoodPrice() {
        return calculateFoodWeight() * getFood1kgPrice();   //ок,
        // return 0;
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

        Animal animal3 = new Hamster(10);
        System.out.println(animal3);

        System.out.println(animal3.getFood1kgPrice());
    }
}


/*Задача 1. Классы Animal, Cow, Hamster, Duck: не пройдено, оценка: 3.0
Комментарий:
ERROR: Тест "Метод equals(Object anObject)" не пройден. Метод возвращает неверное значение. Результат вызова new Hamster(1D).equals(new Hamster(2D)): true. Ожидалось: false.
ERROR: Тест "Метод getFood1kgPrice()" не пройден. Метод возвращает неверное значение. Результат вызова new Cow(1D).getFood1kgPrice(): 0.0, ожидалось: 20.0
ERROR: Тест "Интерфейс FoodCompare, метод compareFoodPrice(Animal o)" не пройден. Метод возвращает неверные результаты сравнения для new Animal(1D).сompareFoodPrice(new Cow(1D)): 0
, ожидалось значение меньше 0.
По данной задаче в целом не зачет, решение возвращено на доработку. Задача выполнена на 15.00%*/



