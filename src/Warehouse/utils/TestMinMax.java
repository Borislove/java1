package Warehouse.utils;


public class TestMinMax {

    public static void main(String[] args) {

        //Integer();
        //Short();
        //Float();
        //Double();

       // Long();
/*
        Integer xm = Integer.MAX_VALUE ;
        Integer xmin = Integer.MIN_VALUE;
        System.out.println(Integer.toBinaryString(xm));
        System.out.println(Integer.toBinaryString(xmin));
        System.out.println(String.format("%32s", Integer.toBinaryString(xm)).replace(' ', '0'));*/
    }
}

/*

package Warehouse.Variable;

//запятую можно воткнуть почитать тут
//https://ru.stackoverflow.com/questions/257377/%D0%92%D1%8B%D0%B2%D0%BE%D0%B4-double-%D0%B2-java
// тут еще про дабл
//https://habr.com/ru/post/219595/

public class Double {


    // TODO: 19.12.2019 пока не понимаю, но работает! делает запятую
    /*static public void customFormat(String pattern, double value ) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        System.out.println(value + "  " + pattern + "  " + output);
    }


    static double d1 = 567.89;
    static double d2 = 5.6789E2;
    static double d3 = 56789E-2;
    static double d4 = 5678.9D;  // D || d
    //static double MIN_VALUE;
    static double d5 =1.7E+308;  //max
    static double d6 =-1.7E+308; //min
    //static double SIZE = 1;
    //static double BYTES = 1;

//    static double MIN_VALUE;
//  static double MAX_VALUE ;
//max min

    // TODO: 22.12.2019 Дедовский метод вычисляющий точность
    static double precition(double d) {
        double p = d;
        while (Math.abs(d)>0){
            p = d;
            d /=2;
        }
        return p;
    }

    public static void main(String[] args) {
        System.out.println("Немного double");
        System.out.println("Максимальное значение double: " + d5 + "\nМинимальное значение double: "+ d6);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);

        //      System.out.println(MIN_VALUE);
//        System.out.println(MAX_VALUE);

        //System.out.println(SIZE);
        //System.out.println(BYTES);


        //  customFormat("###,###.###", d1);   //

        System.out.println(precition(5.0));



    }
}
*/