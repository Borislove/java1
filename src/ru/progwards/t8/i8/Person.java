package ru.progwards.t8.i8;

/*Создайте класс Person, а внутри него 2 класса

вложенный класс Child1
внутренний класс Child2
У каждого класса, Child1 и Child2 создайте метод String hello()

У Child1 String hello() должен вернуть "привет"
У Child2 String hello() должен вернуть "servus"*/

public class Person {
    public void setChild1(Person child1) {
        Child1 = child1;
    }

    public void setChild2(Person child2) {
        Child2 = child2;
    }

    Person Child1;
    Person Child2;

    class Child1 {

        public String hello() {
            getClass();
            return "привет";
        }
    }

    class Child2 {

        public String hello() {
            getClass();
            return "servus";
        }
    }
}


