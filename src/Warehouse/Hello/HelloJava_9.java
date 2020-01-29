package Warehouse.Hello;

// TODO: 11.01.2020  надо умудрится разбить слово на символы, потом эти символы в хеш, хотя целиком работает тоже

public class HelloJava_9 {

    public static void main(String[] args) {

//----------получаем хеш код
        //   Character a = 'V';
        //  System.out.println("HashCode " +  a.hashCode());
//----------------------

        //test , сработал...
        String str = "Hello Java!";
        System.out.println("hash string " + str + " " + str.hashCode());
        // System.out.println(str.length());
        //System.out.println(str.toUpperCase());
        System.out.println(str.toUpperCase().hashCode()); //поднять все буквы в регистре
        System.out.println(str.toLowerCase().hashCode());  //опустить все буквы в регистре

        System.out.println("дай строку " + Integer.valueOf(str.hashCode()));  //по идеи это число...в интежер
        System.out.println(str);

        //пробую через массив
        String[] code = {"72", "101", "108", "108", "111", "74", "65", "86", "65"};

        //System.out.println( (char)Integer.parseInt(Arrays.toString(code)));

        for (int i = 0; i < code.length; i++) {
            //пару букв потерял
            System.out.println((char) Integer.parseInt(code[i]));
        }

        //--------------------------ok----------------
       /* String code = "72"; //
        String code101 = "101"; //101

        String code108 = "108";//108 x2
        String code111 = "111";//111

        String code74 = "74";// 74
        String code65 = "65";//65
        String code86 = "86";//86



        System.out.println( (char)Integer.parseInt(code));
        System.out.println( (char)Integer.parseInt(code101));
        System.out.println( (char)Integer.parseInt(code108));
        System.out.println( (char)Integer.parseInt(code108));
        System.out.println( (char)Integer.parseInt(code111));
        System.out.println( (char)Integer.parseInt(code74));
        System.out.println( (char)Integer.parseInt(code65));
        System.out.println( (char)Integer.parseInt(code86));
        System.out.println( (char)Integer.parseInt(code65));*/


        String strJav = "V";
        System.out.println(strJav.hashCode());
    }
}


