package ru.progwards.java1.lessons.basics;
/*
* 1.1 Реализовать функцию
public static int reverseDigits(int number), которая получает параметром number трёхзначное положительное число, а вернуть должна число в котором цифры идут в обратном порядке
*  (например, если на вход передаётся 123, то функция должна вернуть 321).
*
* реверс..
*/

public class ReverseDigits {

    public static int reverseDigits(int number) {

        Integer numb = Integer.valueOf(number);
        // System.out.println(numb);
        String str = numb.toString();

        str = new String(str);
 //       System.out.println(str);
        StringBuffer rev = new StringBuffer(str);
        rev.reverse();
//  System.out.println("это текст " + rev);

        int reva = Integer.parseInt(rev.toString()); //текс в инт и в реверс
        System.out.println(reva);
         //System.out.println(str);

    //     System.out.println(rev);
        return 0;
    }

    public static void main(String[] args) {
 //reverseDigits(203);
 // reverseDigits(230);
  reverseDigits(570);
//reverseDigits(639);
    }
}
