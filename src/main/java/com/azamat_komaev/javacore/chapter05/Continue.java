package com.azamat_komaev.javacore.chapter05;

// Use continue operator to skip iteration
public class Continue {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            System.out.print(i + " ");
            if (i%2 == 0) {
                continue;
            }
            System.out.println("");
        }
    }
}
