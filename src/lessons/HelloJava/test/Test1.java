package lessons.HelloJava.test;

import ru.progwards.java1.lessons.abstractnum.IntNumber;

//
public class Test1 {
   private int a;
   private int b;


    //конструктор
  public  Test1(int a, int b){

      int result = a*b;
      System.out.println("Test 1# "+result);

      Integer a1 = new Integer(a);
      Integer b1 = new Integer(b);
      Integer resultInt = a1*b1;
      System.out.println("Test 2# "+resultInt);



    }

    public static void main(String[] args) {
      new  Test1(2,3);

    }
}
