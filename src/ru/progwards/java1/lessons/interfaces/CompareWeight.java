package ru.progwards.java1.lessons.interfaces;

public interface CompareWeight {

    ///3.2 В нем создать public enum CompareResult, со значениями LESS, EQUAL, GREATER
    enum CompareResult {LESS, EQUAL, GREATER, NULL}

    /* 3.3 Интерфейс должен содержать метод public CompareResult compareWeight(CompareWeight smthHasWeigt)*/
    public CompareResult compareWeight(CompareWeight smthHasWeigt);
}

