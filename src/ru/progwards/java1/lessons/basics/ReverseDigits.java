package ru.progwards.java1.lessons.basics;

//почти...
public class ReverseDigits {

    public static int reverseDigits(int number) {


        Integer numb = Integer.valueOf(number);

        String str = numb.toString();

        str = new String(str);

        StringBuffer rev = new StringBuffer(str);
        rev.reverse();


        int reva = Integer.parseInt(rev.toString());
        System.out.println(reva);

          return 0;
    }

    public static void main(String[] args) {

    }
}
