package Warehouse.books.kettle;

public class PayTest {

    private static String name = "Name";
    private static final double AMOUNT_FIX = 1234.55;

    static void payMe(String name, double amount) {

        System.out.println(name);
        System.out.println("Оплатить заказ");
        System.out.print(amount);
        System.out.print("₽");
        System.out.println("");
    }

    public static void main(String[] args) {

        System.out.println("Вариант 1");
        System.out.println("Оплатить заказ " + name + " сумма:" + AMOUNT_FIX + "\u20BD");
        System.out.println("---------------------------------");
        System.out.println("Вариант 2");
        payMe("Name", 123.4234);

        payMe("Vaske", AMOUNT_FIX);
    }
}
