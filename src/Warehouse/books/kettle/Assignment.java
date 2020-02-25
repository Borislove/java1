package Warehouse.books.kettle;

//стр 93.
//Использование операторов присваивания
public class Assignment {
    public static void main(String[] args) {
        int n = 27;
        int m = 53;
        n += 1;
        System.out.println(n);
        n += 5;
        System.out.println(n);
        n += m;
        System.out.println(n);
        n *= 2;
        System.out.println(n);
        System.out.println(n -= 7);
        System.out.println(n = 100);
    }
}
