package ru.progwards.java1.lessons.classes;


import static ru.progwards.java1.lessons.classes.AnimalKind.ANIMAL;
import static ru.progwards.java1.lessons.classes.FoodKind.UNKNOWN;

//животные
public class Animal {

   // TODO: 24.12.2019 добавить вес  //конструктор
    Animal(AnimalKind animalKind,FoodKind foodKind){
         getKind();
         getFoodKind();

    }
/*
    Animal Cow;
    Animal Duck;
    Animal Hamster;

*/
    //AnimalKind type;  // вид/тип животного
   // FoodKind eatType;   //тип еды
    public static double weight;


    //сохраняет вес животно
    public Animal(double weight){
    this.weight = weight;
    }

    public  AnimalKind getKind() {
     return ANIMAL;
    }

    public  FoodKind getFoodKind(){
    return UNKNOWN;
    }

    public static void main(String[] args) {
     /* Animal animal = new Animal(23);
        System.out.println(animal);*/

        //new Cow(120);
        Animal animal1 = new Cow(120);
        System.out.println(animal1);
        //new Duck(30);
        Animal animal2 = new Duck(30);
        System.out.println(animal2);
        //new Hamster(1);
        Animal animal3 = new Hamster(1);
        System.out.println(animal3);

    }
    public String toString(){
       return ("I am " + getKind()+ " , eat "+ getFoodKind());
    }


}
