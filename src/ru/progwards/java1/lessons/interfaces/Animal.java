package ru.progwards.java1.lessons.interfaces;

import java.util.Objects;

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

public class Animal implements FoodCompare, CompareWeight {

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


    ////////////////////-------------------8----------------------------------------------
    /*1.1 Для класса Animal из задач 1 и 2, домашнего задания к уроку 5 реализовать метод:
    public boolean equals(Object anObject), который возвращает true, если объекты равны и
     false если не равны по параметру - вес животного. Убедится, что при равном весе,
      утка все равно не равна хомяку. Обратите внимание на тип принимаемого параметра и
      подумайте над тем, что будет делать ваша программа, если в качестве параметра
      будет передан объект не являющийся экземпляром Animal.
    */
    ////////////////////-------------------8----------------------------------------------
    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) return true;
        if (!(anObject instanceof Animal)) return false;
        Animal animal = (Animal) anObject;
        return Double.compare(animal.calculateFoodWeight(), this.calculateFoodWeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    ////////////////////-------------------8----------------------------------------------
            /*1.2 В класс Animal добавить метод
        public double getFood1kgPrice(), который возвращает информацию о цене 1 кг еды.
        метод реализовать в виде switch по FoodKind со следующими значениями
        HAY : 20
        CORN: 50
        UNKNOWN: 0*/
    ////////////////////-------------------8----------------------------------------------

    public double getFood1kgPrice() {         //OK: Тест "Метод getFood1kgPrice()" пройден успешно.
        switch (getFoodKind()) {
            case HAY:
                return 20;
            case CORN:
                return 50;
        }
        return 0;
    }

    ////////////////////-------------------8----------------------------------------------
        /*1.3 В класс Animal добавить метод
    public double getFoodPrice(), который возвращает информацию о
     цене еды для данного животного по формуле calculateFoodWeight() * getFood1kgPrice()*/
    public double getFoodPrice() {           //OK: Тест "Метод getFoodPrice()" пройден успешно.
        return calculateFoodWeight() * getFood1kgPrice();
    }

    ////////////////////-------------------8----------------------------------------------
        /*1.5 В класс Animal реализовать
    public int compareFoodPrice(Animal aminal),
    который возвращает результаты сравнения цены еды для данного
     животного с ценой еды для другого животного, используя Double.compare;*/
    @Override
    public int compareFoodPrice(Animal animal) {
        return Double.compare(this.getFoodPrice(), animal.getFoodPrice());
    }


    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt) {
        if (weight < smthHasWeigt.weight) {
            return CompareResult.LESS;
        }
        if (weight == smthHasWeigt.weight) {
            return CompareResult.EQUAL;
        }
        if (weight > this.weight) {
            return CompareResult.GREATER;
        }
        return CompareResult.NULL;
    }
}


