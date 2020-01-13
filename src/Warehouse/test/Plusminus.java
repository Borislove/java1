package Warehouse.test;


//положительные и отрицательные
//четные нечетные...
public class Plusminus {

    static int a = 1;
    static int b = 2;

    public static void main(String[] args) {
        System.out.println("test");

        for(int i = 0; i<10;i++){
            System.out.print(" Нечетное число = "+a);
            a = a+2;

            System.out.println(" Четное число = "+b);
            b = b+2;

          /*  // TODO: 27.12.2019 тут надо вернуть а, потом отнять
            a = a-2;            //сбивается 1 итерация
             System.out.print(" Нечетное отрицательное число = "+(a-2));*/

        }

//        System.out.println("a = "+a);
  //      System.out.println("b = "+b);
    }


}
