package ru.progwards.java1.lessons.classes;


// z это комплексное число, a действительная часть, b мнимая часть, i обозначение мнимой части.

// i = -1 //если в квадрате
// ~

// комплексное число записывается как z = a + bi,



public class ComplexNum {

    public static int a;
    public static int b;

    public static int c;
    public static int d;

    public static int z;
    public static int i ;

    int num1;
    int num2;


//который инициализирует комплексное число
    public ComplexNum(int a, int b) {

        this.a = a;
        this.b = b;

    }

    // приведение к строке, выдать в формате a+bi, например, при a=1 и b=56 должно быть выдано 1+56i
    public String toString(){
            return a+"+"+b+"i";
        }

// сложение комплексных чисел по формуле:
  //          (a + bi) + (c + di) = (a + c) + (b + d)i
    public ComplexNum add(ComplexNum num) {
     /*   num1 = num;
        num2 = num;
        */


      //        System.out.println(z);

    return num;
    }

    //, вычитание комплексных чисел по формуле:
    //            (a + bi) - (c + di) = (a - c) + (b - d)i
    public ComplexNum sub(ComplexNum num){
        return num;
    }

// умножение комплексных чисел по формуле:
//            (a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i

    public ComplexNum mul(ComplexNum num){
        return num;
    }

// деление комплексных чисел по формуле:
//            (a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d))i

    public ComplexNum div(ComplexNum num){
        return num;
    }

    public static void main(String[] args) {



        //Ожидалось: 100+100i
        ComplexNum num1 = new ComplexNum(1,1);
        ComplexNum num2 = new ComplexNum(99,99);




         // add(ComplexNum num1 , ComplexNum num2)


        ////  ERROR: Тест "Метод add(ComplexNum num1, ComplexNum num2)" не пройден.
        //
        //  Метод add(ComplexNum num) возвращает экземпляр класса с неверным значением toString(). Переданы параметры: num1 = new ComplexNum(1, 1), num2 = new ComplexNum(99, 99). Возвращено: 0+0i. Ожидалось: 100+100i
       // ERROR: Тест "Метод sub(ComplexNum num1, ComplexNum num2)" не пройден. Метод sub(ComplexNum num) возвращает экземпляр класса с неверным значением toString(). Переданы параметры: num1 = new ComplexNum(99, 99), num2 = new ComplexNum(1, 1). Возвращено: 0+0i. Ожидалось: 98+98i
        //ERROR: Тест "Метод mul(ComplexNum num1, ComplexNum num2)" не пройден. Метод mul(ComplexNum num) возвращает экземпляр класса с неверным значением toString(). Переданы параметры: num1 = new ComplexNum(1, 1), num2 = new ComplexNum(99, 99). Возвращено: 0+0i. Ожидалось: 0+198i
        //ERROR: Тест "Метод div(ComplexNum num1, ComplexNum num2)" не пройден. Метод div(ComplexNum num) возвращает экземпляр класса с неверным значением toString(). Переданы параметры: num1 = new ComplexNum(1000, 1000), num2 = new ComplexNum(100, 100). Возвращено: 0+0i. Ожидалось: 10+0i

    }
}
