package Warehouse;

//пока с числами только
//пословицы )
// TODO: 08.02.2020 менять значение в hello(), менять знчение в b, добавлять новый кейс
public class Proverbs {

    private static int verse = 7;
    private static String str = "";

    // static int ver = new java.util.Scanner(System.in).nextInt();
    // static int a = Integer.valueOf(ver);
    static void text() {
        System.out.println(str);
    }

    static void hello() {
        System.out.println("Пословицы: 1-11 ");
    }

    public static void main(String[] args) throws InterruptedException {


        int a = 1; // Начальное значение диапазона - "от"
        int b = 11; // Конечное значение диапазона - "до"

        int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
        //   System.out.println("1-ое случайное число: " + random_number1);


        hello();
        // TODO: 07.02.2020 пока еррорки если текст ввел

        //  int ver = new java.util.Scanner(System.in).nextInt();
        verse = random_number1;
      /*  System.out.println("Следующая начнется через пару секунд");
        Thread.sleep(500);*/
        //int verse = Integer.valueOf(ver);


        // if ( verse >= Integer.valueOf(ver)) {  //

        // if( a !=new String) //фантазия )

        switch (verse) {
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
                str = "empty";
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
            case 9:
                str = "Путь в тысячу миль начинается с одного шага\n";
                text();
                break;
            case 10:
                str = "На своих ошибках учатся, на чужих — делают карьеру";
                text();
                break;
            case 11:
                str = "Терпение и труд всё перетрут";
                text();
                break;


            default:
                System.out.println("error");

        }
    }
}
