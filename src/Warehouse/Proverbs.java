package Warehouse;

// TODO: 01.02.2020 сразу срабатывает сканнер, переместил в мейн
//пока с числами только
//пословицы )
public class Proverbs {

    private static int verse = 7;
    private static String str = "";

    // static int ver = new java.util.Scanner(System.in).nextInt();
    // static int a = Integer.valueOf(ver);
    static void text() {
        System.out.println(str);
    }

    static void hello() {
        System.out.println("Пословицы: 1-8 ");
    }

    public static void main(String[] args) {

        hello();

        int ver = new java.util.Scanner(System.in).nextInt();
        int a = Integer.valueOf(ver);

        switch (a) {
            case 1:
                str = "Хочешь сделать работу - сначала наточи инструменты.";
                System.out.println(str);
                str = "Прежде чем начать работу – наточи инструмент.";
                System.out.println(str);
                break;
            case 2:
                str = "Дорогу осилит идущий.";
                System.out.println(str);
                break;
            case 3:
                str = "Подальше положишь, поближе возьмешь.";
                System.out.println(str);
                break;
            case 4:
                str = "test";
                text();
                break;
            case 5:
                str = "Век живи - век учись.";
                text();
                break;
            case 6:
                str = "Первый блин - комом.";
                text();
                break;
            case 7:
                str = "Быстро только кошки родятся.";
                text();
                break;
            case 8:
                str = "Маленькими шагами к большой цели.";
                text();
                break;

            default:
                System.out.println("error");

        }

    }
}
