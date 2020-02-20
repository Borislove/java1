package Warehouse.utils;

//
public class Color {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {

        Character a = '?';
        a.hashCode();
        System.out.println(a.hashCode());

        String ac = "\u001B[32m" + a;
        System.out.println(ac);

        System.out.println(ac.hashCode());

        // Character test = (Character)ac ;  а может и нельзя? чар есть чар...и занимает другие байты поэтому не ложится с цветом

        //--------------------------------------
        System.out.println(ANSI_BLACK + "ANSI_BLACK");
        System.out.println(ANSI_RED + "ANSI_RED");
        System.out.println(ANSI_GREEN + "ANSI_GREEN");
        System.out.println(ANSI_YELLOW + "ANSI_YELLOW");
        System.out.println(ANSI_BLUE + "ANSI_BLUE");
        System.out.println(ANSI_PURPLE + "ANSI_PURPLE");
        System.out.println(ANSI_CYAN + "ANSI_CYAN");
        System.out.println(ANSI_WHITE + "ANSI_WHITE");
    }
}


//а как char сделать цветным?