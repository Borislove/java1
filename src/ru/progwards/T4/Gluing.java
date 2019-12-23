package ru.progwards.T4;

//склеивание двух чисел
public class Gluing {

    static int a;
    static int b;

    static int addAsStrings(int n1, int n2) {
        String str = ((n1) + "" +(n2));
        Integer ci = Integer.valueOf(str);
return ci;
     }
    public static void main(String[] args) {
addAsStrings(2,3);
        System.out.println(addAsStrings(2,3));
    }
}


// TODO: 23.12.2019  Первое решение...
/*
static int addAsStrings(int n1, int n2) {
        
        
         Integer numb = Integer.valueOf(n1);
         Integer numb2 = Integer.valueOf(n2);

    String a = numb.toString();
    String b = numb2.toString();
    //String c = numb +""+ numb2;
    
    String c = numb.toString() + numb2.toString();
    //System.out.println(c);
    
    
    Integer ci = Integer.valueOf(c);
    
    String str = (n1) + "" +(n2);    //простой вариант!!! да уж
        System.out.println("str=" + str);
        System.out.println((n1+"" +n2));
                return ci;
                
                //return (n1+""+n2);
    }
    public static void main(String[] args) {
         
        addAsStrings(123, 4567);
        addAsStrings(9283,6574);
    }
}

* */