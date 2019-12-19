/*
package ru.progwards.kbv1219.Oficiant;

public class Eat {

    Postiton postiton;
    double radius = 0.15
            EatType type;  //тип еды
    double volume; //начальный объем в мл
    private double eaten = 0; //сколько съедено

    Eat (EatType type, double volume) {

        this.type = type;
        this.volume = volume;
    }

    boolean inArea(Postiton otherPosition) {

        return postiton.inRadius(otherPosition,radius);
    }

    double volumeNow(){

        return volume -eaten;

    }
    double getEat(double portionVolume) {

        if (volumeNow() < portionVolume) {

            //недостаточный объем для выдачи порции
            portionVolume = volumeNow();
        }
        eaten +=portionVolume;
        return portionVolume;
    }
    static Eat selectEatByType(EatType eatType, Eat eat1, Eat eat2, Eat eat3 ) {

    }
}
*/
