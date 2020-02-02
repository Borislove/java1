package Warehouse.sleep;

//вот это код!
public class Happy_1 {


    public static final String ANSI_RESET = "\u001B[0m";
    //  public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public static void sleepSLEEP() throws InterruptedException {
        Thread.sleep(300);
    }

    public static void main(String[] args) throws InterruptedException {

        //        long start = System.currentTimeMillis();
        System.out.print(ANSI_BLUE + "С ");
        sleepSLEEP();
        System.out.print(ANSI_PURPLE + "Наступающим");
        sleepSLEEP();
        System.out.print(ANSI_CYAN + " Новым");
        sleepSLEEP();
        System.out.print(ANSI_GREEN + " *2020*");
        sleepSLEEP();
        System.out.println(ANSI_RED + " годом!" + ANSI_RESET);

        System.out.println("----------------------------------");

        sleepSLEEP();
        System.out.println(ANSI_GREEN + "P");
        sleepSLEEP();
        System.out.println(ANSI_WHITE + "R");
        sleepSLEEP();
        System.out.println(ANSI_PURPLE + "O");
        sleepSLEEP();
        System.out.println(ANSI_BLUE + "G");
        sleepSLEEP();
        System.out.println(ANSI_YELLOW + "W");
        sleepSLEEP();
        System.out.println(ANSI_RED + "A");
        sleepSLEEP();
        System.out.println(ANSI_CYAN + "R");
        sleepSLEEP();
        System.out.println(ANSI_PURPLE + "D");
        sleepSLEEP();
        System.out.println(ANSI_GREEN + "S");
        sleepSLEEP();
    }
}


