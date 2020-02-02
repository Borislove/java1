package Warehouse.speed_racing_2020.carspeed;

/*
 * расстояние S = V * T
 * скорость V = S / T
 * время T = S / V
 *
 * S - расстояние
 * V - скорость
 * T - время
 * */

// TODO: 31.01.2020  до Питера не прямой путь...куча городов , поселков, + объездные дороги + скоростной режим
//+ пробки и факторы (random) , остановки

// TODO: 30.01.2020 добавил дабл 

// TODO: 30.01.2020 нужен остаток..
public class Speed {

    static final int HOUR = 1;   //час
    public static int speed = 60;  //скорость
    public static int distance;  //расстояние или дистанция

    public static final int SAINT_PETERSBURG = 710;  //


    public static void main(String[] args) {

        distance = speed * HOUR;
        System.out.println("Автомобиль движется со скоростью: " + distance + " km/h");

        System.out.println("Расстояние от Москвы до Санкт-Петербурга составляет: " + SAINT_PETERSBURG + " километров");
        System.out.println("Сколько потребуется времени преодолеть расстояние?");

        System.out.println("Примерное время в пути: " + ((double) (SAINT_PETERSBURG / (double) speed)) + " часов");

        speed += 10;
        System.out.println("Водитель прибавил скорость на 10 ");
        System.out.println("Автомобиль движется со скоростью: " + speed + " km/h");
        System.out.println("Примерное время в пути: " + SAINT_PETERSBURG / (double) speed + " часов");

        speed += 10;
        System.out.println("Водитель прибавил скорость на 10 ");
        System.out.println("Автомобиль движется со скоростью: " + speed + " km/h");
        System.out.println("Примерное время в пути: " + SAINT_PETERSBURG / (double) speed + " часов");

        speed += 40;
        System.out.println("Водитель прибавил скорость на 40 ");
        System.out.println("Автомобиль движется со скоростью: " + speed + " km/h");
        System.out.println("Примерное время в пути: " + SAINT_PETERSBURG / (double) speed + " часов");

        speed += 15;
        System.out.println("Водитель прибавил скорость на 15 ");
        System.out.println("Автомобиль движется со скоростью: " + speed + " km/h");
        System.out.println("Примерное время в пути: " + SAINT_PETERSBURG / (double) speed + " часов");

        System.out.println("В итоге водитель не смог преодолеть расстояние в 710 км попал под лишение прав..." +
                "через какое время он получит права? и сколько ему топать назад если он проехал только 50км?");
    }

}
