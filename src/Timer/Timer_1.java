package Timer;


//таймер, не идеален но сойдет
public class Timer_1 {


    public static int m = 0; //minute
    public static int h = 0; //hour
    public static int day = 0;  //day

    public static void main(String[] args) throws InterruptedException {
        //for (int i = 60; i > 0 ; i--) {   //отсчет от 60секунд в обратное

        while (true) {
            for (int i = 0; i <= 60; i++) {
                Thread.sleep(1000);  //В каждой секунде насчитывается 1000 миллисекунд
                System.out.print("Days:"+day+" Hour: "+h+" Minute: "+m+ " Second: " + i + "\r");
            }
            m++;

            if(m==60){
                h++;
                m=0;  //обнуление делать а то получится не то

            }
            if(h==24){
                day++;
                h = 0;

            }
        }
    }
}

//   System.out.println("\b") ; //пропуск строки
//  System.out.print('\u000C'); //стрелка