package Warehouse;

public class TestTypes {

    static void testType(Object o) {
        System.out.println(o.getClass().getName());
    }

    public static void main(String[] args) {

        testType(Integer.valueOf(1));
        testType(Double.valueOf(1));
    }
}
