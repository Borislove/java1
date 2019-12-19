package ru.progwards.kbv1219.Oficiant;

public class Postiton {
    double lat; //широта
    double lon; //долгота

    //попадание otherPosition

    public boolean inRadius (Postiton otherPosition, double radius) {


        double latDiff = lat - otherPosition.lat;
        double lonDiff = lon - otherPosition.lon;
        return latDiff * latDiff +lonDiff * lonDiff <= radius;
    }
}
