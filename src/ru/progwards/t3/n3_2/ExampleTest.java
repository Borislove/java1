package ru.progwards.t3.n3_2;

//Расширение функционала для чисел
//статические функции Integer для конвертации

// TODO: 01.02.2020 как этим пользоваться то...
public class ExampleTest {


    private static String s = "56789";


    //Преобразует строку s  в число(примитив int)
    static int parseInt(String s) {
        return 0;
    }
    // Преобразует строку s в число (класс-обёртку Integer)
    static Integer valueOf(String s){
        return null;
    }
    //Преобразует число i в строку
    static String toString(int i){
        return null;
    }

    public static void main(String[] args) {

        parseInt("test");
        System.out.println(parseInt("test"));
        valueOf("123");
        System.out.println(valueOf("123"));
        toString(1234);

        System.out.println(parseInt(s));


    }
}
