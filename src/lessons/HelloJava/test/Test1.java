package lessons.HelloJava.test;

//
public class Test1 {
    public static int a;
    public static int b;


    //конструктор
  public static void Test1(int a, int b){
      int result = a*b;
      System.out.println(result);
    }

    public static void main(String[] args) {
         Test1(2,3);

    }
}
