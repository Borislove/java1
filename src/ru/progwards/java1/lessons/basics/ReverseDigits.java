package ru.progwards.java1.lessons.basics;

//почти...

 /* public class ReverseDigits {


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

    reverseDigits(21312562);

    }
}
  */

 //ver2  через деление / умножение
public class ReverseDigits {

    static int number ;
    public static int reverseDigits(int number){
        int a,b,c;

        a = (number) / 100 ;
        b = (number) % 100 / 10;
        c = (number) % 10 ;
//                System.out.println("a = " +a);
//                System.out.println("b = " +b);
//                System.out.println("c = " +c);
//                System.out.println(c+""+b+""+a);
        c = c*100;
        b = b*10;
        a = a;
        int sum = c+b+a;
        // System.out.println("sum " + sum);
        System.out.println(sum);
        //  System.out.println("после умножения" + c+""+b+""+a);
        return number;
    }
    public static void main(String[] args) {
//         reverseDigits1(253);
        //         reverseDigits1(739);
        reverseDigits(number);
        //   reverseDigits1(130);
        //   reverseDigits1(123);
        //reverseDigits1(230);
        //reverseDigits1(679);
    }
}


