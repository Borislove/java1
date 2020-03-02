package Warehouse.books.kettle;

//стр. 271
//Обработка исключения внутри метода
public class GoodNightsSleepA {

    public static void main(String[] args) {

        System.out.print("Немного вздремну. ");
        System.out.println("Всего пять секунд...");

        takeANap();

        System.out.println("Я опять бодр и полон сил!");
    }

    static void takeANap() {
        try {
            Thread.sleep(500);

        } catch (InterruptedException e) {
            System.out.println("Эй! Кто разбудил меня?");
        }
    }
}
