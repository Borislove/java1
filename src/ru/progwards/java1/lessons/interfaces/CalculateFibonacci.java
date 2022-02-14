package ru.progwards.java1.lessons.interfaces;

/*Задача 2. Класс CalculateFibonacci
Задача на динамическое программирование. Это когда некоторые результаты сохраняются для последующего использования.
Для функции public static int fiboNumber(int n) из задачи 3 урока 4 сделать сохранение одного, последнего из рассчитанных значений. Для этого*/

public class CalculateFibonacci {

    ////////////////////////////////////////////////////////////////////////
    //2.3 Разместить в классе CalculateFibonacci приватную статическую переменную CacheInfo lastFibo;
    private static CacheInfo lastFibo ;
    ////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////
    //2.2 Разместить вложенный класс public static class CacheInfo, содержащий пару свойств
    public static class CacheInfo {

        public int n; //- число, для которого рассчитываем Фибоначчи

        public int fibo; // - результат расчета
    }
    ////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////
    //2.1 Разместить в классе CalculateFibonacci функцию
    //public static int fiboNumber(int n)

    public static int fiboNumber(int n) {

        /*
        2.4 В статической функции fiboNumber, проверять параметр n на совпадение с последним рассчитанным значением, и если совпадает -
        возвращать уже готовый результат. Если не совпадает - рассчитывать и сохранять в статической переменной lastFibo.*/

        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        int first = 0;
        int second = 1;
        int result = n;

        for (int i = 1; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    //2.5 Реализовать метод public static CacheInfo getLastFibo() который возвращает lastFibo
    public static CacheInfo getLastFibo() {
        return lastFibo;
    }

    //2.6 Реализовать метод public static void clearLastFibo(), который сбрасывает lastFibo в null
    public static void clearLastFibo() {
        lastFibo = null;
    }

    public static void main(String[] args) {

//        System.out.println(fiboNumber(10)); //55
    }
}
