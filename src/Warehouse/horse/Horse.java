package Warehouse.horse;

//эксперименты...
public class Horse {

    private static String name = "Розовый пони";
    private static int speed = 0;
    private static int distance = 100;

    private static int time ;

    private static void speedUp() {
        speed++;
    }

    private static void distance() throws InterruptedException {
        //Thread.sleep(300); //тормозит весь процесс
        distance--;
    }

    private static void time(){
        time = 1000; //1000 секунд
        time = distance/speed; //и в чем время измеряется то?
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
            speedUp();
            distance();
            time();
            System.out.print("время "+time+" расстояние " + distance + " скорость:" + speed + "\r");

            //через свитч попробовать?
            if (speed == 30) {
                name = "\u001B[32m" + name;
                System.out.println(name);
                continue;
            }
            if (speed == 50) {  //не пашет
                name = "\u001B[36m" + name;
            }
        }
    }
}

