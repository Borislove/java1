package Warehouse.books.kettle;

//расширенный вариант цикла for
public class ShowGuests2 {

    public static void main(String[] args) {

        int questr[] = {1, 4, 2, 0, 2, 1, 4, 3, 0, 2};
        int roomNum = 0;

        System.out.println("Комната\tКоличество");
        for (int numGuests : questr) {
            System.out.print(roomNum++);
            System.out.print("\t");
            System.out.println(numGuests);
        }
    }
}
