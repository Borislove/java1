package ru.progwards.java1.lessons.interfaces;

/*1.4 В отдельном файле объявить interface FoodCompare
interface FoodCompare {
    public int compareFoodPrice(Animal animal);
}*/

interface FoodCompare {
    double weight = 0d;

    public int compareFoodPrice(Animal animal);
}


