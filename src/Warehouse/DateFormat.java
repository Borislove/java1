package Warehouse;

//дату преобразовать в строку , значение все сложить, не так все просто как казалось..

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DateFormat {

    public static void main(String[] args) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");

        Date date = new Date();
        System.out.println(formatter.format(date));

        //Integer a = Integer.valueOf(formatter.format(date)); //exeption
        String a = formatter.format(date);

        //затолкал дату в хеш
        Integer ups = a.hashCode();
        System.out.println(ups);


        System.out.println(a);

        String b = String.valueOf(a);
        System.out.println(b);


        System.out.println(ups + 1);

        if (ups > 0) {
            System.out.println(" ups  " + ups);
        }
        if (ups < 0) {
            ups *= -1;
            System.out.println(" ups + " + ups);
        }

        //затолкал в массив дату
        int[] arrayDate = new int[1];
        arrayDate[0] = ups;
        System.out.println(Arrays.toString(arrayDate));
        System.out.println(arrayDate.length);
        System.out.println(arrayDate[0]);


        for (int i = 0; i < arrayDate.length; i++) {
            int[] arr = new int[9];

            arr[0] = arrayDate[0];
            arr[1] = arrayDate[0] / 10;
            arr[2] = arr[1] / 10;
            arr[3] = arr[2] / 10;
            arr[4] = arr[3] / 10;
            arr[5] = arr[4] / 10;
            arr[6] = arr[5] / 10;
            arr[7] = arr[6] / 10;
            arr[8] = arr[7] / 10;
            System.out.println(Arrays.toString(arr));  //[1016877432, 101687743, 10168774, 1016877, 101687, 10168, 1016, 101, 10]
        }
    }
}
