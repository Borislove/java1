package ru.progwards.t6.t6_2;

//сравнение String через compareTo()
//в сравнении строк, регистрозависима
public class CompareToString {
    public static void main(String[] args) {
        String str1 = "ABCDE12345";
        String str2 = "ABCDE12345";

        System.out.println(str1.compareTo(str2));      //0

        str1 = "aBCDE12345";
        str2 = "ABCDE12345";

        System.out.println(str1.compareTo(str2));    //32

        str1 = "ABCDE12345";
        str2 = "CDE12345";

        System.out.println(str1.compareTo(str2));  //-2
    }
}
