package ru.progwards.java1.lessons.bigints;


//2.1 Реализовать класс AbsInteger - абстрактное целое число
public class AbsInteger {

    private int bytes;

  /*  2.2 Реализовать потомков ByteInteger, ShortInteger, IntInteger,
     хранящих значение целого числа соответствующего типа. У каждого типа реализовать конструктор,
     принимающей значение числа соответствующего типа, для ByteInteger - byte, ShortInteger - short и IntInteger - int.
     Реализовать унаследованные публичные методы String toString(), посредством которых
     возвращать приведенное к строке значение соответствующего классу типа.*/

    /*2.3 У класса AbsInteger реализовать метод static AbsInteger add(AbsInteger num1, AbsInteger num2)
      - который вычисляет сумму num1 и num2. При этом надо учесть, что num1 и num2 могут быть разных типов.
      Для того, чтобы это реализовать продумать, какие дополнительные методы нужно сделать у AbsInteger и его потомков.*/

    /*static AbsInteger add(AbsInteger num1, AbsInteger num2) {
        }*/
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


