package Warehouse.books.kettle;

import java.io.File;
import java.util.Scanner;

//стр. 128
//Удалить файл?
public class DeleteEvidence {

    public static void main(String[] args) {

        File evidence = new File("C:\\Users\\User\\IdeaProjects\\java1\\src\\Warehouse\\books\\kettle\\cookedBooks.txt");
        Scanner keyboard = new Scanner(System.in);
        char reply;
        do {
            System.out.println("Удалить файл? y/n");
            reply = keyboard.findWithinHorizon(".", 0).charAt(0);
        } while (reply != 'y' && reply != 'n' &&
                reply != 'Y' && reply != 'N'
        );
        if (reply == 'y' || reply == 'Y') {
            System.out.println("Ладно, удаляю.");
            evidence.delete();
            System.out.println("Файл удален.");
        } else {
            System.out.println("Ладно, не удаляю.");
        }
    }
}
