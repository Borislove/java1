package ru.progwards.java1_2.lessons.abstractnum;

public class DoubleNumber extends Number {

    private double value;

    /*3.1 конструктор
    public DoubleNumber(double num), который будет сохранять в классе значение числа double.*/
    public DoubleNumber(double num) {
        value = num;
    }

    /*3.2 переопределение метода
    public Number mul(Number num), который будет возвращать произведение содержимого класса на num. */
    @Override
    public Number mul(Number num) {
        return new DoubleNumber(value * ((DoubleNumber) num).value);
        //return null;
    }

    /*3.3 переопределение метода
    public Number div(Number num), который будет возвращать частное от деления содержимого класса на num. */
    @Override
    public Number div(Number num) {
        return new DoubleNumber(value / ((DoubleNumber) num).value);
        //return null;
    }

    /*3.4 переопределение метода
    public Number newNumber(String strNum), который будет возвращать новый экземпляр класса DoubleNumber
    со значением параметра strNum, содержащим число типа double, например 3.14. Надо будет правильно
    распарсить строку и привести значение к числу с плавающей точкой.*/
    @Override
    public Number newNumber(String strNum) {
        return new DoubleNumber(Double.parseDouble(strNum));
        //return null;
    }

    /*3.5 public String toString() - привести значение числа к строке*/
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
