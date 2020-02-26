package Warehouse.books.kettle;

//стр. 153
//Сокрытие полей класса
public class Account4 {

    private String name;
    private String address;
    private double balance;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String a) {
        address = a;
    }

    public String getAddress() {
        return address;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }
}

//Вызов методов доступа
class UseAccount4 {

    public static void main(String[] args) {

        Account4 myAccount = new Account4();
        Account4 yourAccount = new Account4();

        myAccount.setName("Misha");
        myAccount.setAddress("555 Luser street");
        myAccount.setBalance(24.02);

        yourAccount.setName("Darya");
        yourAccount.setAddress("123 shocolate valley");
        yourAccount.setBalance(55.63);

        System.out.print(myAccount.getName());
        System.out.print(" (");
        System.out.print(myAccount.getAddress());
        System.out.print(") имеет на счету $");
        System.out.print(myAccount.getBalance());
        System.out.println();

        System.out.print(yourAccount.getName());
        System.out.print(" (");
        System.out.print(yourAccount.getAddress());
        System.out.print(") имеет на счету $");
        System.out.print(yourAccount.getBalance());
    }
}
