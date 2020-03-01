package Warehouse.books.kettle;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//заполнение массива значениями
public class ShowGuests {

    public static void main(String[] args) throws IOException {

        int quests[] = new int[10];
        Scanner diskScanner = new Scanner(new File("C:\\Users\\User\\IdeaProjects\\java1\\src\\Warehouse\\books\\kettle\\GuestList.txt"));

        //считывает из файла количество постояльцев в каждой комнате
        for (int roomNum = 0; roomNum < 10; roomNum++) {
            quests[roomNum] = diskScanner.nextInt();
        }
            System.out.println("Комната\tКоличество");

        //выводит содержимое
        for (int roomNum = 0; roomNum < 10; roomNum++) {
            System.out.print(roomNum);
            System.out.print("\t");
            System.out.println(quests[roomNum]);
        }
    }
}

