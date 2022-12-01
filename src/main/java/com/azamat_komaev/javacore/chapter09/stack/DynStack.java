package com.azamat_komaev.javacore.chapter09.stack;

// Int stack with stackable values
public class DynStack implements IntStack {
    private int[] stck;
    private int tos;

    // init top of the stack
    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // place element in stack
    public void push(int item) {
        if (tos == stck.length-1) {
            int[] temp = new int[stck.length * 2];
            for (int i=0; i<stck.length; i++) {
                temp[i] = stck[i];
            }
            stck = temp;
        }
        stck[++tos] = item;
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
