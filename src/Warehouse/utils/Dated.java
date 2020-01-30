package Warehouse.utils;


import java.sql.Time;
import java.util.Date;

//нужна была дата, вручную вбивать влом пришлось проверить, гдето была опция по дате . а вон вижу в todo дату ставит


public class Dated {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        // TODO: 30.01.2020 что это такое?
        Time t = new Time(1, 2, 3);
        System.out.println(t);

    }
}
