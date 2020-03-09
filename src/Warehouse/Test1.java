package Warehouse;

//маленькие эксперименты с сигнатурой
public class Test1 {

    //входящая переменная и вывод
    private static int input(int a) {
        //  System.out.println(a);
        return a;
    }

    private static void sum(int a) {

        int sum = input(a) + input(a);
        System.out.println(sum);
    }

    private static void sumAplusB(int a, int b) {

        int sum = input(a) + input(b);
        System.out.println(sum);
    }

    private static void sumAplusBTest(int a, int b) {

        int sum = a + b;
        System.out.println(sum);
    }

    private static int addition(int x,int y) {
        return x+y;
    }

    public static void main(String[] args) {

       /* input(2);
        input(3);
        input(99);
        input(223);*/

        sum(2);

        sumAplusB(2, 3);

        sumAplusBTest(44, 22);

        System.out.println(input(21));

        System.out.println(addition(99,1));
    }
}
