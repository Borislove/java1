package Warehouse.dump.java1.lessons.test;

public class HelloWorld {

    static void println(String str) {
        System.out.println(str);
    }
    static int addition(int x, int y) {
        return x+y; //возвращаем результат
    }

    public static void main(String[] args) {
        println("Help , world!");
        println("World! ");
        System.out.print("Я знаю что 5+7 = ");
        System.out.println(addition(5,7));
    }
}
