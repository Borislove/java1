package com.javarush.task.task03.task0313;

/*Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".

Подсказка: их 6 штук.
Каждую комбинацию вывести с новой строки. Слова не разделять.

Пример:
МылаРамуМама
РамуМамаМыла
...

Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 6 строк.
•	Текст в каждой строке должен быть уникален.
•	Должны быть выведены все возможные комбинации.*/

/*
Мама мыла раму
*/

public class Solution {

    public static void main(String[] args) {

        String m = "Мама";
        String mi = "Мыла";
        String ram = "Раму";

        System.out.println(m + mi + ram);
        System.out.println(m + ram + mi);
        System.out.println(mi + ram + m);
        System.out.println(mi + m + ram);
        System.out.println(ram + m + mi);
        System.out.println(ram + mi + m);
    }
}

