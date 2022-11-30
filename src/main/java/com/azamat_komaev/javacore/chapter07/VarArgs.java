package com.azamat_komaev.javacore.chapter07;

// Use new passing several arguments variant in method
public class VarArgs {
    static void vaTest(int ... arguments) {
        System.out.print("Count of arguments: " + arguments.length + " ");
        System.out.print("Values: ");

        for (int argument: arguments) {
            System.out.print(argument + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
