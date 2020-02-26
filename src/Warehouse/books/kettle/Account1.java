package Warehouse.books.kettle;

public class Account1 {

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
}

class UseAccount1 {

    public static void main(String[] args) {

        Account1 myAccount = new Account1();
        Account1 yourAccount = new Account1();
        myAccount.name = "Lobster";
        myAccount.address = "222 Minner lane";
        myAccount.balance = 25.02;

        yourAccount.name = "Misha";
        yourAccount.address = "South park 555";
        yourAccount.balance = 1010101.01010;

        myAccount.display();
        System.out.println();
        yourAccount.display();
    }
}
