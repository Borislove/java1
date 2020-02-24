package Warehouse.books.kettle;
/*
//стр 75.
//


//Пример
public class Millionaire {

    public static void main(String[] args) {

        double amountInAccount;
        amountInAccount = 50.22;
        amountInAccount = amountInAccount + 1000000.00;
        System.out.println("На вашем счету сейчас");
        System.out.print(amountInAccount);
        System.out.println(" долларов");
    }
}*/



//
/*public class Millionaire {
    public static void main(String[] args) {
        double amountInAccount = 50.29;
        amountInAccount += 50.71;
        System.out.println("На вашем счету сейчас " + amountInAccount + "долларов");
    }
}*/


//
public class Millionaire {

    private static double amountInAccount = 50.29;
    private static final double FIX_AMOUNT = 50.71;

    public static void main(String[] args) {

        amountInAccount += FIX_AMOUNT;
        System.out.println("на вашем счету сейчас " + amountInAccount);

        amountInAccount = 0;
        System.out.println("на вашем счету сейчас " + amountInAccount);
    }
}
