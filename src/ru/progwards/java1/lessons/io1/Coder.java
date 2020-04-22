package ru.progwards.java1.lessons.io1;

import java.io.FileNotFoundException;
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

public class Coder implements AutoCloseable {
    public static void codeFile(String inFileName, String outFileName, char[] code,
                                String logName) throws FileNotFoundException, IOException {


        String str = " ";
        try {
            //чтение
            FileReader reader = new FileReader(inFileName);
            Scanner scanner = new Scanner(reader);
            //запись
            FileWriter in = new FileWriter(outFileName, true);

            while (scanner.hasNextLine()) {
                String strFromFile = scanner.nextLine();
                str += strFromFile;
                //in.write(String.valueOf(strFromFile)+"\n");
                //in.write(scanner.nextLine());
            }
            in.write(str + "\n");


        } catch (Throwable e) {
            throw new IOException("файл не найден");
        }

    }

    public static void main(String[] args) throws IOException {

        char[] code = {'a'};
        // char[] code = new char[256];
        codeFile("io1.txt", "io1_OutFile.txt", code, "log.txt");
    }

    @Override
    public void close() throws Exception {
    }
}
