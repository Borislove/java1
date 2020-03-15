package Warehouse.dump.java1.lessons.arrays;

/*Задача 3. Класс DIntArray
Реализовать динамический, саморастущий массив целых чисел, по следующей спецификации:
3.1 в классе разместить private переменную - массив целых чисел.
3.2 конструктор - по умолчанию.
3.2 метод
public void add(int num) - добавляет элемент num в конец массива, при этом размер массива должен увеличиться на 1.
 Для этого нужно будет разместить новый массив нужного размера, скопировать в него старый, и добавить в хвост элемент num.
3.3 метод
public void atInsert(int pos, int num) - добавляет элемент num в позицию pos массива, при этом размер массива должен увеличиться на 1.
 Для этого нужно будет разместить новый массив нужного размера, скопировать в него старый, c учетом того, что новый элемент окажется где-то в середине,
 и потом положить в нужный индекс элемент num.
3.4 метод
public void atDelete(int pos) - удаляет элемент в позиции pos массива, при этом размер массива должен уменьшиться на 1.
 Для этого нужно будет разместить новый массив нужного размера, скопировать в него старый, уже без элемента, который был в позиции pos.
3.5 метод
public int at(int pos) - возвращает элемент по индексу pos.*/

public class DIntArray {

    private int[] arrayInt;

    public DIntArray() {
        this.arrayInt = new int[0];
    }

    public void add(int num) {

        int[] addArrayInt = arrayInt;
        arrayInt = new int[arrayInt.length + 1];
        for (int i = 0; i < arrayInt.length - 1; i++) {
            arrayInt[i] = addArrayInt[i];
        }
        arrayInt[arrayInt.length - 1] = num;
    }

    public void atInsert(int pos, int num) {

        int[] atInsertArrayInt = arrayInt;
        arrayInt = new int[arrayInt.length + 1];

        for (int i = 0; i < pos; i++) {
            arrayInt[i] = atInsertArrayInt[i];
        }

        for (int i = pos + 1; i < arrayInt.length; i++) {
            arrayInt[i] = atInsertArrayInt[i - 1];
        }
        arrayInt[pos] = num;
    }

    public void atDelete(int pos) {
        int[] atDeleteArrayInt = arrayInt;
        arrayInt = new int[arrayInt.length - 1];

        for (int i = 0; i < pos; i++) {
            arrayInt[i] = atDeleteArrayInt[i];
        }
        for (int i = pos + 1; i < atDeleteArrayInt.length; i++) {
            arrayInt[i - 1] = atDeleteArrayInt[i];
        }
    }

    public int at(int pos) {
        return arrayInt[pos];
    }

    public static void main(String[] args) {
    }
}

