package Warehouse.books.kettle;

//стр 78.
/*public class Lift {

    public static void main(String[] args) {

        int personWeight;  //вес человека
        int capacity; //вместимость
        int numberOfPersons;  //количество человек

        personWeight = 80;
        capacity = 1000;
        numberOfPersons = capacity / personWeight;

        System.out.print("Лифт может поднять ");
        System.out.print(numberOfPersons);
        System.out.println(" человек.");
    }
}*/


public class Lift {

    public static void main(String[] args) {

        int a = 80;
        int b = 1000;
        int c = b / a;
        System.out.println(c);

        double aDouble = 80;
        double bDouble = 1000;
        double cDouble = bDouble / aDouble;
        System.out.println(cDouble);

        cDouble %= 1; //остаток от деления
        System.out.println(cDouble);
    }
}
