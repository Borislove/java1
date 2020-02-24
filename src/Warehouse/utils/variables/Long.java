package Warehouse.utils.variables;

public class Long {
    public static void giveLong(){
        System.out.println("long - 64-разрядное целое число");
        System.out.println("объем занимаемой памяти: 64 бит");
        System.out.println("Long min "+ java.lang.Long.MIN_VALUE);
        System.out.println(java.lang.Long.toBinaryString(java.lang.Long.MIN_VALUE));
        System.out.println("Long max "+ java.lang.Long.MAX_VALUE);
        System.out.println(java.lang.Long.toBinaryString(java.lang.Long.MAX_VALUE));
    }
}
