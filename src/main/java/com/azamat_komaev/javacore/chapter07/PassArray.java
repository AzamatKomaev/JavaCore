package com.azamat_komaev.javacore.chapter07;

// Use array to pass several arguments to method.
public class PassArray {
    static void vaTest(int[] arguments) {
        System.out.print("Count of arguments: " + arguments.length + " ");
        System.out.print("Values: ");

        for (int argument: arguments) {
            System.out.print(argument + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] n1 = {10};
        int[] n2 = {1,2,3};
        int[] n3 = {};

        vaTest(n1); // 1 argument
        vaTest(n2); // 3 arguments
        vaTest(n3); // without arguments
    }
}
