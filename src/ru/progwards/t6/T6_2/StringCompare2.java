package ru.progwards.t6.T6_2;

public class StringCompare2 {
    public static void main(String[] args) {
        String str1 = "12345";
        String str2 = "1234";
        str2 +="5";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

    }
}
