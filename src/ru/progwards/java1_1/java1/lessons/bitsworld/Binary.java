package ru.progwards.java1_1.java1.lessons.bitsworld;

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
        String str = "";
        for (int i = 7; i >= 0; i--) {
            str += (num >> i) & 0b00000001;
        }
        return str;
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
