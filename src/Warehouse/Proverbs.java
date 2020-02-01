package Warehouse;


//пословицы )
public class Proverbs {

    private static int verse = 1;
    private static String str = "";

    public static void main(String[] args) {

        switch (verse) {
            case 1:
                str = "Хочешь сделать работу - сначала наточи инструменты";
                System.out.println(str);
                str = "Прежде чем начать работу – наточи инструмент";
                System.out.println(str);
                break;
            case 2:
                str = "Дорогу осилит идущий";
                break;
        }

    }
}
