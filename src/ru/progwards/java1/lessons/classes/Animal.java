package ru.progwards.java1.lessons.classes;


import static ru.progwards.java1.lessons.classes.AnimalKind.ANIMAL;
import static ru.progwards.java1.lessons.classes.FoodKind.UNKNOWN;

//животные
public class Animal {


  //  Animal(AnimalKind type,FoodKind eatType, double weight){
        //type = AnimalKind;
        //eatType = FoodKind;
        //weight = animalWeight;
    //}

    // TODO: 24.12.2019 добавить вес  //конструктор
    Animal(AnimalKind animalKind,FoodKind foodKind){
         getKind();
         getFoodKind();

    }

    Animal Cow;
    Animal Duck;
    Animal Hamster;

    //Animal Cow = new Animal();
    //Animal Duck = new Animal();
    //


    AnimalKind type;  // вид/тип животного
    FoodKind eatType;   //тип еды
    public static double weight;


    //сохраняет вес животно
    public Animal(double weight){
    this.weight = weight;
    }

    public AnimalKind getKind() {
     return ANIMAL;
    }

    public FoodKind getFoodKind(){
    return UNKNOWN;
    }

    //который возвращает информацию о животном в формате:
    //    I am <AnimalKind>, eat <FoodKind>
    //public String toString() {

   // }

    public static void main(String[] args) {
        Animal animal = new Animal(23);
        System.out.println(animal);

        //new Cow(120);
        Animal animal11 = new Cow(120);
        System.out.println(animal11);
        //new Duck(30);
        Animal animal12 = new Duck(30);
        System.out.println(animal12);
        //new Hamster(1);
        Animal animal13 = new Hamster(1);
        System.out.println(animal13);

    }
    public String toString(){
        //  System.out.println("I am" + getKing()+ " , eat"+ getFoodKind());
        return ("I am " + getKind()+ " , eat "+ getFoodKind());
    }


}
