package ru.progwards.java1.lessons.io1;

/*Создать статический метод public static void filterFile(String inFileName, String outFileName, String filter),
 в котором прочитать файл inFileName и удалить символы, содержащиеся в String filter, результат записать в выходной файл.
  В случае возникновения ошибки, пробросить стандартное исключение выше, корректно закрыв все ресурсы

Например файл содержит:
Java — строго типизированный объектно-ориентированный язык программирования, разработанный компанией Sun Microsystems
(в последующем приобретённой компанией Oracle).
obscene = " -,.()"
Должен выдать результат:
Javaстроготипизированныйобъектноориентированныйязыкпрограммированияразработанный
компаниейSunMicrosystemsвпоследующемприобретённойкомпаниейOracle */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharFilter {

    public static void filterFile(String inFileName, String outFileName, String filter) throws FileNotFoundException, IOException {

        //чтение файла
        FileReader reader = new FileReader(inFileName);
        Scanner scanner = new Scanner(reader);

        //чтение фильтра
        FileReader filt = new FileReader(filter);
        Scanner filtDoc = new Scanner(filt);

        //запись в новый файл с применение фильтра
        FileWriter in = new FileWriter(outFileName);

        while (scanner.hasNextLine()) {
            String strFromFile = scanner.nextLine();



            in.write(strFromFile + "\n");

        }
        in.close();
        filt.close();
        scanner.close();


    }

    public static void main(String[] args) throws IOException {
        filterFile("src\\doc.txt", "src\\filterOut.txt", "src\\filter.txt");
    }
}
