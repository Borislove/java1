package Warehouse.utils;

import java.awt.*;
import java.awt.datatransfer.StringSelection;


public class Boof {



    public static void setClipboard(String str) {
        StringSelection ss = new StringSelection(str);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

    }
    public static void main(String[] args) {
setClipboard("testing21314132554363386211231234");
    }
}
