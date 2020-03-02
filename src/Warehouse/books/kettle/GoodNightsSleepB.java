package Warehouse.books.kettle;

//Использование директивы throws
public class GoodNightsSleepB {

    public static void main(String[] args) {

        System.out.print("Немного вздремну. ");
        System.out.println("Всего пять секунд...");

        try {
            takeANap();
        } catch (InterruptedException e) {
            System.out.println("Эй! Кто разбудил меня?");
        }
        System.out.println("Я опять бодр и полон сил!");
    }

    static void takeANap() throws InterruptedException {
        Thread.sleep(500);
    }
}

