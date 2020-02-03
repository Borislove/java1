package Warehouse.speed_racing_2020;

public class Transport {

    public static String name;
    public static String color;
    public static int max_speed;
    public static int weight;

    public static void nameCar(String name) {
        name = "Standart";
        System.out.println(name);
    }

    public static void colorCar(String color) {
        color = "Default white";
        System.out.println(color);
    }

    public static void maxSpeed(int max_speed) {
        max_speed = 120;
        System.out.println(max_speed);
    }

    public static void weighCar(int weight) {
        weight = 1500;
        System.out.println(weight);
    }

    public static void parametr() {

        System.out.print("Модель:");
        nameCar(name);
        System.out.print("Цвет:");
        colorCar(color);
        System.out.print("Максимальная скорость:");
        maxSpeed(max_speed);
        System.out.print("Вес:");
        weighCar(weight);
    }
}



