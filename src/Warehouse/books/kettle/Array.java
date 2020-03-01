package Warehouse.books.kettle;


import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int quests[];
        quests = new int[10];

        for (int roomNum = 0; roomNum < 10; roomNum++) {  //постепенно заполняется с 0 до 9
            quests[roomNum] = 2;
            System.out.println(Arrays.toString(quests));
        }
        Arrays.fill(quests, 3);   //идет сразу заполнение
        System.out.println(Arrays.toString(quests));
    }
}
