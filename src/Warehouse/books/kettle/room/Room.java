package Warehouse.books.kettle.room;

import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//стр. 237
public class Room {

    private int quests;
    private double rate;
    private boolean smoking;
    private static NumberFormat currency =
            NumberFormat.getCurrencyInstance(Locale.US);

    public void readRoom(Scanner diskScanner) {
        quests = diskScanner.nextInt();
        rate = diskScanner.nextDouble();
        smoking = diskScanner.nextBoolean();
    }

    public void writeRoom() {
        System.out.print(quests);
        System.out.print("\t");
        System.out.print(currency.format(rate));
        System.out.println(smoking ? "да" : "нет");
    }
}

class ShowRooms {

    public static void main(String[] args) throws IOException {

        Room rooms[];
        rooms = new Room[10];

        Scanner diskScanner = new Scanner(new File("C:\\Users\\User\\IdeaProjects\\java1\\src\\Warehouse\\books\\kettle\\room\\RoomList.txt"));

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            rooms[roomNum] = new Room();
            rooms[roomNum].readRoom(diskScanner);
        }
        System.out.println("Комната\tКолич.\tТариф\t\t" + "для курящих");
        for (int roomNum = 0; roomNum < 10; roomNum++) {
            System.out.print(roomNum);
            System.out.print("\t");
            rooms[roomNum].writeRoom();
        }
    }
}