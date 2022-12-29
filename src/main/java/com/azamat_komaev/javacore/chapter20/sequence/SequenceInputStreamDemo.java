package com.azamat_komaev.javacore.chapter20.sequence;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<>();

        String pathToFolder = "/home/azamat/programming/java/java_mentoring/src/main/java/com/azamat_komaev/javacore/chapter20/sequence/";
        files.add(pathToFolder + "data1.txt");
        files.add(pathToFolder + "data2.txt");

        InputStreamEnumerator streamEnumerator = new InputStreamEnumerator(files);

        try (InputStream input = new SequenceInputStream(streamEnumerator)) {
            while ((c = input.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Error of input/output: " + e);
        }
    }
}
