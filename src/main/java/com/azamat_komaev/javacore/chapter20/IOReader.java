package com.azamat_komaev.javacore.chapter20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOReader {
    static File getFile(String fileName) {
        return new File("src/main/java/com/azamat_komaev/javacore/chapter20/" + fileName);
    }

    static File getFolder() {
        return new File("src/main/java/com/azamat_komaev/javacore/chapter20/files");
    }

    static void printFilesInsideFolder() {
        File folder = getFolder();
        if (!folder.isDirectory()) {
            System.out.println("This is not a directory!");
            return;
        }

        File[] filesInsideFolder = folder.listFiles();
        if (filesInsideFolder == null) {
            System.out.println("The folder is empty!");
            return;
        }

        for (File file : filesInsideFolder) {
            if (file.isDirectory()) {
                System.out.println(file.getName() + " is folder");
            } else {
                System.out.println(file.getName() + " is file");
            }
        }
    }

    static void printFileData() {
        try (FileInputStream fileInput = new FileInputStream(getFile("file_to_read.txt"))) {
            int size;
            System.out.println("Bytes: " + (size = fileInput.available()));

            StringBuilder fileContent = new StringBuilder();

            for (int i=0; i<size; i++) {
                fileContent.append((char) fileInput.read());
            }
            System.out.println(fileContent);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void writeDataInFile() {
        String text = "Hello everybody! How are you?\n" +
            "I am good and you?";
        byte[] bytes = text.getBytes();

        try (FileOutputStream outputStream = new FileOutputStream(getFile("file_to_write.txt"))) {
            outputStream.write(bytes);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        printFileData();
    }
}
