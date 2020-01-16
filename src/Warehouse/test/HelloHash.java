package Warehouse.test;

public class HelloHash {

        public static void main(String[] args) {
//----------получаем хеш код
             Character a = ' ';

             //hash для пробела 32
             System.out.println("HashCode " +  a.hashCode());
//----------------------

    /*        //test , сработал...
            String str = "Hello Java!";
            System.out.println(str.hashCode());
            System.out.println(str.length());
            //System.out.println(str.toUpperCase());
            System.out.println(str.toUpperCase().hashCode());
            System.out.println(str.toLowerCase().hashCode());

            System.out.println(Integer.valueOf( str.hashCode() ) );  //по идеи это число...в интежер
            System.out.println(str);
*/
            //
/*
            //пробую через массив
            String [] code = {"72","101","108","108","111","74", "65", "86","65"};

            //System.out.println( (char)Integer.parseInt(Arrays.toString(code)));

            for (int i = 0; i < code.length; i++) {
                //пару букв потерял
                System.out.println( (char)Integer.parseInt(code[i]));
            }

            String strJav = "V";*/
            //System.out.println(strJav.hashCode());
        }
    }

