package com.azamat_komaev.javacore.chapter07;

public class UseStatic {
    static int num1 = 3;
    static int num2;

    static void meth(int num3) {
        System.out.println("num3 = " + num3);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    static {
        System.out.println("Static block is initialized.");
        num2 = num1 * 4;
    }

    public static void main(String[] args) {
        meth(42);
    }
}
