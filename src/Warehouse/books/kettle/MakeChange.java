package Warehouse.books.kettle;

import static java.lang.System.out;

//Вычисление времени в часах и минутах
public class MakeChange {

    public static void main(String[] args) {

        int totalTime = 200;  //общее время
        int hour, minute;

        hour = totalTime / 60;
        minute = totalTime % 60;
        out.println("Общее время = " + hour + " часа и " + minute
                + " минут.");
    }
}
