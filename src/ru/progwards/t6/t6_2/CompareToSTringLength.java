package ru.progwards.t6.t6_2;

//длина String через compareTo()
public class CompareToSTringLength {
    public static void main(String[] args) {
        String str1 = "12345";

        System.out.println(str1.compareTo(""));
        System.out.println("".compareTo(str1));

        System.out.println(str1.length());

    }
}
