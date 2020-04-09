package ru.progwards.java1.lessons.bigints;

/*2.1 Реализовать класс AbsInteger - абстрактное целое число*/
public class AbsInteger extends Number {


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*2.3 У класса AbsInteger реализовать метод static AbsInteger add(AbsInteger num1, AbsInteger num2) - который
    вычисляет сумму num1 и num2. При этом надо учесть, что num1 и num2 могут быть разных типов.
    Для того, чтобы это реализовать продумать, какие дополнительные методы нужно сделать у AbsInteger и его потомков.*/
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static AbsInteger add(AbsInteger num1, AbsInteger num2) {
        return null;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    @Override
    public byte byteValue() {
        return super.byteValue();
    }

    @Override
    public short shortValue() {
        return super.shortValue();
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*2.2 Реализовать потомков ByteInteger, ShortInteger, IntInteger, хранящих значение целого числа соответствующего типа.
     У каждого типа реализовать конструктор, принимающей значение числа соответствующего типа,
     для ByteInteger - byte, ShortInteger - short и IntInteger - int.
     Реализовать унаследованные публичные методы String toString(), посредством которых возвращать приведенное
      к строке значение соответствующего классу типа.*/
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}

class ByteInteger extends AbsInteger {

    byte b;

    public ByteInteger(byte b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "ByteInteger{" +
                "b=" + b +
                '}';
    }
}

class ShortInteger extends AbsInteger {

    short s;

    public ShortInteger(short s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "ShortInteger{" +
                "s=" + s +
                '}';
    }
}

class IntInteger extends AbsInteger {

    int x;

    public IntInteger(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "IntInteger{" +
                "x=" + x +
                '}';
    }
}

//Привести результат к наиболее подходящему типу, т.е. -128..127 это ByteInteger и т.д.

