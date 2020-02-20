package Warehouse.books.kettle;

//что то тут не то...
public class PayTest1 {

    private static final double AMOUNT = 50.5;
    private static String name = "vas";

    static void payRub() {
        System.out.println("\u20BD");
    }

    static void payDoll() {
        System.out.println("$");
    }

    static void payEuro() {
        System.out.println("€");
    }

    static void nameOut(String str) {
        System.out.println(name);
    }

    static void payAmount(Double d) {
        d = AMOUNT;
        System.out.print(d);
    }

    static void full(){
        nameOut("fasdf");
        payAmount(21.22);
        payEuro();
    }

    public static void main(String[] args) {
        nameOut("Vasya");
        payAmount(2.2);
        payEuro();

        full();
    }
}
