package Warehouse.speed_racing_2020;

public class Main {

    public static void main(String[] args) {

        Transport babycar = new Transport("babycar", "purple", 500, 5);  //нужно вызвать эти параметры в консоль
        System.out.println(babycar);
        System.out.println(babycar.toString()); //ерунду выдает
        String baby = String.valueOf(babycar);
        System.out.println(baby);
    }
}

