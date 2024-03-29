package ru.progwards.java1.lessons.classes;

/*Реализовать класс ComplexNum, реализующий операции в комплексных числах.
Напоминаем, что комплексное число записывается как z = a + bi, где z это комплексное число,
 a действительная часть, b мнимая часть, i обозначение мнимой части.
a и b реализуем целыми числами*/
public class ComplexNum {

    private int a;
    private int b;

    ////////////////////////////////////////////////////////////////////////////////
    /*3.1 конструктор
    public ComplexNum(int a, int b), который инициализирует комплексное число*/
    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }
    ////////////////////////////////////////////////////////////////////////////////

    /*3.3 метод
    public ComplexNum add(ComplexNum num), сложение комплексных чисел по формуле:
    (a + bi) + (c + di) = (a + c) + (b + d)i*/
    ////////////////////////////////////////////////////////////////////////////////
    public ComplexNum add(ComplexNum num) {
        return num;
    }

    ////////////////////////////////////////////////////////////////////////////////
    /*3.4 метод
    public ComplexNum sub(ComplexNum num), вычитание комплексных чисел по формуле:
    (a + bi) - (c + di) = (a - c) + (b - d)i*/
    public ComplexNum sub(ComplexNum num) {
        return num;
    }
    ////////////////////////////////////////////////////////////////////////////////

    /*3.5 метод
    public ComplexNum mul(ComplexNum num), умножение комплексных чисел по формуле:
    (a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i*/
    public ComplexNum mul(ComplexNum num) {
        return num;
    }
    ////////////////////////////////////////////////////////////////////////////////

    /*3.5 метод
    public ComplexNum div(ComplexNum num), деление комплексных чисел по формуле:
    (a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d))i*/
    public ComplexNum div(ComplexNum num) {
        return num;
    }
    ////////////////////////////////////////////////////////////////////////////////

    /*3.2 метод
    public String toString(), приведение к строке, выдать в формате a+bi, например,
     при a=1 и b=56 должно быть выдано 1+56i*/
    public String toString() {
        return a + " " + b;
    }
}
