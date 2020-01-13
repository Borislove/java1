package Warehouse.test;



//Числа Фибоначчи это ряд чисел 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
public class Fibonachi {



    public static void fibo() {
      int a = 1;
        int b = 0;
        int fibo;
        for(int i = 0; i < 20; i++){
            fibo = a+b;
            a = b;
            b = fibo;
            System.out.println("Fibo = "+fibo);
        }
        }


    public static void main(String[] args) {
        fibo();




    }
}
