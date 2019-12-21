package ru.progwards.T4;

public class LogicalOperatorsCompare {
    public static void main(String[] args) {
        System.out.println("Результат 2*2 == 5: " + (2*2==5)+ ";");
        System.out.println("Результат 2*2 > 3: " + (2*2 > 3)+ ";");
        System.out.println("Реузльтат 0 !=1: " + (0 !=1) + ";");

        System.out.println("Результат 2*2 == 5 && 2*2 > 3: " + (2*2== 5 && 2*2>3) + ";");
        System.out.println("Результат 2*2 == 5 || 2*2 > 3: "+ (2*2 == 5 || 2*2>3)+ ";");
        System.out.println("Результат !(0 !=1):" + !(0 !=1) + ";");
    }
}
