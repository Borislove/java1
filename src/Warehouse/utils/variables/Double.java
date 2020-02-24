package Warehouse.utils.variables;

public class Double {
    public static void giveDouble() {
        System.out.println("double - 64-разрядное число в формате IEEE 754 с плавающей точкой");
        System.out.println("объем занимаемой памяти: 64 бит");
        System.out.println("Double min " + java.lang.Double.MIN_VALUE);
        System.out.println("Double max " + java.lang.Double.MAX_VALUE);

        String info = "— double – это дробные (вещественные) числа.\n" + "\n ";
        System.out.println(info);
    }
}


