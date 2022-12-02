package com.azamat_komaev.javacore.chapter09.stack;

// Interface for integer stack
public interface IntStack {
    void push(int item);
    int pop();

    default void clear() {
        System.out.println("Method clear() is not supported");
    }
}
