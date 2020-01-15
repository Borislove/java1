package ru.progwards.java1.lessons.abstractnum;

public class DoubleNumber extends Number {
    private double value;

    public DoubleNumber(double num){
        //value = (double)num;
        value = num;

    }

    @Override
    public Number mul(Number num){

         // return new DoubleNumber (value*((DoubleNumber)num).value );

        //return new DoubleNumber ( (double)num).value);   //не работает

        //return new DoubleNumber (( (double) num).value );  //не работает

    //    return new DoubleNumber (double)num.value;


        /*Можно вместо ((DoubleNumber)num).value написать (double)num.value.
        Тогда мы сможем в качестве параметра num принимать объект типа IntNumber,
        а вычисления проводить в действительных числах.*/

       return null;
    }

    @Override
    public Number div(Number num){
        return new DoubleNumber(value/((DoubleNumber)num).value);
        //return null;
    }

    @Override
    public Number newNumber(String strNum){
    return new DoubleNumber(Double.parseDouble(strNum));
        //return null;
    }

    @Override
    public String toString(){
        return String.valueOf(value);
    }

}


/*3. Реализовать класс DoubleNumber, который содержит
3.1 конструктор
public DoubleNumber(double num), который будет сохранять в классе значение числа double.
3.2 переопределение метода
public Number mul(Number num), который будет возвращать произведение содержимого класса на num.


3.3 переопределение метода
public Number div(Number num), который будет возвращать частное от деления содержимого класса на num.

3.4 переопределение метода


public Number newNumber(String strNum), который будет возвращать новый экземпляр класса DoubleNumber со значением параметра strNum,
 содержащим число типа double, например 3.14. Надо будет правильно распарсить строку и привести значение к числу с плавающей точкой.
3.5 public String toString() - привести значение числа к строке*/