package ru.progwards.java1_2.lessons.bigints;
public class AbsInteger {
    protected int bytes;
    static AbsInteger add(AbsInteger num1, AbsInteger num2) {
        return num1.bytes >= num2.bytes ? num1.add2(num2) : num2.add2(num1);
    }
    protected AbsInteger add2(AbsInteger num1) {
        return null;
    }
    protected byte toByte() {
        return 0;
    }
    protected short toShort() {
        return 0;
    }
    protected int toInt() {
        return 0;
    }

    public static void main(String[] args) {
        AbsInteger num1 = new ByteInteger((byte)10);
        AbsInteger num2 = new ShortInteger((short)1314);
        System.out.println(AbsInteger.add(num1, num2));
    }
}

class ByteInteger extends AbsInteger {
    byte value;
    ByteInteger(byte value) {
        this.value = value;
        bytes = 1;
    }
    @Override
    public String toString() {
        return Byte.toString(value);
    }
    @Override
    protected byte toByte() {
        return value;
    }
    @Override
    protected short toShort() {
        return value;
    }
    @Override
    protected int toInt() {
        return value;
    }
    @Override
    protected AbsInteger add2(AbsInteger num1) {
        return new ByteInteger((byte) (value + num1.toByte()));
    }
}

class ShortInteger extends AbsInteger {
    short value;
    ShortInteger(short value) {
        this.value = value;
        bytes = 2;
    }
    @Override
    public String toString() {
        return Short.toString(value);
    }
    @Override
    protected short toShort() {
        return value;
    }
    @Override
    protected int toInt() {
        return value;
    }
    @Override
    protected AbsInteger add2(AbsInteger num1) {
        return new ShortInteger((short) (value + num1.toShort()));
    }
}

class IntInteger extends AbsInteger {
    int value;
    IntInteger(int value) {
        this.value = value;
        bytes = 4;
    }
    @Override
    public String toString() {
        return Integer.toString(value);
    }
    @Override
    protected int toInt() {
        return value;
    }
    @Override
    protected AbsInteger add2(AbsInteger num1) {
        return new IntInteger((int) (value + num1.toInt()));
    }
}


/*
package ru.progwards.java1.lessons.bigints;


//2.1 Реализовать класс AbsInteger - абстрактное целое число
public class AbsInteger {

    private int bytes;

  */
/*  2.2 Реализовать потомков ByteInteger, ShortInteger, IntInteger,
     хранящих значение целого числа соответствующего типа. У каждого типа реализовать конструктор,
     принимающей значение числа соответствующего типа, для ByteInteger - byte, ShortInteger - short и IntInteger - int.
     Реализовать унаследованные публичные методы String toString(), посредством которых
     возвращать приведенное к строке значение соответствующего классу типа.*//*


    */
/*2.3 У класса AbsInteger реализовать метод static AbsInteger add(AbsInteger num1, AbsInteger num2)
      - который вычисляет сумму num1 и num2. При этом надо учесть, что num1 и num2 могут быть разных типов.
      Для того, чтобы это реализовать продумать, какие дополнительные методы нужно сделать у AbsInteger и его потомков.*//*


    */
/*static AbsInteger add(AbsInteger num1, AbsInteger num2) {
        }*//*

}

class ByteInteger extends AbsInteger {
    private byte value;

    public ByteInteger(byte value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Byte.toString(value);
    }
}

class ShortInteger extends AbsInteger {
    private short value;

    public ShortInteger(short value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Short.toString(value);
    }
}

class IntInteger extends AbsInteger {
    private int value;

    public IntInteger(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}


*/
