package Warehouse.test;

public class Test {

    static int addAsStrings(int n1, int n2){

        System.out.println((n1)+(0)+(n2));

     //  return (n1) + + (n2);  // так можно
    //  return (n1)+ +(n2);  // так можно
       //return (n1) ++ (n2);  //а так нельзя



     //   System.out.println(String.valueOf(n1)+String.valueOf(n2));

                //return (String.valueOf(n1)+String.valueOf(n2));

     return 0;

     //   Character a = ' ';
        //hash для пробела 32
       // System.out.println("HashCode " +  a.hashCode());

      //  System.out.println(n1+a.hashCode(32)+n2);



      // return (n1+a.hashCode()+n2);
//return ((n1)+(%20)+(n2));
    }


    public static void main(String[] args) {



        addAsStrings(1, 2);
        addAsStrings(9283,6574);
    }
}
