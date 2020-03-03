package Warehouse.books.kettle;

//стр. 274
//Использование блока finally
public class DemoFinally {

    public static void main(String[] args) {

        try {
            doSomething();

        } catch (Exception e) {
            System.out.println("Исключение перехвачено в main().");
        }
    }

    static void doSomething() {
        try {
            System.out.println(0 / 0);

        } catch (Exception e) {
            System.out.println("Исключение перехвачено в doSomething");
            System.out.println(0 / 0);
        } finally {
            System.out.println("Напечатано в блоке finally.");
        }
        System.out.println("Будет ли это напечатано?");
    }
}
