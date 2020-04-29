package ru.progwards.java1.lessons.interfaces;

//3.1 Создать интерфейс CompareWeight
interface CompareWeight {

    double weight = 0d;

    /*CompareResult less = CompareResult.LESS;
    CompareResult equal = CompareResult.EQUAL;
    CompareResult greater = CompareResult.GREATER;
*/


    //3.2 В нем создать public enum CompareResult, со значениями LESS, EQUAL, GREATER
    public enum CompareResult {
        LESS,   //меньше
        EQUAL,   //равно
        GREATER   //повышение
        ;
    }

    /* 3.3 Интерфейс должен содержать метод public CompareResult compareWeight(CompareWeight smthHasWeigt)*/

    public CompareResult compareWeight(CompareWeight smthHasWeigt);
}

