package com.azamat_komaev.javacore.chapter20;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console console;
        console = System.console();

        if (console == null) {
            System.out.println("Console is null");
            return;
        }


        str = String.valueOf(console.readPassword("Enter password: ", new Object()));
        console.printf("Entered string from console: %s\n", str);
    }
}
