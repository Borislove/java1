package Warehouse.utils.variables;

public class Short {
    public static void giveShort() {
        System.out.println("short - 16-разрядное целое число");
        System.out.println("объем занимаемой памяти: 16 бит");
        System.out.println("Short min " + java.lang.Short.MIN_VALUE);
        System.out.println("Short max " + java.lang.Short.MAX_VALUE);   // нужно использовать класс обёртку
//        System.out.println(java.lang.Short.MIN_VALUE+ java.lang.Short.MAX_VALUE);
    }
}
