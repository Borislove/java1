package Warehouse.dump.java1.lessons.bitsworld;

/*Задача 1. Класс SumBits
1.1 Реализовать функцию public static int sumBits(byte value), которая суммирует все биты параметра value.
 Например, для двоичного числа 0100101 функция должна вернуть 3.
Подсказки:
используйте & с числом 1 для того, чтобы оставить только один правый значащий бит;
используйте сдвиг вправо для того, чтобы проверить следующий бит.
*/
public class SumBits {

    //------------------------------------------- ok
   /* public static int sumBits(byte value) {

        int result = 0;
        for (int i = 0; i < 8; i++) {
            if ((value & 1) == 1) {
                result++;
            }
            value >>= 1;
        }

        return result;
    }*/
    //--------------------------------------------- ok
    public static int sumBits(byte value) {
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            sum += (value >> i) & 1;
        }
        return sum;
    }
    //----------------------------------------------


    public static void main(String[] args) {

        System.out.println(sumBits((byte) 0100101)); //2
        //System.out.println(sumBits((byte) 10100101)); //3
        //System.out.println(sumBits((byte) 0111100)); //1
    }
}

/*Задача 1. Класс SumBits: пройдено, оценка: 16.0
Комментарий:
OK: Тест "Функция sumBits(byte value)" пройден успешно.
По данной задаче в целом зачет, решение принято. Задача выполнена на 100.00%*/