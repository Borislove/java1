package ru.progwards.t5.n5_2.bot;

//Еда в баке
public class Eat {
    Position position;
    double radius = 0.15; //в метрах
    EatType type; //тип еды
    double volume; //начальный объем в мл
    private double eaten = 0; //сколько съедено

    Eat(EatType type, double volume) { //передает тип еды и объем
        this.type = type;
        this.volume = volume;
    }

    boolean inArea(Position otherPosition) {
        return position.inRadius(otherPosition, radius);
    }

    double volumeNow() {
        return volume - eaten;
    }

    double getEat(double portionVolume) {
        if (volumeNow() < portionVolume) {
            //недостаточный объем для выдачи порции
            portionVolume = volumeNow();
        }
        eaten += portionVolume;
        return portionVolume;
    }

    // TODO: 03.02.2020 тут неизвестно что передается
    static Eat selectEatByType(EatType eatType, Eat eat1, Eat eat2, Eat eat3) {
        return null;
    }
}
