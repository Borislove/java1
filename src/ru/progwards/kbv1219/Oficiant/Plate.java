package ru.progwards.kbv1219.Oficiant;

public class Plate {

    int id;
    Postiton postiton;
    double volume = 1000; //максимальный объем в мл

    public Plate (int id) {
        this.id = id;
    }

    boolean isEmpty(){
        return Detector.plateIsEmpty(id);
    }
}
