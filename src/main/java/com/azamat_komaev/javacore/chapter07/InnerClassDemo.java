package com.azamat_komaev.javacore.chapter07;

// Use inner class
class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // This is inner class
    class Inner {
        void display() {
            System.out.println("output: outer_x = " + outer_x);
        }
    }
}

public class InnerClassDemo {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
}
