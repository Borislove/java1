package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// import java.io.Closeable;

/*Создать статический метод public static void codeFile(String inFileName, String outFileName, char[] code,
 String logName), в котором прочитать файл inFileName и перекодировать его посимвольно в соответствии
  с заданным шифром, результат записать в outFileName. Шифр задается маcсивом char[] code, где каждому символу symbol
 оригинального файла соответствует символ code[(int)symbol] выходного файла. В случае ошибок, в файл
 с именем logName вывести название ошибки через метод класса Exception - getMessage()*/

public class Coder {
    public static void codeFile(String inFileName, String outFileName, char[] code,
                                String logName) throws IOException {

        FileWriter in = new FileWriter(outFileName, true);
        try {
            //чтение
            FileReader reader = new FileReader(inFileName);
            Scanner scanner = new Scanner(reader);
            //запись

            while (scanner.hasNextLine()) {
                String strFromFile = scanner.nextLine();

                in.write(strFromFile + "\n");
            }
            in.close();
            scanner.close();

        } catch (Throwable e) {
            throw new IOException("файл не найден");
        }
    }

    public static void main(String[] args) throws IOException {

        char[] code = {'a'};
        // char[] code = new char[256];
        codeFile("io1.txt", "io1_OutFile.txt", code, "log.txt");
    }
}
