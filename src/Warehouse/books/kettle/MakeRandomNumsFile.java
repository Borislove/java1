package Warehouse.books.kettle;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

//стр. 242
//Запись набора случайных чисел в файл
public class MakeRandomNumsFile {

    public static void main(String[] args) throws IOException {

        Random generator = new Random();

        if (args.length < 2) {
            System.out.println("Использование: MakeRandomNumbsFile" + " имя_файла число");
            System.exit(1);
        }
        PrintStream printOut = new PrintStream("C:\\Users\\User\\IdeaProjects\\java1\\src\\Warehouse\\books\\kettle\\MyNumberedFile.txt");
        int numLines = Integer.parseInt("5");

        for (int count = 1; count <= numLines; count++) {
            printOut.println(generator.nextInt(10) + 1);
        }
    }
}
