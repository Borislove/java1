package Warehouse.sleep;

public class Happy {

    public static final String ANSI_RESET = "\u001B[0m";
    //  public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();

        System.out.print(ANSI_BLUE + "С ");
        Thread.sleep(300);
        System.out.print(ANSI_PURPLE + "Наступающим");
        Thread.sleep(300);
        System.out.print(ANSI_CYAN + " Новым");
        Thread.sleep(300);
        System.out.print(ANSI_GREEN + " *2020*");
        Thread.sleep(300);
        System.out.println(ANSI_RED + " годом!"+ANSI_RESET);

        System.out.println("----------------------------------");

    Thread.sleep(300);
    System.out.println(ANSI_GREEN + "P");
    Thread.sleep(300);
    System.out.println(ANSI_WHITE + "R");
    Thread.sleep(300);
    System.out.println(ANSI_PURPLE + "O");
    Thread.sleep(300);
    System.out.println(ANSI_BLUE + "G");
    Thread.sleep(300);
    System.out.println(ANSI_YELLOW + "W");
    Thread.sleep(300);
    System.out.println(ANSI_RED + "A");
    Thread.sleep(300);
    System.out.println(ANSI_CYAN + "R");
    Thread.sleep(300);
    System.out.println(ANSI_PURPLE + "D");
    Thread.sleep(300);
    System.out.println(ANSI_GREEN + "S");
    Thread.sleep(300);
    }
}


