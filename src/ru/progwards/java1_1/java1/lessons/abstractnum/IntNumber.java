package ru.progwards.java1_1.java1.lessons.abstractnum;

public class IntNumber extends Number {

    private int value ;

    /*2.1 конструктор
    public IntNumber(int num), который будет сохранять в классе значение целого числа.*/
    public IntNumber(int num) {
        this.value = num;
    }

    /*2.2 переопределение метода
    public Number mul(Number num), который будет возвращать произведение содержимого класса на num. */
    @Override
    public Number mul(Number num) {
        return new IntNumber(value * ((IntNumber) num).value);
    }

    /*2.3 переопределение метода
    public Number div(Number num), который будет возвращать частное от деления содержимого класса на num. */
    @Override
    public Number div(Number num) {
        return new IntNumber(value / ((IntNumber) num).value);
    }

    /*2.4 переопределение метода
    public Number newNumber(String strNum), который будет возвращать новый экземпляр класса IntNumber
    со значением параметра strNum, содержащим целое число,, например 4 или 3. Надо будет правильно
    распарсить строку и привести значение к целому типу.*/
    @Override
    public Number newNumber(String strNum) {
        return new IntNumber(Integer.parseInt(strNum));
    }

    /*2.5 public String toString() - привести значение числа к строке*/
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
