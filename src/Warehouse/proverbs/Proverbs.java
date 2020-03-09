package Warehouse.proverbs;

//пока с числами только
//пословицы )
//растет, легко добавляется все...но нужна небольшая оптимизация при редактировании
// TODO: 10.02.2020 намудрил...прежде чем мудрить надо копию оригинала сохранять...или откатывать

//System.out.println(str); заместо этого вызывать метод где и будет очищать строчку
/*
При добавление case  изменять значение b
//не удобно каждый  раз добавлять значение b 
// TODO: 02.03.2020 переписать , через коллекцию сделать
рандом не нравится, надо бы другое решение, через секундомер?

 * */
public class Proverbs {

    private static int verse;
    private static String str = "";

    private static int a = 1; // Начальное значение диапазона - "от" 
    private static int b = 24; // Конечное значение диапазона - "до"
    private static int random_number1 = a + (int) (Math.random() * b); // Генерация

    static void text() {
        //System.out.println("\r" + str + "\r");   // TODO: 09.02.2020 сюда воткнуть сетРандом?для вывода информации об кэйсе, r не очищает...
        System.out.print(str);
        System.out.print("\u001B[33m" + " ☻" + "\u001B[0m");
        setRandom_number1(); //указывает кейс
    }

    static void hello() {
        System.out.println("Пословицы: " + a + " - " + b);  // Пословицы + a + " b "  - т.е будет менятся значение b и показывать потом
    }

    static void setRandom_number1() {
        System.out.println("(" + random_number1 + ")");
    }

    public static void main(String[] args) throws InterruptedException {

        hello();
        verse = random_number1;
        //verse = 1;

      /*  System.out.println("Следующая начнется через пару секунд");  //может быть, когда нибудь
        Thread.sleep(500);*/
        //  for (int i = 0; i < 10; i++, verse++) {  //воткнул цикл //версия прибавляется //по длине кейсеов надо бы

        //   Thread.sleep(1000);
        switch (verse) {
            case 1:
                str = "Хочешь сделать работу - сначала наточи инструменты." + "\n" +
                        "Прежде чем начать работу – наточи инструмент.";
                //   System.out.println(str);
                //  str = "Прежде чем начать работу – наточи инструмент.";
                //  System.out.println(str);
                text();
                break;
            case 2:
                str = "Дорогу осилит идущий.";
                //  System.out.println(str);
                text();
                break;
            case 3:
                str = "Подальше положишь, поближе возьмешь.";
                // System.out.println(str);
                text();
                break;
            case 4:
                str = "empty";          //   <<<----------------------------------------------------------------------
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
                str = "Путь в тысячу миль начинается с одного шага.";
                text();
                break;
            case 10:
                str = "На своих ошибках учатся, на чужих — делают карьеру.";
                text();
                break;
            case 11:
                str = "Терпение и труд всё перетрут.";
                text();
                break;
            case 12:
                str = "Бесплатный сыр бывает только в мышеловке.";
                text();
                break;
            case 13:
                str = "Главное – не победа, а участие.";
                text();
                break;
            case 14:
                str = "Тяжело в учении, легко в бою.";
                text();
                break;
            case 15:
                str = "Тише едешь, дальше будешь.";
                text();
                break;
            case 16:
                str = "Не все то золото, что блестит.";
                text();
                break;
            case 17:
                str = "Собирай по ягодке – наберешь кузовок.";
                text();
                break;
            case 18:
                str = "Повторение - мать учения.";
                text();
                break;
            case 19:
                str = "Всему свое время.";
                text();
                break;
            case 20:
                str = "Делу время, потехи час.";
                text();
                break;
            case 21:
                str = "Человек, ни разу в своей жизни не достигнувший малых побед, никогда не добьется большой победы.";
                text();
                break;
            case 22:
                str = "Выполняя задание, каждый раз старайся превзойти свой предыдущий результат, и вскоре ты превзойдешь всех окружающих.";
                text();
                break;
            case 23:
                str = "Вода камень точит.";
                text();
                break;
                case 24:
                str = "Без труда не вытянешь и рыбку из пруда.";
                text();
                break;
            default:
                System.out.println("error");
                break;  //добавил а то в цикле одно и тоже //все равно одно и тоже
        }
    }
}

