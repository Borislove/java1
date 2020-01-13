package Warehouse.kbv1219;

public class HelloWorld {
    static void helloWorld(){
        String str ;
        str = "Привет, мир!";
        System.out.println(str);
        System.out.println("Hello World!");
    }
    static void helloProgwards(){
        System.out.println("Привет Progwards!");
    }

    static int addition (int x,int y) {
        int z = x+y;
        return z;
    }
    static int addition2 (int x,int y){
        return x+y;
    }

    static void println(String str) {
        System.out.println(str);
    }
    public static void main(String[] args) {
        helloWorld();
        helloWorld();
        helloProgwards();

        HelloWorld.helloWorld();  //вызов из класса

        Warehouse.kbv1219.HelloWorld.helloWorld();

        println("Привет!");
        println("Приветствую!");
        int z = addition(2,3);
        System.out.println(z);

        System.out.println(addition2(3,3));

















    }
}
