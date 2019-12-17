package ru.progwards.java1.lessons.compare_if_cycles;

/*
* Задача 2. Класс TriangleInfo
2.1 Реализовать функцию
public static boolean isTriangle(int a, int b, int c), которая возвращает true, если по данным трём сторонам (a, b, c) можно построить треугольник.
*  Из геометрии известно, что в треугольнике длина каждой из сторон меньше суммы длин двух других сторон.
2.2 Реализовать функцию
public static boolean isRightTriangle(int a, int b, int c), которая возвращает true, если треугольник со сторонами a, b, c является прямоугольным.
*  Из геометрии известно, что для прямоугольного треугольника выполняется теорема Пифагора (сумма квадратов катетов равна квадрату гипотенузы).
2.3 Реализовать функцию
public static boolean isIsoscelesTriangle(int a, int b, int c), которая возвращает true, если треугольник со сторонами a, b, c является равнобедренным.
*  Из геометрии известно, что в равнобедренном треугольнике есть две равные стороны.
* */


public class TriangleInfo {

     static int a,b,c;

    public static boolean isTriangle(int a, int b, int c) {

        // TODO: 17.12.2019 С ЭТИМ методом что то не так

        if (a+b>=c & a>0 &b>0 &c>0){
             //|| a+c>=b & a>0 &b>0 &c>0|| b+c>=a & a>0 &b>0 &c>0) {

                        System.out.println("Можно построить треугольник " +"длина A = "+ a +" длина B =  "+b+" длина C = "+c);
            return true;

        } else {
            System.out.println("ТрЭугольника нельзя построить!!!а какой?" + a +""+b+""+c);
            return false;
        }

    }

    public static boolean isRightTriangle(int a, int b, int c) {

        //int e = 2; //квадрат
        //c = Math.pow(c,2);
       // System.out.println("c^2 = a^2 + b^2  " + (Math.pow(c,2))  == (Math.pow(a,2)+ (Math.pow(b,2))));
        // TODO: 17.12.2019 тест квадратов  , незнаю
//        System.out.println(" a^2 = " + Math.pow(a,e));
//        System.out.println(" b^2 = " + Math.pow(b,e));
//        System.out.println(" c^2 = " + Math.pow(c,e));


    //квадраты
        a = a * a;
        b = b * b;
        c = c * c;

        if (a == b+c  || b ==a+c || c ==a+b )  {
            System.out.println("опа истина! треугольник прямоугольный! А какой? = "   );
        return true;

        } else {
            return false;
        }
    }

    public static boolean  isIsoscelesTriangle(int a,int b,int c) {
        //Из геометрии известно, что в равнобедренном треугольнике есть две равные стороны.
        //значит что то должно быть равно...логично

if (a==b || b==c || a==c) {
        System.out.println("Какойто из треугольничков равнобедренный ММмм, а какой?"+" длина A = "+ a +" длина B =  "+b+" длина C = "+c);
        return true;

}       else {
    System.out.println("Ошибко!");
        return false;
}
    }



    public static void main(String[] args) {

        isTriangle(1,2,3);
        isTriangle(-3,2,-2);
        isRightTriangle(1,2,3);
        isRightTriangle(3,4,5); // сработало Оо
        isRightTriangle(6,8,10);

        isIsoscelesTriangle(2,2,3);
        isIsoscelesTriangle(2,3,2);
        isIsoscelesTriangle(3,2,2);
        isIsoscelesTriangle(1,2,5);  //ошибка


    }
}
