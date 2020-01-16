package ru.progwards.T7.T7_2;

public class Speed {
    public static void main(String[] args) {
        byte unsignedSpeed = (byte)0b10000111; //135
        System.out.println(unsignedSpeed);

        int speed1 = unsignedSpeed;
        System.out.println(speed1);
        System.out.println(Integer.toBinaryString(speed1));

        int speed2 = unsignedSpeed & 0b00000000_00000000_00000000_11111111; //двоичный аналог 0xFF
        System.out.println(speed2);
        System.out.println(Integer.toBinaryString(speed2));
    }
}
