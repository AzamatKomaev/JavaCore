package com.azamat_komaev.javacore.chapter05;

// Use return operator to exit function
public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("Before return.");

        if (t) {
            return;
        }
        System.out.println("This operator will not run.");
    }
}
