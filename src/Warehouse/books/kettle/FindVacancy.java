package Warehouse.books.kettle;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

//стр. 233
//Есть ли у вас свободная комната?
public class FindVacancy {

    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);
        Scanner diskScanner = new Scanner(new File("C:\\\\Users\\\\User\\\\IdeaProjects\\\\java1\\\\src\\\\Warehouse\\\\books\\\\kettle\\\\GuestList.txt"));
        int quests[] = new int[10];
        int roomNum;

        for (roomNum = 0; roomNum < 10; roomNum++) {
            quests[roomNum] = diskScanner.nextInt();
        }
        roomNum = 0;
        while (roomNum < 10 && quests[roomNum] != 0) {
            roomNum++;
        }
        if (roomNum == 10) {
            System.out.println("Извините, свободных " + "комнат нет.");
        } else {
            System.out.print("Сколько человек " + "поселятся в комнате ");
            System.out.print(roomNum);
            System.out.println(" ?");
            quests[roomNum] = keyboard.nextInt();

            PrintStream listOut = new PrintStream("C:\\\\Users\\\\User\\\\IdeaProjects\\\\java1\\\\src\\\\Warehouse\\\\books\\\\kettle\\\\GuestList.txt");

            for (roomNum = 0; roomNum < 10; roomNum++) {
                listOut.print(quests[roomNum]);
                listOut.print(" ");
            }
        }
    }
}
