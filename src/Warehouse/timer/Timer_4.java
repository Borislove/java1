package Warehouse.timer;

//программа работает, но не так как надо! ), вроде починилось...
public class Timer_4 {

    public static int m = 0; //minute
    public static int h = 0; //hour
    public static int s = 0; //second

    public static void timerGo() throws InterruptedException {

        while (true) {
            for (int i = 0; i <= 60; i++) {
                Thread.sleep(1000);  //В каждой секунде насчитывается 1000 миллисекунд
                System.out.print(" Hour: " + h + " Minute: " + m + " Second: " + s + "\r");
                s++;
            }
            m++;
            if (m == 60) {
                h++;
                m = 0;  //обнуление делать а то получится не то
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        timerGo();
    }

    @Override
    public String toString() {
        return (" Hour: " + h + " Minute: " + m + " Second: " + s + "\r");
    }
}
