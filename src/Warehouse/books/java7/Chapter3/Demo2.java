package Warehouse.books.java7.Chapter3;

//Явное преобразование типа
public class Demo2 {

    public static void main(String[] args) {

        int x;
        double y = 3.14;
        // x = y;  // так не получится
        x = (int) y;
        System.out.println(x);
    }
}
