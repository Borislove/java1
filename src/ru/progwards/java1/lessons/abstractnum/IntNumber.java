package ru.progwards.java1.lessons.abstractnum;

public class IntNumber {
    public IntNumber(int num){

    }
    //@Override
    public Number mul(Number num){
      return null;
    }
    //@Override
    public Number div(Number num){
        return null;
    }
    //@Override
    public Number newNumber(String strNum){
        return null;
    }

}



/*2. Реализовать класс IntNumber, который содержит
2.1 конструктор
public IntNumber(int num), который будет сохранять в классе значение целого числа.
2.2 переопределение метода

public Number mul(Number num), который будет возвращать произведение содержимого класса на num.
2.3 переопределение метода
public Number div(Number num), который будет возвращать частное от деления содержимого класса на num.
2.4 переопределение метода
public Number newNumber(String strNum), который будет возвращать новый экземпляр класса IntNumber со значением параметра strNum, содержащим целое число,, например 4 или 3. Надо будет правильно распарсить строку и привести значение к целому типу.
2.5 public String toString() - привести значение числа к строке*/