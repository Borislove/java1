package ru.progwards.T6.T6_2;

//сравнение Integer через compareTo()
public class CompareToInteger {
    public static void main(String[] args) {

        Integer a = 1;
        Integer b = 1;

        System.out.println(a.compareTo(b));

        a = 5;
        b = 1;

        System.out.println(a.compareTo(b));

        a = 1;
        b = 5;



        System.out.println(a.compareTo(b));
    }
}
