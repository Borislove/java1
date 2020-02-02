package Warehouse.speed_racing_2020.carspeed;

//что то опять мудрить буду
public class Speed_1 {

    public static int speed = 0; //начальная скорость

    public static void speedUp() {
        speed++;
    }
    public static void main(String[] args) {

        System.out.println("Начальная скорость "+speed);
        System.out.println("Прибаливи газу ");
        speedUp();
        System.out.println("Текущая скорость "+speed);

        //speedUp(10); //пока без параметров

        //турбоускорение ) на 10
        for (int i = 0; i < 10 ; i++) {
            speedUp();
        }
        System.out.println(speed);

    }
}
