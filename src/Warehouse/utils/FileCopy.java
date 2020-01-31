package Warehouse.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


//копирование файла
public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("e:\\data.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("e:\\result.txt");

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}