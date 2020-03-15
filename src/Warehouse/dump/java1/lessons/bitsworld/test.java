package Warehouse.dump.java1.lessons.bitsworld;

public class test {
    public static int sumBits(byte value) {
        byte r = 0;
        if (value < 0) {
            r++;
            value &= 0b0111_1111;
        }
        while (value != 0) {
            r += value & 1;
            value >>= 1;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(sumBits((byte) 0b0010_0110));
        System.out.println(sumBits((byte) 0b1010_0110));
        System.out.println(sumBits((byte) 0b1000_0000));
        System.out.println(sumBits((byte) 0b0000_0000));

        System.out.println(sumBits((byte) 0100101)); //2
    }
}

