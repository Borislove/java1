package ru.progwards.java1.lessons.basics;

//почти...
public class ReverseDigits {


    static int number ;
        public static int reverseDigits (int number){

            Integer numb = Integer.valueOf(number);
            String str = numb.toString();
           // str = new String(str);
            StringBuffer rev = new StringBuffer(str);
            rev.reverse();

            int reva = Integer.parseInt(rev.toString());
         System.out.println(reva);
            return reva;
        }


    public static void main(String[] args) {
          reverseDigits(number);

    reverseDigits(212);
    }
}
