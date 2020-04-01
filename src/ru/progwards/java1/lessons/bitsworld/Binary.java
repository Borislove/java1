package ru.progwards.java1.lessons.bitsworld;

public class Binary {

    private byte num;

    ///////////////////////////////////
    /*3.1 Реализовать конструктор
    public Binary(byte num)*/
    ///////////////////////////////////
    public Binary(byte num) {
        this.num = num;
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    /*3.2 Реализовать метод
    public String toString(), который возвращает двоичное представление числа типа byte,
    используя только битовые операции. В выводимом значении всегда должно быть 8 символов*/
    ////////////////////////////////////////////////////////////////////////////////////////

    public String toString() {
        int value = num & 0b0000000_0000000_0000000_11111111;
        return String.format("%8s", Integer.toBinaryString(value)).replace(' ', '0');
    }

    public static void main(String[] args) {
        System.out.println(new Binary((byte) 0).toString());
        System.out.println(new Binary((byte) 1).toString());
        System.out.println(new Binary((byte) 2).toString());
        System.out.println(new Binary((byte) 127).toString());
        System.out.println(new Binary((byte) -128).toString());
        System.out.println(new Binary((byte) -1).toString());
    }
}
