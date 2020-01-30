package Warehouse.sleep;


//добавить рандомные цвета
//изменять регистр
public class Sleep_2 {

    //--------------------цвета---------------------------
  /*  public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
*/

    public static String a;

    public static void main(String[] args) throws InterruptedException {

        //    final Random random = new Random(System.nanoTime());

        //Random random = new Random();

        long start = System.currentTimeMillis();


        String[] str = {"С", " Н", "О", "В", "Ы", "М", " 2", "0", "2", "0", " Г", "о", "д", "о", "м", "!"};

        String[] color = {"\u001B[0m", "\u001B[30m", "\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m",
                "\u001B[36m", "\u001B[37m"};

/*
        for(int i = 0; i <color.length;i++) {
            String a = color[i];

        }
//не додумался
        for (int i =0, c =0; i < str.length  || c < color.length  ; i++ ,c++) {
            Thread.sleep(300);
            System.out.print(str[i]+color[c]);
        }*/

        for (int i = 0; i < str.length; i++) {
            Thread.sleep(300);
            System.out.print(str[i]);

        }
    }
}
