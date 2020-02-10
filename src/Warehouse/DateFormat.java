package Warehouse;

//дату преобразовать в строку , значение все сложить, не так все просто как казалось..

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        System.out.println(formatter.format(date));

        //Integer a = Integer.valueOf(formatter.format(date)); //exeption
        String a = String.valueOf(formatter.format(date));
        System.out.println(a);
        String b = a;
        System.out.println(b);


        //String text = String.valueOf(b);
        // Integer number = Integer.parseInt(text);
        //Integer number = Integer.valueOf(text);


//        number =10+2;
        //System.out.println(number);
/*
        int i = Integer.parseInt(a) ;
        System.out.println(i+2);*/

        //  System.out.println(a+a); //так добавляет строку

        //System.out.println( a / 2);  //так не хочет, надо все таки в инт

        //----------------------------------
        //со строкой так все работает
       /* String ac = "1234";
        Integer ab = Integer.parseInt(ac);
        System.out.println(ab / 2);*/

       //-------------------------------
        //exception
       /*String ac = String.valueOf(b);
       Integer ab = Integer.parseInt(ac);
        System.out.println(ab / 2);*/
    }
}
