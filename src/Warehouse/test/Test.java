package Warehouse.test;

public class Test {

    static int addAsStrings(int n1, int n2){

//        System.out.println((n1)+(0)+(n2));

     //  return (n1) + + (n2);  // так можно
    //  return (n1)+ +(n2);  // так можно
       //return (n1) ++ (n2);  //а так нельзя



     //   System.out.println(String.valueOf(n1)+String.valueOf(n2));

                //return (String.valueOf(n1)+String.valueOf(n2));

     //return 0;

     //   Character a = ' ';
        //hash для пробела 32
       // System.out.println("HashCode " +  a.hashCode());

      //  System.out.println(n1+a.hashCode(32)+n2);



      // return (n1+a.hashCode()+n2);
//return ((n1)+(%20)+(n2));


        //-----------------------
      /*  Integer n1n = Integer.valueOf(n1);
        n1n.toString();
        Integer n2n = Integer.valueOf(n2);
        n2n.toString();
        String str = n1n.toString()+""+n2n.toString();
        String str2 = n1n+""+n2n;
        System.out.println(str2);
        System.out.println(n1n+""+n2n);*/
        //return 0;
        //---------------------------

     //   System.out.println(Integer.valueOf(n1)+String.valueOf("")+Integer.valueOf(n2)); //

        return (Integer.valueOf(n1))+Integer.valueOf(n2);  //надо бы пробел добавить

      //  return Integer.valueOf(n1).toString(); //

    }


    public static void main(String[] args) {



        addAsStrings(1, 2);
        addAsStrings(9283,6574);
    }
}
