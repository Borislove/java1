package Warehouse;

//вроде работает...сложение цифр в строке пока длина из 4-ех
public class Examples {

    //private static String str = "1234"; //10
    private static String str = "9876"; //30

    public static void main(String[] args) {

        Integer strInt = Integer.parseInt(str);  // парсим строку в число
        System.out.println("strInt = " + strInt);

        int a = strInt % 10;
        System.out.println(a);   // 4

        int b = strInt % 100;
        System.out.println("b " + b);   //34
        b -= a;
        b /= 10;
        System.out.println(b); //3

        int c = strInt % 1000;
        System.out.println(c);   //234
        c = (strInt % 1000 - (a + b * 10)) / 100;
        System.out.println(c);  //2

        int d = strInt % 10000;  //1234
        System.out.println(d);
        d -= (a + b * 10 + c * 100);
        d /= 1000;
        System.out.println(d);

        //  System.out.println(a + b + c + d); // 10
        System.out.println(a + b + c + d); // 30
    }
}
