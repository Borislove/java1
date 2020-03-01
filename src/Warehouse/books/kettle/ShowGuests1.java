package Warehouse.books.kettle;

//Инициализация массива
public class ShowGuests1 {

    public static void main(String[] args) {

        int quests[] = {1,4,2,0,2,1,4,3,0,2};
        System.out.println("Комната\tКоличество");
        for (int roomNum = 0; roomNum <10 ; roomNum++) {
            System.out.print(roomNum);
            System.out.print("\t");
            System.out.println(quests[roomNum]);
        }
    }
}
