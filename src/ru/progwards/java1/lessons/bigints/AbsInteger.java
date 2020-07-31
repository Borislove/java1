package ru.progwards.java1.lessons.bigints;


//2.1 Реализовать класс AbsInteger - абстрактное целое число
public class AbsInteger {

    protected int value;

  /*  2.2 Реализовать потомков ByteInteger, ShortInteger, IntInteger,
     хранящих значение целого числа соответствующего типа. У каждого типа реализовать конструктор,
     принимающей значение числа соответствующего типа, для ByteInteger - byte, ShortInteger - short и IntInteger - int.
     Реализовать унаследованные публичные методы String toString(), посредством которых
     возвращать приведенное к строке значение соответствующего классу типа.*/


    class ByteInteger extends AbsInteger {
        byte value;

        public ByteInteger(byte value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return Byte.toString(value);
        }
    }

    class ShortInteger extends AbsInteger {
        short value;

        public ShortInteger(short value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return Short.toString(value);
        }
    }

    class IntInteger extends AbsInteger {
        int value;

        public IntInteger(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return Integer.toString(value);
        }
    }
}
