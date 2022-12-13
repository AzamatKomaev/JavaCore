package com.azamat_komaev.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int content;

        if (args.length != 2) {
            System.out.println("You have to enter two args!");
            return;
        }

        try (FileInputStream fileIn = new FileInputStream(args[0]);
             FileOutputStream fileOut = new FileOutputStream(args[1]);) {
            do {
                content = fileIn.read();
                if (content != -1) {
                    fileOut.write(content);
                }
            } while (content != -1);
        } catch (IOException e) {
            System.out.println("Error during in-out");
        }
    }
}
