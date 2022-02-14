package ru.progwards.java1.lessons.interfaces;

import java.util.Objects;

public class Animal implements CompareWeight{

    private double weight;

    ////////////////////////////////////////////////////////////////////
    /*1.0 Реализовать конструктор
    public Animal(double weight), который сохраняет вес животного.*/
    public Animal(double weight) {
        this.weight = weight;
    }
    ////////////////////////////////////////////////////////////////////

    /*1.1 Метод:
    public AnimalKind getKind(), который возвращает вид животного
    (enum AnimalKind - ANIMAL, COW, HAMSTER, DUCK). В данном классе вернуть ANIMAL*/
    public AnimalKind getKind() {
        return AnimalKind.ANIMAL;
    }

    ////////////////////////////////////////////////////////////////////
    /*1.2 Метод
    public FoodKind getFoodKind(),
    который возвращает вид еды, (enum FoodKind - UNKNOWN, HAY, CORN).
    В данном классе вернуть UNKNOWN*/
    public FoodKind getFoodKind() {
        return FoodKind.UNKNOWN;
    }

    ////////////////////////////////////////////////////////////////////
    /*2.1 В классе Animal реализовать метод:
    public double getWeight(), который возвращает вес животного*/
    public double getWeight() {
        return weight;
    }
    ////////////////////////////////////////////////////////////////////

    /*2.2 Реализовать метод
    public double getFoodCoeff(), который возвращает коэффициент веса еды к весу тела животного.
     Для класса Animal это 0.02*/
    public double getFoodCoeff() {
        return 0.02;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////
    /*2.6 Для класса Animal, реализовать метод:
    public double calculateFoodWeight(),
    который рассчитывает необходимый вес еды, по формуле - вес-еды = вес-животного * коэффициент веса тела.*/
    public double calculateFoodWeight() {
        return getWeight() * getFoodCoeff();
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////

    /*1.3 Метод
    public String toString(), который возвращает информацию о животном в формате:
    I am <AnimalKind>, eat <FoodKind>*/
    public String toString() {
        return "I am" + " " + getKind() + ", eat " + getFoodKind();
    }

    ////////////////////////////////////////////////////////////////////
    /*2.7 Для класса Animal, создать метод
    public String toStringFull(), что бы он возвращал информацию о животном в формате:
    I am <AnimalKind>, eat <FoodKind> <CalculateFoodWeight>*/
    public String toStringFull() {
        return toString() + " " + calculateFoodWeight();
    }


    ////////////////////////////////////////////////////////////////////
        /*1.1 Для класса Animal из задач 1 и 2, домашнего задания к уроку 5 реализовать метод:
    public boolean equals(Object anObject), который возвращает true, если объекты равны и false если не равны по параметру
    - вес животного. Убедится, что при равном весе, утка все равно не равна хомяку. Обратите внимание на тип принимаемого параметра
    и подумайте над тем, что будет делать ваша программа, если в качестве параметра будет передан объект не являющийся экземпляром Animal.
    }*/
    ////////////////////////////////////////////////////////////////////
    @Override
    public boolean equals(Object o) {  //// TODO: 14.02.2022 по весу животного
        System.out.println("equals запущен");
        System.out.println(o.getClass());
        System.out.println(this.getClass());
        System.out.println("идет сравнение");
        System.out.println(" " + o.getClass() + " " + this.getClass());
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }


    ////////////////////////////////////////////////////////////////////
    /*1.2 В класс Animal добавить метод
    public double getFood1kgPrice(), который возвращает информацию о цене 1 кг еды.
    метод реализовать в виде switch по FoodKind со следующими значениями
    HAY : 20
    CORN: 50
    UNKNOWN: 0*/
    public double getFood1kgPrice() {

        switch (getFoodKind()) {

            case HAY:
                return 20;

            case CORN:
                return 50;

            default:
                return 0;

        }
    }
    ////////////////////////////////////////////////////////////////////

    /*1.3 В класс Animal добавить метод
    public double getFoodPrice(), который возвращает информацию о цене еды для данного животного по формуле calculateFoodWeight() * getFood1kgPrice()*/
    public double getFoodPrice() {
        return calculateFoodWeight() * getFood1kgPrice();
    }

    /*1.5 В класс Animal реализовать
    public int compareFoodPrice(Animal aminal),
    который возвращает результаты сравнения цены еды для данного животного с ценой еды для другого животного, используя Double.compare;*/
    public int compareFoodPrice(Animal animal){
        return Double.compare(this.getFoodPrice(), animal.getFoodPrice());
    }

    /*3.4 Для класса Animal реализовать интерфейс CompareWeight..Сравнение сделать на основе веса животного. +
     Метод CompareResult compareWeight должен возвращать
     LESS если свой вес < веса параметра метода
     EQUAL если свой вес = веса параметра метода
     GREATER если свой вес > веса параметра метода*/
    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt) {

        Animal animal = (Animal) smthHasWeigt;

//        if (food.getWeight() > this.getWeight()) return CompareResult.LESS;
        //if (food.getWeight() > this.weight) return CompareResult.LESS;

        if (this.weight < animal.getWeight()) return CompareResult.LESS;

        if (this.weight == animal.getWeight()) return CompareResult.EQUAL;

        if (this.weight > animal.getWeight()) return CompareResult.GREATER;

        //return CompareResult.NULL;
        return null;
    }

    public static void main(String[] args) {
/*
        Animal animal = new Animal(20);
        System.out.println(animal.getKind());

        Animal animal2 = new Animal(25);
        System.out.println(animal.getKind());

        System.out.println(animal.equals(animal2));
        System.out.println(animal.hashCode());
        System.out.println(animal2.hashCode());*/

        /*Duck duck = new Duck(22);
        System.out.println(duck);
        System.out.println(duck.getFoodCoeff());
        System.out.println(duck.getFoodKind());
        System.out.println(duck.getKind());
        System.out.println(duck.getClass());
        System.out.println(duck.getWeight());*/

        /*Duck duck = new Duck(30);
        Cow cow = new Cow(155);
        Hamster hamster = new Hamster(5);*/

        //false
        /*System.out.println(duck.equals(cow));
        System.out.println(duck.equals(hamster));
        System.out.println(cow.equals(duck));
        System.out.println(cow.equals(hamster));
        System.out.println(hamster.equals(duck));
        System.out.println(hamster.equals(cow));*/

        //System.out.println(duck.equals(cow));

        Duck duck = new Duck(15); //тощая утка
  /*      Hamster hamster = new Hamster(15); //жирный хомяк
        Cow cow = new Cow(15); //мелкая корова

//        System.out.println(duck.equals(hamster)); //false
        System.out.println(cow.equals(hamster)); //false
*/
        Tiger tiger = new Tiger();
        System.out.println(duck.equals(tiger));
    }



}
