package com.azamat_komaev.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int content;
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;

        if (args.length != 2) {
            System.out.println("You have to enter two args!");
            return;
        }

        try {
            fileIn = new FileInputStream(args[0]);
            fileOut = new FileOutputStream(args[1]);

            do {
                content = fileIn.read();
                if (content != -1) {
                    fileOut.write(content);
                }
            } while (content != -1);
        } catch (IOException e) {
            System.out.println("Error during in-out");
        } finally {
            try {
                if (fileIn != null) fileIn.close();
            } catch (IOException e2) {
                System.out.println("Error during closing fileIn");
            }
            try {
                if (fileOut != null) fileOut.close();
            } catch (IOException e2) {
                System.out.println("Error during closing fileOut");
            }
        }
    }
}
