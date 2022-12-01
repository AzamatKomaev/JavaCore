package com.azamat_komaev.javacore.chapter09.stack;

public class FixedStack implements IntStack {
    private int[] stck;
    private int tos;

    // init top of the stack
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // place element in stack
    public void push(int item) {
        if (tos == stck.length-1) {
            System.out.println("Stack is full");
        }
        else {
            stck[++tos] = item;
        }
    }

    // exclude element from stack
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack does not contain items");
            return 0;
        }
        else {
            return stck[tos--];
        }
    }
}
