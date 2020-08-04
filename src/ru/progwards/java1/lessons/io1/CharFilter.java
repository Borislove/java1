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
import java.util.Arrays;
import java.util.Scanner;

public class CharFilter {

    private static char[] chars;  //сохранение строки в массив символов

    public static void filterFile(String inFileName, String outFileName, String filter) {


     /*   try {
            //чтение файла
            FileReader reader = new FileReader(inFileName);
            Scanner scanner = new Scanner(reader);
            //чтение фильтра
            FileReader filt = new FileReader(filter);
            Scanner filtScan = new Scanner(filt);
            //запись в новый файл с применение фильтра
            FileWriter in = new FileWriter(outFileName);


            in.close();
            filt.close();
            scanner.close();
            filtScan.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }*/

    }

    public static String filter() throws IOException {

        //char[] chars = inFileName("src\\charfilter.txt").toCharArray();

        // System.out.println(Arrays.toString(chars));
        //return Arrays.toString(chars);

        //  String[] filter = {"-", ",", ".", "()"};

        String str = "";
        try {


            FileReader reader = new FileReader("src\\filter.txt");
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                str += scanner.hasNextLine();
            }
            reader.close();
            scanner.close();
        }catch (IOException e) {
            System.out.println("файл не найден");
        }
        return str;
    }


    //чтение файла полностью
    public static String inFileName(String inFileName) throws IOException {
        String str = "";
        try {
            FileReader reader = new FileReader(inFileName);
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                str += scanner.nextLine();  //+ для склеивания строки
                //    System.out.println(str);
            }
            reader.close();
            scanner.close();
        } catch (IOException e) {
            System.out.println("файл не найден");
        }
        // chars = str.toCharArray();
        //String result = str.replaceAll("[,.() [-|–|—]]", "");


        //String result = str.replaceAll(String.valueOf(new Scanner("src\\filter.txt")), "1");
     //   String result = str.replaceAll(filter(), "1");
      //  System.out.println(result);
        return str;
    }


    public static void main(String[] args) throws IOException {
        //filterFile("src\\doc.txt", "src\\filterOut.txt", "src\\filter.txt");

        System.out.println(inFileName("src\\charfilter.txt"));

        //filter();

        //  System.out.println(Arrays.toString(chars));

    }
}
