package ru.progwards.java1_1.java1.lessons.io1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*Создать статический метод public static int calcEmpty(String fileName),
в котором посчитать количество пустых строк в файле. В случае возникновения ошибок, вернуть -1
*/
public class LineCount {

    public static int calcEmpty(String fileName) {
        int count = 0; //подсчет строк
        try {
            FileReader reader = new FileReader(fileName);
            try (reader; Scanner scanner = new Scanner(reader)) {
                while (scanner.hasNextLine()) {
                    String strFromFile = scanner.nextLine();
                    if (strFromFile.length() == 0) {   //подсчет ПУСТЫХ строк
                        count++;
                    }
                }
            return count;
            }
        } catch (IOException e) {
            return -1;
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(calcEmpty("src\\test.txt"));
    }
}
