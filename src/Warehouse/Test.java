package Warehouse;

class Test {

    void test() {  //?
    }

    public static int x = 2;

    public static void main(String[] args) {

        if (x == 2)
            System.out.println("2");
        x++;
        if (x == 3)
            System.out.println("3");
        ++x;
        if (x == 4)
            System.out.println("4");

        x += 6;
        if (x == 10)
            System.out.println("10");

        x *= Math.PI;
        System.out.println(x);  //31

        x /= Math.E;
        System.out.println(x);  //11
        //return;
    }
}
