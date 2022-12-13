package com.azamat_komaev.javacore.chapter13;

import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        int symbol;
        FileInputStream fileInput;

        if (args.length != 1) {
            throw new IllegalArgumentException("You have to enter file name in args!");
        }

        try {
            fileInput = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            return;
        }

        try {
            do {
                symbol = fileInput.read();
                if (symbol != -1) {
                    System.out.println((char) symbol);
                }
            } while (symbol != -1);
        } catch (IOException e) {
            System.out.println("Cannot read data from file!");
        }

        try {
            fileInput.close();
        } catch (IOException e) {
            System.out.println("Cannot close file!");
        }
    }
}
