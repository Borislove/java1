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

    public static void codeFile(String inFileName,
                                String outFileName,
                                char[] code,
                                String logName) {

        try {
            //запись ошибок в лог
            FileWriter error = new FileWriter(logName);

            //копия файла
            FileWriter in = new FileWriter(outFileName);

            try {
                //прочитать файл inFileName
                FileReader readerOriginal = new FileReader(inFileName);
                Scanner scanner = new Scanner(readerOriginal);
                while (scanner.hasNextLine()) {
                    String str = scanner.nextLine();
                    System.out.println(str);

                    for (Character c : code)
                        in.write(c);
                }


                //чтение
                FileReader reader = new FileReader(inFileName);
                //   Scanner scanner = new Scanner(reader);


                //*****************************************************************

                //*****************************************************************
                in.close();
                scanner.close();

            } catch (Exception e) {
                error.write(e.getMessage());
                error.close();
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public static void main(String[] args) throws IOException {

        //char[] code = {'a', 'b', 'c', 'd', 'e'};
        //char[] code = {'w', 'z', 'x', 'g', 'r','g','o','p'};


        char[] code = new char[256];
        for (int i = 0; i < 256; i++) code[i] = (char) (Character.isDigit((char) i) ? i + 1 : i);
        codeFile("io1.txt", "io1_OutFile.txt", code, "log.txt");

        /*char a = 'b';
        System.out.println((int) a);*/
    }
}
