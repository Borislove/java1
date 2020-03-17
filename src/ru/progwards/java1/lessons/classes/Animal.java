package ru.progwards.java1.lessons.classes;

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

    /*1.3 Метод
    public String toString(), который возвращает информацию о животном в формате:
    I am <AnimalKind>, eat <FoodKind>*/

    public String toString() {
        return "I am" + getKind() + ", eat" + getFoodKind();
    }
}
