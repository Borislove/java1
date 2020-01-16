package Warehouse.test;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

//минимальные и максимальные значения
public class TestMinMax {

    public static Integer x = 3;
    public static Integer aMax = MAX_VALUE;
    public static Integer aMin = MIN_VALUE;


    public static void Double(){
        System.out.println("Double min "+Double.MIN_VALUE);
        System.out.println("Double max "+Double.MAX_VALUE);
    }

    public static void Float(){
        System.out.println("Float min "+Float.MIN_VALUE);
        System.out.println("Float max "+Float.MAX_VALUE);
    }

    public static void Long(){
        System.out.println("Long min "+Long.MIN_VALUE);
        System.out.println(Long.toBinaryString(Long.MIN_VALUE));
        System.out.println("Long max "+Long.MAX_VALUE);
        System.out.println(Long.toBinaryString(Long.MAX_VALUE));
    }

    public static void Short(){
        System.out.println("Short min "+ Short.MIN_VALUE);
        System.out.println("Short max "+ Short.MAX_VALUE);   // нужно использовать класс обёртку
        System.out.println(Short.MIN_VALUE+Short.MAX_VALUE);
    }

    public static void Integer() {
        System.out.println("Integer min " + aMin);
        System.out.println("Integer max  " + aMax);
        //System.out.println(aMin+aMax); // -1
    }




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
