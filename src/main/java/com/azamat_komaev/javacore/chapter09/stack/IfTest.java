package com.azamat_komaev.javacore.chapter09.stack;

public class IfTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        // fill stacks by int values
        for (int i=0; i<5; i++) {
            mystack1.push(i);
        }
        for (int i=0; i<8; i++) {
            mystack2.push(i);
        }

        // exclude these values from stack
        System.out.println("Stack in mystack1: ");
        for (int i=0; i<5; i++) {
            System.out.println(mystack1.pop());
        }

        System.out.println("Stack in mystack2: ");
        for (int i=0; i<8; i++) {
            System.out.println(mystack2.pop());
        }
    }
}
