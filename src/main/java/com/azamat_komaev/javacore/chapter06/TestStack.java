package com.azamat_komaev.javacore.chapter06;

// There is integer stack where you can save until 10 int values
class Stack {
    private int stck[] = new int[10];
    private int tos;

    // init top of the stack
    Stack() {
        tos = -1;
    }

    // place element in stack
    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full");
        }
        else {
            stck[++tos] = item;
        }
    }

    // exclude element from stack
    int pop() {
        if (tos < 0) {
            System.out.println("Stack does not contain items");
            return 0;
        }
        else {
            return stck[tos--];
        }
    }
}

public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        // insert numbers to stack
        for (int i=0; i<10; i++) {
            mystack1.push(i);
        }
        for (int i=10; i<20; i++) {
            mystack2.push(i);
        }

        // exclude all these numbers from stack
        System.out.println("mystack1 content:");
        for (int i=0; i<10; i++) {
            System.out.println(mystack1.pop());
        }

        System.out.println("mystack2 content:");
        for (int i=0; i<10; i++) {
            System.out.println(mystack2.pop());
        }

        // You cannot use it because It is private!
        // mystack1.tos = -2;
        // mystack2.stck[3] = 100;
    }
}
