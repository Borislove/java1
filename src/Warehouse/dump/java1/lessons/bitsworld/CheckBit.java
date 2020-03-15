package Warehouse.dump.java1.lessons.bitsworld;

/*Задача 2. Класс CheckBit
2.1 Реализовать функцию public static int checkBit(byte value, int bitNumber)
 которая возвращает значение бита с порядковым номером bitNumber от параметра value.
 При этом следует помнить, что нумерация начинается с нуля и нулевой бит является младшим.
Подсказки:
при реализации этой функции следует использывать опыт, полученный при решении предыдущей задачи;
кроме того, удобно использовать битовую операцию сдвиг вправо >>.
*/

public class CheckBit {

    public static int checkBit(byte value, int bitNumber) {
        int result = 0;

        if (bitNumber > 0) {
            for (int i = 0; i < bitNumber; i++) {
                value >>= 1;
            }
        }
        if ((value & 1) == 1) {
            result = 1;
        }

        return result;
    }

    public static void main(String[] args) {
    }
}

