package com.azamat_komaev.javacore.chapter05;

// Use break operator to quit a loop
public class BreakLoop {
    public static void main(String[] args) {
        for (int i=0; i<100; i++) {
            if (i == 10) {
                break;
            }
            System.out.println("i: " + i);
        }
        System.out.println("The loop is finished.");
    }
}
