package ru.progwards.java1.lessons.classes;


import static ru.progwards.java1.lessons.classes.AnimalKind.ANIMAL;
import static ru.progwards.java1.lessons.classes.FoodKind.UNKNOWN;

//животные
public class Animal {

   // TODO: 24.12.2019 добавить вес  //конструктор
    Animal(AnimalKind animalKind,FoodKind foodKind,double FoodCoeff){
         getKind();
         getFoodKind();
         getFoodCoeff();
    }
/*
    Animal Cow;
    Animal Duck;
    Animal Hamster;

*/
    //AnimalKind type;  // вид/тип животного
   // FoodKind eatType;   //тип еды
    public static double weight;
    public static double weightEat;
    //сохраняет вес животно
    public Animal(double weight){
    this.weight = weight;
    }

    //возвращает вес животного
    public double getWeight(){
      return weight;
    }

    //возвращает коэффициент веса еды к весу тела животного. Для класса Animal это 0.02
    public double getFoodCoeff(){
        return 0.02;
    }

    //рассчитывает необходимый вес еды,
    // по формуле - вес-еды = вес-животного * коэффициент веса тела.
    public double calculateFoodWeight(){
        weightEat = weight*getFoodCoeff();
        //return weightEat;
        return weight*getFoodCoeff();
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
        Animal animal1 = new Cow(150);
        System.out.println(animal1);
        //new Duck(30);
        Animal animal2 = new Duck(30);
        System.out.println(animal2);
        //new Hamster(1);
        Animal animal3 = new Hamster(1);
        System.out.println(animal3);

    }
  /*  public String toString(){
       return ("I am " + getKind()+ ", eat "+ getFoodKind());
    }*/

  //убрать фул будет показывать /должно быть toStringFull
  public String toString(){
      return ("I am "+getKind()+",eat "+getFoodKind()+" "+calculateFoodWeight());
  }

}

   /* Для класса Animal, создать метод
public String toStringFull(), что бы он возвращал информацию о животном в формате:
        I am <AnimalKind>, eat <FoodKind> <CalculateFoodWeight>
*/