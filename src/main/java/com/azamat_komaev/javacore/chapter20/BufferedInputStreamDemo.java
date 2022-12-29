package com.azamat_komaev.javacore.chapter20;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        String content = "This &copy; but &copy is not.\n";
        byte[] contentBytes = content.getBytes();

        ByteArrayInputStream arrayInput = new ByteArrayInputStream(contentBytes);
        int c;
        boolean marked = false;

        try (BufferedInputStream f = new BufferedInputStream(arrayInput)) {
            while ((c = f.read()) != -1) {
                if (c == '&') {
                    if (!marked) {
                        f.mark(32);
                        marked = true;
                    } else {
                        marked = false;
                    }
                    continue;
                }

                if (c == ';') {
                    if (marked) {
                        marked = false;
                        System.out.print("(c)");
                    } else {
                        System.out.print((char) c);
                    }
                    continue;
                }

                if (c == ' ') {
                    if (marked) {
                        marked = false;
                        f.reset();
                        System.out.print("&");
                    } else {
                        System.out.print((char) c);
                    }
                    continue;
                }

                if (!marked) {
                    System.out.print((char) c);
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
