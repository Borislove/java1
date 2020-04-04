package com.javarush.task.task03.task0307;

/*Создать 5 зергов, 3 протосса и 4 террана.
Дать им всем уникальные имена.

Требования:
•	Нельзя изменять классы Zerg, Protoss и Terran.
•	Нужно создать 5 объектов типа Zerg и каждому из них дать свое имя.
•	Нужно создать 3 объекта типа Protoss и каждому из них дать свое имя.
•	Нужно создать 4 объекта типа Terran и каждому из них дать свое имя.*/


/*
Привет StarCraft!
*/

public class Solution {

    public static void main(String[] args) {

        Zerg z1 = new Zerg();
        z1.name = "zerg1";
        Zerg z2 = new Zerg();
        z2.name = "zerg2";
        Zerg z3 = new Zerg();
        z3.name = "zerg3";
        Zerg z4 = new Zerg();
        z4.name = "zerg4";
        Zerg z5 = new Zerg();
        z5.name = "zerg5";

        Protoss p1 = new Protoss();
        p1.name = "protos1";
        Protoss p2 = new Protoss();
        p2.name = "protos2";
        Protoss p3 = new Protoss();
        p3.name = "protos3";

        Terran t = new Terran();
        t.name = "ter";
        Terran t1 = new Terran();
        t1.name = "ter1";
        Terran t2 = new Terran();
        t2.name = "ter2";
        Terran t3 = new Terran();
        t3.name = "ter3";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
