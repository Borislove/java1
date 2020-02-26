package Warehouse.books.kettle;

//стр 148.
//Округление чисел при выводе на консоль
public class Account3 {

    String name;
    String address;
    double balance;

    public void display() {
        System.out.print(name);
        System.out.print(" (");
        System.out.print(address);
        System.out.print(") имеет на счету $");
        System.out.print(balance);
    }

    public double getInterest(double percentageRate) {
        return balance * percentageRate / 100.00;
    }
}

class UseAccount3 {

    public static void main(String[] args) {

        Account3 myAccount = new Account3();
        Account3 yourAccount = new Account3();
        myAccount.name = "Lobster";
        myAccount.address = "222 Minner lane";
        myAccount.balance = 24.02;

        yourAccount.name = "Misha";
        yourAccount.address = "South park 555";
        yourAccount.balance = 55.63;

        double myInterest = myAccount.getInterest(5.0);
        double yourInterest = yourAccount.getInterest(7.00);

        System.out.printf("$%4.2f\n", myInterest);
        System.out.printf("$%5.2f\n", myInterest);
        System.out.printf("$%3.2f\n", myInterest);
        //System.out.printf("$%.2f $%2.f", myInterest, yourInterest);  //не работает
        //System.out.printf("$%.2f\n" + myInterest);  //java.util.MissingFormatArgumentException: Format specifier '%.2f'
    }
}

