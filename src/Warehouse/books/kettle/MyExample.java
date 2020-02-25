package Warehouse.books.kettle;

public class MyExample {

    private static int apple = 20;  //яблоки
    private static int banana = 35; //банана
    private static int grape = 10; // виноград
    private static int pear = 9; //груша
    private static int orange = 17; //апельсин

    public static void main(String[] args) {
        System.out.println("apple = " + apple);
        System.out.println("banana = " + banana);
        System.out.println("banana = " + grape);
        System.out.println("pear = " + pear);
        System.out.println("orange = " + orange);

        System.out.println("сколько всего фруктов?..нужно подсчитать");
        System.out.print(" итого:");
        System.out.println(apple + banana + grape + pear + orange);
        System.out.println("персики забыли...");
    }
}
