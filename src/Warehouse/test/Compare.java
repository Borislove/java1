package Warehouse.test;

public class Compare {

    public static Integer ab = 2;
    public static Integer ba = 2;

    public static Character a = 'a';
    public static Character b = 'a';

    public static Character aa = 'a';      //лишняя строка
    public static Character bb = 'A';

    public static String str99 = "testing";
    public static String str999 = "TESTING";

    public static void main(String[] args) {

        System.out.println(a == b);
        System.out.println(aa == bb);

        System.out.print("Вызван compareTo a b ");
        System.out.println(a.compareTo(b));

        System.out.print("Вызван compareTo aa bb ");
        System.out.println(aa.compareTo(bb));

        System.out.print("Вызван compareTo ab ba ");
        System.out.println(ab.compareTo(ba));

        //метод переводит в нижний регистр
        System.out.println(bb.toLowerCase(bb));
        System.out.println(aa.toUpperCase(aa));

        System.out.println(bb.toLowerCase(aa.compareTo(aa)));  //равные
        System.out.println(aa.toLowerCase(bb.compareTo(aa)));
        System.out.println(aa.toLowerCase(aa.compareTo(bb)));

        //test, поднимает и опускает
        System.out.println(str99.toUpperCase());
        System.out.println(str999.toLowerCase());

        System.out.println(str99.compareTo(str999));
        System.out.println(str99.length());
        System.out.println(str999.length());


    }
}
