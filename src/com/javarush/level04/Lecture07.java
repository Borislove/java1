package com.javarush.level04;

public class Lecture07 {

    /*	Два данных выражения эквивалентны. Значение переменой типа boolean по умолчанию false («ложь»).*/
    boolean m;
    // boolean m = false;
//----------------------------------------

    public boolean isALessThanB(int a, int b) {
        if (a < b)
            return true;
        else
            return false;
    }

    //------------------------------------------
    public boolean isALessThanB1(int a, int b) {
        boolean m = (a < b);
        if (m)
            return true;
        else
            return false;
    }

    //------------------------------------------
    public boolean isALessThanB2(int a, int b) {
        boolean m = (a < b);
        return m;
    }

    // компактная запись
    public boolean isALessThanB3(int a, int b) {
        return a < b;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        if (a > b) {
            System.out.println(a);
        }

        /*В переменную m будет записан результат сравнения – true или false.
         Условие выполняется, если переданное в него выражение истинно – true.*/
        boolean m = (a > b);
        if (m)
            System.out.println(a);

        /*Не нужно сравнивать логическую переменную (типа boolean) c true или false.
         Результат сравнения сам будет иметь тип boolean, и в точности будет совпадать
         со значением сравниваемой переменой: true == true – истина. Результат выражения – true.
         true == false – ложь. Результат сравнения – false.*/
        boolean m1 = (a > b);
        if (m1 == true)
            System.out.println(a);

        Lecture07 lecture07 = new Lecture07();
        System.out.println(lecture07.isALessThanB3(2, 3));
    }
}
