package Warehouse.timer;

// TODO: 01.02.2020 надо будет переписать 
public class Timer_3 {
    //таймер в -

    public static int m = 0; //minute
    public static int h = 1; //hour   //1 час

    public static void main(String[] args) throws InterruptedException {


        while (true) {
            for (int i = 60; i > 0; i--) {   //отсчет от 60секунд в обратное
                Thread.sleep(1000);  //В каждой секунде насчитывается 1000 миллисекунд
                System.out.print(" Hour: " + h + " Minute: " + m + " Second: " + i + "\r");
            }
            m++;
            if (m == 60) {
                h++;
                m = 0;  //обнуление делать а то получится не то
            }
        }
    }
}

//   System.out.println("\b") ; //пропуск строки



