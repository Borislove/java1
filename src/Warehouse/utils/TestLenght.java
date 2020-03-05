package Warehouse.utils;

//проверка на длину текста
public class TestLenght {

    public static void main(String[] args) {

        //проверка длины числа, можно просто в строчку запихнуть и там видно будет
        Integer a = 2131231231;
        String str = String.valueOf(a);
        System.out.println(str.length());

        //проверка длины строки
        String text = "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0";
        String testStr = String.valueOf(text);
        System.out.println(testStr.length());

    }
}
