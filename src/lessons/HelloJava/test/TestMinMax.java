package lessons.HelloJava.test;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;


//минимальные и максимальные значения
public class TestMinMax {

    public static Integer x = 3;
    public static Integer aMax = MAX_VALUE;
    public static Integer aMin = MIN_VALUE;

    public static Short s;

    public static void main(String[] args) {

        System.out.println("Integer min " + aMin);
        System.out.println("Integer max  " + aMax);

        System.out.println("Short min "+ Short.MIN_VALUE);
        System.out.println("Short max "+ Short.MAX_VALUE);   // нужно использовать класс обёртку

        System.out.println("Long min "+Long.MIN_VALUE);
        System.out.println("Long max "+Long.MAX_VALUE);

        System.out.println("Double min "+Double.MIN_VALUE);
        System.out.println("Double max "+Double.MAX_VALUE);

        System.out.println("Float min "+Float.MIN_VALUE);
        System.out.println("Float max "+Float.MAX_VALUE);
    }
}
