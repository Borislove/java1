package ru.progwards.java1.lessons.bitsworld;

public class Binary {

    private static byte num;

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

    @Override
    public String toString() {
        //return String.format("%08d", num);
        return String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0');
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
