package Warehouse.books.java7.Chapter3;

//Превышение диапазона
public class Demo3 {

    public static void main(String[] args) {

        int x, y;
        short z;
        x = 30000;
        y = 30000;

        z = (short) (x + y);
        System.out.println(z);
    }
}
