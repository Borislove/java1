package Warehouse;

//пока с числами только
//пословицы )
//растет, легко добавляется все...но нужна небольшая оптимизация при редактировании
// TODO: 08.02.2020 менять значение в hello(), менять знчение в b, добавлять новый кейс

/*
 * вынести в класс переменные, сделать статичными, начну мудрить все слетит
 * */
public class Proverbs {

    private static int verse;
    private static String str = "";

    private static int a = 1; // Начальное значение диапазона - "от"
    private static int b = 14; // Конечное значение диапазона - "до"

    static void text() {
        System.out.println(str);
    }

    static void hello() {
        System.out.println("Пословицы: " + a + " - " + b);  // Пословицы + a + " b "  - т.е будет менятся значение b и показывать потом
    }

    public static void main(String[] args) throws InterruptedException {
        int random_number1 = a + (int) (Math.random() * b); // Генерация
        hello();
        verse = random_number1;
      /*  System.out.println("Следующая начнется через пару секунд");  //может быть, когда нибудь
        Thread.sleep(500);*/
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
            case 12:
                str = "Бесплатный сыр бывает только в мышеловке";
                text();
                break;
            case 13:
                str = "Главное – не победа, а участие";
                text();
                break;
            case 14:
                str = "тяжело в учении, легко в бою\n";
                text();
                break;
            default:
                System.out.println("error");
        }
    }
}
