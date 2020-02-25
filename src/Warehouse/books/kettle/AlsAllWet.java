package Warehouse.books.kettle;

//стр. 125
//Программа, объясняющаяя, почему Эл стоит под дождем
public class AlsAllWet {

    public static void main(String[] args) {

        for (int verse = 1; verse <= 3; verse++) {
            System.out.println("Эл весь мокрый.");
            System.out.println("Почему Эл весь мокрый?");
            System.out.println("Потому, что он стоит под дождем");
            System.out.println("Почему Эл стоит под дождем?");

            switch (verse) {
                case 1:
                    System.out.println("Потому что дождь идет очень долго");
                    break;
                case 2:
                    System.out.println("Потому что он очень несчастлив");
                    break;
                case 3:
                    System.out.println("Потому что он все равно уже мокрый");
                    break;
            }
            switch (verse) {
                case 3:
                    System.out.println("Очень долго, очень долго...");
                case 2:
                    System.out.println("Очень, очень несчастлив.");
                case 1:
                    System.out.println("Все равно, все равно уже мокрый");
            }
            System.out.println("Под дождем, под дождем");
            System.out.println("О-оооооо");
            System.out.println();
        }
        System.out.println("Эл весь мокрый");
        System.out.println("Почему Эл весь мокрый?");
        System.out.println("Потому что он стоит под дождем.");
        System.out.println("Под дождем, под дождем.");
    }
}
