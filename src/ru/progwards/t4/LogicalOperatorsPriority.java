package ru.progwards.t4;

public class LogicalOperatorsPriority {
    public static void main(String[] args) {
        boolean result1 = false || false && true || true;
        boolean result2 = false || (false && true) || true;
        boolean result3 = (false || false) && (true || true);

        boolean result4 = !true && false;
        boolean result5 = (!true) && false;
        boolean result6 = !(true && false);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println();
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }
}
