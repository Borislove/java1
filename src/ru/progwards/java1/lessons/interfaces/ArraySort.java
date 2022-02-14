package ru.progwards.java1.lessons.interfaces;


/*Задача 3. Сортировка интерфейса на основе ArraySort

3.1 Создать интерфейс CompareWeight +
3.2 В нем создать public enum CompareResult, со значениями LESS, EQUAL, GREATER +
3.3 Интерфейс должен содержать метод public CompareResult compareWeight(CompareWeight smthHasWeigt) +


3.4 Для класса Animal реализовать интерфейс CompareWeight..Сравнение сделать на основе веса животного. +
Метод CompareResult compareWeight должен возвращать
LESS если свой вес < веса параметра метода
EQUAL если свой вес = веса параметра метода
GREATER если свой вес > веса параметра метода

3.5 Создать класс Food (еда), которое никак не связано иерархией наследования с Animal.
3.6 В классе Food разместить приватную переменную int weight - вес еды в граммах, реализовать в классе конструктор, принимающий и устанавливающий значение веса.
3.7 Реализовать метод public int getWeight(), возвращающий сохраненное значение веса.
3.7 Для класса Food реализовать интерфейс CompareWeight..Сравнение сделать на основе веса еды.
Метод CompareResult compareWeight должен возвращать
Метод CompareResult compareWeight должен возвращать
LESS если свой вес < веса параметра метода
EQUAL если свой вес = веса параметра метода
GREATER если свой вес > веса параметра метода

3.8 Скопировать реализацию сортировки из класса ArraySort из задачи 2 урока 6 и
переделать сортировку массива целых чисел на сортировку через интерфейс CompareWeight public static void sort(CompareWeight[] a)*/
public class ArraySort {
}
