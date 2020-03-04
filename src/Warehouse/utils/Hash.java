package Warehouse.utils;

//в обратную сторону бы еще
public class Hash {
    public static void main(String[] args) {

        //получаем хеш код из символа
        Character a = 'V';
        System.out.println("HashCode is simbol  [ " + a.hashCode() + " ]");

        //получаем хеш код из числа
        Integer in = 0;
        System.out.println("HashCode is number  [ " + in.hashCode() + " ]");

        //получаем хеш код из строки
        String str = "Hello World!";
        System.out.println("HashCode is string  [ " + str.hashCode() + " ]");

        String strJava = "JAVA";
        System.out.println("strJava.hashCode() = " + strJava.hashCode()); //совсем другой код чем посимвольно

        String password = "Password123";
        System.out.println("password = " + password.hashCode());

        Character myLostLetter = 'Ё';
        System.out.println(myLostLetter.hashCode());

    }
}


//hash для пробела 32