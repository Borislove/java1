package Warehouse.speed_racing_2020.carspeed;


import Warehouse.timer.Timer_2;

// TODO: 01.02.2020 Эксперименты и развлечение...
public class Car_Speed {


    private static int speed = 0;

    private static final int MAX_SPEED = 60;

    private static void speedUp() {
        speed++;
    }

    private static void speedDown() {
        speed--;
    }

    private static void speedAcceleration() {   //ускорение
        speed += 10;
    }

    private static void speedStop() {
        speed = 0;
    }

    public static void main(String[] args) throws InterruptedException {

        // TODO: 01.02.2020 начале консоли таймер, потом сам цикл 
//------------------пока не работает , перетирает все 
        // Timer_2 t2 = new Timer_2();
        //Timer_2.timerPrint();
        //  Timer_2.timerStart();
        //---------------------------------------


        if (speed <= MAX_SPEED) {

            System.out.println("Текущая скорость: " + speed);

            System.out.println("Прибавили: ");
            speedUp();
            System.out.println("Текущая скорость: " + speed);

            System.out.println("Убавили: ");
            speedDown();
            System.out.println("Текущая скорость: " + speed);

            System.out.println("Ускорение: ");
            speedAcceleration();
            System.out.println("Текущая скорость: " + speed);

/*
            for (int i = 0; i <= MAX_SPEED; i++) {
                speedAcceleration();
                System.out.println("Ускорение ");
                if(i==MAX_SPEED) {
                    System.out.println("Двигатель сгорел");
                }*/

            while (true) {
                int ver = new java.util.Scanner(System.in).nextInt();
                int a = Integer.valueOf(ver);
                switch (a) {
                    case 1:
                        speedUp();
                        System.out.println("Текущая скорость: " + speed);
                        break;
                    case 2:
                        speedDown();
                        System.out.println("Текущая скорость: " + speed);
                        break;
                    case 3:
                        speedAcceleration();
                        System.out.println("Текущая скорость: " + speed);
                        break;
                    case 4:
                        speedStop();                //speed 0 , когда понижение назад будет отсчет
                        System.out.println("Текущая скорость: " + speed);
                        break;

                }

                //вышел из цикла
                if (a == 5) {
                    System.out.println("exit");
                    break;
                }
            }
        }

    }
}

