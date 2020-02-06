package Warehouse.horse;

import java.util.Arrays;

public class HorseArray {

    private static String horse[] = {"'Снежинка'", "'Молния'", "'Буря'", "'Шторм'", "'Вихрь'", "'Счастливчик'","'Ари", "Розовый единорожек","Радуга"};

    public static void main(String[] args) {
      //  System.out.println(horse.toString());
     //   System.out.println(Arrays.toString(horse));
        Arrays.sort(horse);
        System.out.println(Arrays.binarySearch(horse, "'Вихрь'"));
        System.out.println(horse[2]);
    }
}
