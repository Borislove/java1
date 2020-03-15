package Warehouse.dump.java1.lessons.basics;

//через реверс
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
//------------------------------------------------------------------------

//ver2  через деление / умножение
public class ReverseDigits {

    static int number;

    public static int reverseDigits(int number) {
        int a, b, c;

        a = (number) / 100;
        b = (number) % 100 / 10;
        c = (number) % 10;
//                System.out.println("a = " +a);
//                System.out.println("b = " +b);
//                System.out.println("c = " +c);
//                System.out.println(c+""+b+""+a);
        c = c * 100;
        b = b * 10;
        a = a;
        int sum = c + b + a;
        // System.out.println("sum " + sum);
        System.out.println(sum);
        //  System.out.println("после умножения" + c+""+b+""+a);
        return sum;
    }

    public static void main(String[] args) {
        //reverseDigits(253);
        reverseDigits(number);

    }
}


