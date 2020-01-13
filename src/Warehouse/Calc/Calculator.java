package Warehouse.Calc;


/*Создайте класс Calculator, содержащий

приватную переменную int result;
конструктор по умолчанию, устанавливающий result = 0;
публичную функцию set(int num), устанавливающую значение result равный num
публичную функцию add(int num), увеличивающую result на num
публичную функцию sub(int num), уменьшающую result на num
публичную функцию int getResult()*/



public class Calculator {

    private int result;


    Calculator calculator = new Calculator();

    Calculator() {
    result=0;
    }

    public void set(int num) {
    result = num;
    }

    public void add(int num) {
    result = result + num;
        }

    public void sub (int num) {
    result = result - num;
        }

    public int getResult(){

        return result;
    }


}

