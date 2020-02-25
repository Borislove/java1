package Warehouse.books.kettle;

public class Lift2 {

    public static void main(String[] args) {

        System.out.println("Верно ли,");
        System.out.println("что лифт может поднять");
        System.out.println("десять человек");
        System.out.println();
        int personWeight;  //вес человека
        int capacity; //вместимость
        int numberOfPersons;  //количество человек

        personWeight = 80;
        capacity = 1000;
        numberOfPersons = capacity / personWeight;

        boolean can = numberOfPersons >= 10;

        System.out.println("может поднять = " + can);
    }
}
