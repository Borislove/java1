package ru.progwards.java1.lessons.bitsworld;

public class Binary {

    private byte num;

    /*3.1 Реализовать конструктор
    public Binary(byte num).*/
    public Binary(byte num) {
        this.num = num;
    }

    /*3.2 Реализовать метод
    public String toString(), который возвращает двоичное представление числа типа byte, используя только битовые операции. В выводимом значении всегда должно быть 8 символов
    Например:
    0: "00000000"
    1: "00000001"
    127: "01111111"
    -128: "10000000"
    -1: "11111111"*/

    @Override
    public String toString() {
        return "";
    }

    public static void main(String[] args) {

        //Binary binary = new Binary((byte) -128);
        // Binary binary = new Binary((byte) 15);
        Binary binary = new Binary((byte) 44);
        System.out.println(binary.toString());

    }
}
