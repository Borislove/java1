package ru.progwards.java1.lessons.classes;


// z это комплексное число, a действительная часть, b мнимая часть, i обозначение мнимой части.

// i = -1 //если в квадрате
// ~

// комплексное число записывается как z = a + bi,

public class ComplexNum {

    public static int a;
    public static int b;

    public static int d;
    public static int c;

    public static int z;
    public static int i = -1 ;


//который инициализирует комплексное число
    public ComplexNum(int a, int b) {
    }

    // приведение к строке, выдать в формате a+bi, например, при a=1 и b=56 должно быть выдано 1+56i
    public String toString(){
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
    this.i = i;

    return (a+"+"+b*i+"i");
    }

// сложение комплексных чисел по формуле:
  //          (a + bi) + (c + di) = (a + c) + (b + d)i
    public ComplexNum add(ComplexNum num) {
              z = 2;
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

    }
}
