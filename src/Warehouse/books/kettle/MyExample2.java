package Warehouse.books.kettle;

//см. MyExample1
public class MyExample2 {
    public static void main(String[] args) {

        String token[] = {"fasdf", "fsdf", "fasdfjjlj", "oiuoiu", "jnn", "exit"};

        for (String value : token) {
            //    System.out.println(value);
            if (value == "exit") {
                System.out.println("выйти");
            }
        }
    }
}
