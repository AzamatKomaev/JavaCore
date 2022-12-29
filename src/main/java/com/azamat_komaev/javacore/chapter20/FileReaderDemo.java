package com.azamat_komaev.javacore.chapter20;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderDemo {
    public static void main(String[] args) {
        String filePath = "/home/azamat/programming/java/java_mentoring/src/main/java/com/azamat_komaev/javacore/chapter20/file_to_read.txt";

        try (FileReader fileReader = new FileReader(filePath)) {
            int c;

            while ((c = fileReader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
