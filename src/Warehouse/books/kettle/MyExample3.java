package Warehouse.books.kettle;

//без комментариев!...
public class MyExample3 {

    private static int length; //длина
    private static int height;  //высота
    private static double width;   //ширина
    private static double weight; //вес
    private static String material;   //материал
    private static String color;  //цвет
    private static int quantity;  //количество
    private static int price;  //цена

    public MyExample3(int length, int height, double width, double weight, String material, String color, int quantity, int price) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.material = material;
        this.color = color;
        this.quantity = quantity;
        this.price = price;
    }

    public static int getLength() {
        return length;
    }

    public static int getHeight() {
        return height;
    }

    public static double getWidth() {
        return width;
    }

    public static double getWeight() {
        return weight;
    }

    public static String getMaterial() {
        return material;
    }

    public static String getColor() {
        return color;
    }

    public static int getQuantity() {
        return quantity;
    }

    public static int getPrice() {
        return price;
    }

    public static void setLength(int length) {
        MyExample3.length = length;
    }

    public static void setHeight(int height) {
        MyExample3.height = height;
    }

    public static void setWidth(double width) {
        MyExample3.width = width;
    }

    public static void setWeight(double weight) {
        MyExample3.weight = weight;
    }

    public static void setMaterial(String material) {
        MyExample3.material = material;
    }

    public static void setColor(String color) {
        MyExample3.color = color;
    }

    public static void setQuantity(int quantity) {
        MyExample3.quantity = quantity;
    }

    public static void setPrice(int price) {
        MyExample3.price = price;
    }

    public static void construct() {
        System.out.println("Материал: " + getMaterial());
        System.out.println("Цвет: " + getColor());
        System.out.println("Длина: " + getLength());
        System.out.println("Высота: " + getHeight());
        System.out.println("Ширина: " + getWidth());
        System.out.println("Вес: " + getWeight());
        System.out.println("Цена: " + getPrice());
        System.out.println("Остаток: " + getQuantity());
        System.out.println("Итого: " + getQuantity() * getPrice());
    }
}


class UseMyExample {

    public static void main(String[] args) {

        //  MyExample3 example = new MyExample3();
//        example.construct();
        MyExample3 example3 = new MyExample3(1, 2, 0.4, 50.0, "metall", "green", 99, 3000);
        example3.construct();
    }
}