package Warehouse.utils;


import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.sql.Time;
import java.util.Date;

//нужна была дата, вручную вбивать влом пришлось проверить, гдето была опция по дате . а вон вижу в todo дату ставит


// TODO: 01.02.2020 вроде работает 
public class Dated {

public static String str ;


    public static void setClipboard(String str) {
        StringSelection ss = new StringSelection(str);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

    }


    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        str = str.valueOf(d);
      //  System.out.println("строка "+str);

       //Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
       // TODO: 30.01.2020 что это такое?
       //   Time t = new Time(1, 2, 3);
          //  System.out.println(t);

        setClipboard(str);
    }
}
