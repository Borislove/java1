package ru.progwards.java1.lessons.classes;


// z это комплексное число, a действительная часть, b мнимая часть, i обозначение мнимой части.

// i = -1 //если в квадрате
// ~
// комплексное число записывается как z = a + bi,
public class ComplexNum {

    public static int a;
    public static int b;

    //public static int c;
    //public static int d;

//    public static int z;

    public static int i ;

    public static int num;
    public static int num1 ;
    public static int num2;


        public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String toString(){
            return a+"+"+b+"i";
        }

    public ComplexNum add(ComplexNum num) {

      //  return num.add(num).add(num.add(num));
        return null;
    }


    public ComplexNum sub(ComplexNum num){
        return null;
    }

    public ComplexNum mul(ComplexNum num){
        return null;
    }

    public ComplexNum div(ComplexNum num){
        return null;
    }

    public static void main(String[] args) {
        //Ожидалось: 100+100i
        ComplexNum num1 = new ComplexNum(1,1);
        ComplexNum num2 = new ComplexNum(99,99);

         // add(ComplexNum num1 , ComplexNum num2)
        ////  ERROR: Тест "Метод add(ComplexNum num1, ComplexNum num2)" не пройден.
        //  Метод add(ComplexNum num) возвращает экземпляр класса с неверным значением toString(). Переданы параметры: num1 = new ComplexNum(1, 1), num2 = new ComplexNum(99, 99). Возвращено: 0+0i. Ожидалось: 100+100i
       // ERROR: Тест "Метод sub(ComplexNum num1, ComplexNum num2)" не пройден. Метод sub(ComplexNum num) возвращает экземпляр класса с неверным значением toString(). Переданы параметры: num1 = new ComplexNum(99, 99), num2 = new ComplexNum(1, 1). Возвращено: 0+0i. Ожидалось: 98+98i
        //ERROR: Тест "Метод mul(ComplexNum num1, ComplexNum num2)" не пройден. Метод mul(ComplexNum num) возвращает экземпляр класса с неверным значением toString(). Переданы параметры: num1 = new ComplexNum(1, 1), num2 = new ComplexNum(99, 99). Возвращено: 0+0i. Ожидалось: 0+198i
        //ERROR: Тест "Метод div(ComplexNum num1, ComplexNum num2)" не пройден. Метод div(ComplexNum num) возвращает экземпляр класса с неверным значением toString(). Переданы параметры: num1 = new ComplexNum(1000, 1000), num2 = new ComplexNum(100, 100). Возвращено: 0+0i. Ожидалось: 10+0i

    }
}


/*Задача 3. Класс ComplexNum
Реализовать класс ComplexNum, реализующий операции в комплексных числах. Напоминаем, что комплексное число записывается как z = a + bi, где z это комплексное число, a действительная часть, b мнимая часть, i обозначение мнимой части.
a и b реализуем целыми числами

3.1 конструктор
public ComplexNum(int a, int b), который инициализирует комплексное число

3.2 метод
public String toString(), приведение к строке, выдать в формате a+bi, например, при a=1 и b=56 должно быть выдано 1+56i

3.3 метод
public ComplexNum add(ComplexNum num), сложение комплексных чисел по формуле:
(a + bi) + (c + di) = (a + c) + (b + d)i

3.4 метод
public ComplexNum sub(ComplexNum num), вычитание комплексных чисел по формуле:
(a + bi) - (c + di) = (a - c) + (b - d)i

3.5 метод
public ComplexNum mul(ComplexNum num), умножение комплексных чисел по формуле:
(a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i

3.5 метод
public ComplexNum div(ComplexNum num), деление комплексных чисел по формуле:
(a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d))i*/