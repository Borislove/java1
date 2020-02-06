package Warehouse.horse;

//эксперименты...
//со временем беда, надо математику учить
//лошадь бежит и уже хорошо
//надо коллекции изучать)

/**
 * @author FreeCoder
 * Thu Feb 06  ~ 16:36:07 MSK 2020
 */
public class Horse {

    private static String name = "\u001B[35m" + "Розовый пони" + "\u001B[0m";
    private static int speed = 0;
    private static int distance = 100;

    //private static int time = 1000;
    private static int time;

    private static String resource[] = {"блошка", "цветок", "ветерок", "репейник"};  //блошка к скорости, репейник к тормозам XD
    private static String res = "";

    private static void resource() {
        for (String value : resource) {
            res = value;
            //   System.out.println(res);
        }
    }

    private static void speedUp() {
        speed++;
    }

    private static void distance() throws InterruptedException {
        //Thread.sleep(300); //тормозит весь процесс
        distance--;
    }

    private static void time() {
        // time = 1000; //1000 секунд
        //и в чем время измеряется то?
        //time--;
        time = distance / speed;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(name);
        /*System.out.println("скорость:" + speed + "\r");
        speedUp();
        speedUp();
        System.out.println("скорость:" + speed + "\r");
        speedUp();
        System.out.println("скорость:" + speed + "\r");*/

        while (true) {
            Thread.sleep(500);
            resource();
            speedUp();
            distance();
            time();
            System.out.print("время " + time + " расстояние " + distance + " скорость:" + speed + "\r");

            //через свитч попробовать?
            if (speed == 30) {
                name = "\u001B[32m" + name;
                System.out.println(name);
                continue;
            }
            if (speed >= 50) {  //не пашет
                name = "\u001B[36m" + name;
            }
            int field = distance;
            switch (field) {
                case 90:
                    System.out.println("\r" + "бежит через поле");
                    break;

                case 80:
                    System.out.println("бежит через лес");
                    break;

                case 70: //не сработал
                    System.out.println("скачет...");
                    break;
            }

            if (distance == 0) {
                System.out.println("Лошадка прибыла в загон!");
                System.out.println("собрано: " + res);
                break;
            }
        }
    }
}


