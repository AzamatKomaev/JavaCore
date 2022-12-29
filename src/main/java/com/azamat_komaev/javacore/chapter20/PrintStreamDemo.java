package com.azamat_komaev.javacore.chapter20;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) {
        File file = new File("/home/azamat/programming/java/java_mentoring/src/main/java/com/azamat_komaev/javacore/chapter20/file_to_write.txt");

        try (PrintStream printStream = new PrintStream(file)) {
            printStream.println("Hello, world!\nHow are you?");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
