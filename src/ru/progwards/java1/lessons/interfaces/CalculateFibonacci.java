package ru.progwards.java1.lessons.interfaces;

/*Задача на динамическое программирование. Это когда некоторые результаты
сохраняются для последующего использования.
Для функции public static int fiboNumber(int n) из задачи 3 урока 4
сделать сохранение одного, последнего из рассчитанных значений. Для этого
*/
public class CalculateFibonacci {
    //////////////////////////////////////////////////////////////////
    /*2.3 Разместить в классе CalculateFibonacci приватную
     статическую переменную CacheInfo lastFibo;*/
    //////////////////////////////////////////////////////////////////
    private static CacheInfo lastFibo;

    //////////////////////////////////////////////////////////////////
    /*2.1 Разместить в классе CalculateFibonacci функцию
    public static int fiboNumber(int n)*/
    //////////////////////////////////////////////////////////////////
    public static int fiboNumber(int n) {  //☺
        int a = 1;
        int b = 0;
        int fibo = 0;
        for (int i = 0; i < n; i++) {
            fibo = a + b;
            a = b;
            b = fibo;
            //  System.out.println("Fibo = " + fibo);
        }
        return fibo;
    }

    ///////////////////////////////////////////////////////////////////
                /*2.2 Разместить вложенный класс
            public static class CacheInfo, содержащий пару свойств
            public int n - число, для которого рассчитываем Фибоначчи
            public int fibo - результат расчета*/
    ///////////////////////////////////////////////////////////////////
    public static class CacheInfo {
        public int n;
        public int fibo;
    }


    /*2.4 В статической функции fiboNumber, проверять параметр n на совпадение с последним рассчитанным
     значением, и если совпадает - возвращать уже готовый результат. Если не совпадает - рассчитывать и
     сохранять в статической переменной lastFibo. */


    /*2.5 Реализовать метод public static CacheInfo getLastFibo() который возвращает lastFibo*/
    public static CacheInfo getLastFibo() {
        return lastFibo;
    }

    /*2.6 Реализовать метод public static void clearLastFibo(), который сбрасывает lastFibo в null*/
    public static void clearLastFibo() {  //☺
        //fiboNumber(0);
        return;
    }

    public static void main(String[] args) {
        fiboNumber(10);
    }
}


