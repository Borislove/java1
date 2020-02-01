package Warehouse.timer;

//таймер в +

public class Timer_2 {

    public static int m = 0; //minute
    public static int h = 0; //hour

    public static void timerStart() throws InterruptedException {
        while (true) {
            for (int i = 0; i <= 60; i++) {
                Thread.sleep(1000);  //В каждой секунде насчитывается 1000 миллисекунд
                System.out.println(" Hour: " + h + " Minute: " + m + " Second: " + i + "\r" );

                //System.out.println("test");
            }
            m++;
            if (m == 60) {
                h++;
                m = 0;  //обнуление делать а то получится не то
            }
        }
    }

    public static void timerPrint(){
        System.out.println("Запущен таймер: timer_2");
    }

    public static void main(String[] args) throws InterruptedException {

        timerPrint();
        timerStart();

    }
}


//   System.out.println("\b") ; //пропуск строки


