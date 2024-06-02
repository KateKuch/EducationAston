package task2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();

        //Записываем строку в файл
        try {
            FileOutputStream fos = new FileOutputStream("tms.txt");
            fos.write(inputLine.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Читаем строку из файла
        StringBuilder fileTxt = new StringBuilder();
        try {
            FileInputStream fis = new FileInputStream("tms.txt");
            int character;
            while ((character = fis.read()) != -1){
                fileTxt.append((char) character);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String newFileTxt = fileTxt.toString().replace(" ", "_");
        System.out.println(newFileTxt);
    }
}
