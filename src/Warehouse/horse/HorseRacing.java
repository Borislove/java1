package Warehouse.horse;


import java.util.Random;

//скачки) может быть напишутся...
//выводить победителя...видимо надо идентификатор скорости привязывать к каждой
//выводить лидера...
//пока с циклами не то творится
public class HorseRacing {

    private static String horse1 = "'Снежинка'";
    private static String horse2 = "'Молния'";
    private static String horse3 = "'Буря'";
    private static String horse4 = "'Шторм'";
    private static String horse5 = "'Вихрь'";
    private static String horse6 = "'Счастливчик'";

    private static String horse = "Имя Лошадки: ";
    private static String speed = "скорость: ";

    private static int distance = 100;

    private static int n1 = 0;

    static int a = 1; // Начальное значение диапазона - "от"
    static int b = 30; // Конечное значение диапазона - "до"

    //магия не трогать!
    public static int random() {
        int random = a + (int) (Math.random() * b);
        return random;
    }

    public static void main(String[] args) throws InterruptedException {

     /*   int random = a + (int) (Math.random() * b);
        System.out.println(random);*/

     /*   System.out.println(horse + horse1 + " " + speed + " " + n1);
        System.out.println(horse + horse2 + " " + speed + " " + n1);
        System.out.println(horse + horse3 + " " + speed + " " + n1);
        System.out.println(horse + horse4 + " " + speed + " " + n1);
        System.out.println(horse + horse5 + " " + speed + " " + n1);
        System.out.println(horse + horse6 + " " + speed + " " + n1);
        System.out.println("--------------------------------");
        System.out.println("Дистанция " + distance);


        System.out.println("------------------------------");

        System.out.println(horse + horse1 + " " + speed + " " + (n1 + random));
        System.out.println(horse + horse2 + " " + speed + " " + (n1 + random()));
        System.out.println(horse + horse3 + " " + speed + " " + n1 + random);
        System.out.println(horse + horse4 + " " + speed + " " + n1 + random);
        System.out.println(horse + horse5 + " " + speed + " " + n1 + random);
        System.out.println(horse + horse6 + " " + speed + " " + n1 + random);
        System.out.println("--------------------------------");


        System.out.println("Рандомный метод");
        System.out.println(horse + horse1 + " " + speed + " " + (n1 + random()));
        System.out.println(horse + horse2 + " " + speed + " " + (n1 + random()));
        System.out.println(horse + horse3 + " " + speed + " " + (n1 + random()));
        System.out.println(horse + horse4 + " " + speed + " " + (n1 + random()));
        System.out.println(horse + horse5 + " " + speed + " " + (n1 + random()));
        System.out.println(horse + horse6 + " " + speed + " " + (n1 + random()));*/

        while (true) {
            Thread.sleep(1000);
            System.out.println(horse + horse1 + " " + speed + " " + (n1 + random())); //через строку

            System.out.println(horse + horse2 + " " + speed + " " + (n1 + random()));

            System.out.println(horse + horse3 + " " + speed + " " + (n1 + random()));

            System.out.println(horse + horse4 + " " + speed + " " + (n1 + random()));

            System.out.println(horse + horse5 + " " + speed + " " + (n1 + random()));

            System.out.println(horse + horse6 + " " + speed + " " + (n1 + random()));

            System.out.println("--------------------------------------------------");

            n1 += random();

           /* if (n1 >= 100 && n1 <= 110) {    //не сработало // т.е все должны пробегать чтоли..
                System.out.println("Добегалась " + horse); //а какая?
                break;
            }*/
        }
    }
}



