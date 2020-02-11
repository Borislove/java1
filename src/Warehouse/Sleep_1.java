package Warehouse;
//добавить цвет, + рандомность

class Sleep_1 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static int i = 0;

    public static void main(String[] args) throws InterruptedException {

        //   long start = System.currentTimeMillis();
        while (true) {
            Thread.sleep(100);
            ;
            System.out.println(ANSI_RESET + "Tick Tock " + ANSI_RED + i);
            Thread.sleep(300);
            System.out.print(ANSI_BLUE + "П");
            Thread.sleep(300);
            System.out.print(ANSI_GREEN + "Р");
            Thread.sleep(300);
            System.out.print(ANSI_PURPLE + "И");
            Thread.sleep(300);
            System.out.print(ANSI_WHITE + "В");
            Thread.sleep(300);
            System.out.print(ANSI_YELLOW + "Е");
            Thread.sleep(300);
            System.out.print(ANSI_CYAN + "Т");
            Thread.sleep(300);
            System.out.print(ANSI_RED + "!");
            i++;

            if (i == 11) {
                System.out.println(ANSI_RED + "ERROR");
                break;
            }
        }
    }
}