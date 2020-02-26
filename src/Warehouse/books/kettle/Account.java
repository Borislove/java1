package Warehouse.books.kettle;

//стр. 134

public class Account {
    String name;
    String address;
    double balance;
}

class UseAccount {

    public static void main(String[] args) {

        Account myAccount;
        Account yourAccount;

        Account test = new Account();
        test.name = "Gosha";
        test.address = "no address";
        test.balance = 0.27;

        myAccount = new Account();
        yourAccount = new Account();

        myAccount.name = "Pupsic";
        myAccount.address = "777 Luser Street";
        myAccount.balance = 102.57;

        yourAccount.name = "Jaja";
        yourAccount.address = "123 Tetris valley";
        yourAccount.balance = 666.66;

        System.out.print(myAccount.name);
        System.out.print(" (");
        System.out.print(myAccount.address);
        System.out.print(") имеет $");
        System.out.print(myAccount.balance);
        System.out.println();

        System.out.print(yourAccount.name);
        System.out.print(" (");
        System.out.print(yourAccount.address);
        System.out.print(") имеет $");
        System.out.print(yourAccount.balance);
        System.out.println();

        System.out.println(test.name + " " + test.address + " " + test.balance);
    }
}
