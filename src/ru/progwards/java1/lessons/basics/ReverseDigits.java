package ru.progwards.java1.lessons.basics;

/*Задача 1. Класс ReverseDigits
1.1 Реализовать функцию
public static int reverseDigits(int number),
которая получает параметром number трёхзначное положительное число,
 а вернуть должна число в котором цифры идут в обратном порядке (например, если на вход передаётся 123, то функция должна вернуть 321).

Подсказки:
для реализации задачи вспомните особенности деления в Java (в середине лекции "БНФ, константы, операторы, приоритеты").
*/
public class ReverseDigits {

    //только для 3-х
    public static int reverseDigits(int number) {

        System.err.println("original number: " + number);

        //1 число 2 индекс (конец)
        int oneNumber = number % 10;
        System.out.println("oneNumber = " + oneNumber);
        String oneNumberString = Integer.toString(oneNumber);  //преобразовали в строку

        //2 число 1 индекс (не меняется) преобразовать не обязательно
        int twoNumber = number % 100 / 10;
        System.out.println("twoNumber = " + twoNumber);   //2 число 1 элемент
        String twoNumberString = Integer.toString(twoNumber); //преобразовали в строку

        //3 число 0 индекс
        int threeNumber = number / 100;
        System.out.println("threeNumber = " + threeNumber);
        String threeNumberString = Integer.toString(threeNumber); //преобразовали в строку

        //склеивание строк
        //String strResult = (oneNumberString + twoNumberString +threeNumberString);   //3 строки
        String strResult = (oneNumberString + twoNumber + threeNumberString);   // строка + 1 число + строка
        System.out.println("strResult = " + strResult);

        //преобразование строки в int и возвратить результат
        return Integer.parseInt(strResult);
    }

    public static void main(String[] args) {
        System.out.println(reverseDigits(102));
        System.out.println(reverseDigits(123));
        System.out.println(reverseDigits(321));
        System.out.println(reverseDigits(678));
        System.out.println(reverseDigits(1234));  //4312
    }
}
