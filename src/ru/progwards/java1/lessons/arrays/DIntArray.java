package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int num;
    private int[] numbers = new int[num];



    //метод
    public void add(int num) {

        int[] numbersCopy = Arrays.copyOf(numbers,numbers.length);
        numbersCopy[numbersCopy.length] = numbersCopy[numbersCopy.length+1];


        //Arrays.fill(numbers,n);

    }

    //метод
    public void atInsert(int pos, int num) {
    }

    //метод
    public void atDelete(int pos) {
        int[] numbersCopy = Arrays.copyOf(numbers,numbers.length);
        numbersCopy[numbersCopy.length] = numbersCopy[numbersCopy.length-1];
    }

    //метод
    public int at(int pos) {
        return 0;
    }


    public static void main(String[] args) {

    }
}

/*Задача 3. Класс DIntArray
Реализовать динамический, саморастущий массив целых чисел, по следующей спецификации:
3.1 в классе разместить private переменную - массив целых чисел.
3.2 конструктор - по умолчанию.

3.2 метод
public void add(int num) - добавляет элемент num в конец массива, при этом размер массива должен увеличиться на 1.
 Для этого нужно будет разместить новый массив нужного размера, скопировать в него старый, и добавить в хвост элемент num.

3.3 метод
public void atInsert(int pos, int num) - добавляет элемент num в позицию pos массива, при этом размер массива должен увеличиться на 1.
 Для этого нужно будет разместить новый массив нужного размера, скопировать в него старый, c учетом того, что новый элемент окажется где-то в середине, и потом положить в нужный индекс элемент num.


3.4 метод
public void atDelete(int pos) - удаляет элемент в позиции pos массива, при этом размер массива должен уменьшиться на 1.
 Для этого нужно будет разместить новый массив нужного размера, скопировать в него старый, уже без элемента, который был в позиции pos.
3.5 метод

public int at(int pos) - возвращает элемент по индексу pos.
*/


// TODO: 18.01.2020 Задача 3. Класс DIntArray: не пройдено, оценка: 2.0
//Комментарий:
//OK: Тест "Конструктор по умолчанию" пройден успешно.
//ERROR: Тест "Метод add(int num)" не пройден. Метод add(int num) работает неверно, либо метод at(int pos) возвращает неверное значение. При помощи метода add(int num) последовательно добавлены значения: -95,-89,-88,45,74,-63,24,16,40. Вызов метода at(0) возвратил значение: 0. Ожидалось: -95
//ERROR: Тест "Метод atInsert(int pos, int num)" не пройден. Метод atInsert(int pos, int num) работает неверно, либо метод at(int pos) возвращает неверное значение. При помощи метода add(int num) последовательно добавлены значения: -27,-94,-99,-91,46,36,-67,-75,98,45,26,21,-24,-42. Вызван метод atInsert(2, -78). Вызов метода at(2) возвратил значение: 0. Ожидалось: -78
//ERROR: Тест "Метод atDelete(int pos)" не пройден. Во время выполнения возникло исключение java.lang.NegativeArraySizeException: -1
//По данной задаче в целом не зачет, решение возвращено на доработку. Задача выполнена на 6.25%