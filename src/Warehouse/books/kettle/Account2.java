package Warehouse.books.kettle;

//стр 142.
//Счет, вычисляющий собственный доход
public class Account2 {

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

//вычисление дохода
class UseAccount2 {

    public static void main(String[] args) {

        Account2 myAccount = new Account2();
        Account2 yourAccount = new Account2();
        myAccount.name = "Lobster";
        myAccount.address = "222 Minner lane";
        myAccount.balance = 25.02;

        yourAccount.name = "Misha";
        yourAccount.address = "South park 555";
        yourAccount.balance = 1010101.01010;

        myAccount.display();
        System.out.print(" плюс $");
        System.out.print(myAccount.getInterest(5.0));
        System.out.println();
        yourAccount.display();

        double yourInterestRate = 7.00;
        System.out.print(" плюс $");
        double yourInterestAmount = yourAccount.getInterest(yourInterestRate);
        System.out.print(yourInterestAmount);
        System.out.println(" дохода");
    }
}

