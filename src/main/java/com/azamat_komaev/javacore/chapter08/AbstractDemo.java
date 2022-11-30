package com.azamat_komaev.javacore.chapter08;

// Simple example of using abstraction
abstract class AbstractA {
    abstract void callme();

    void callmetoo() {
        System.out.println("it is method in abstract class!");
    }
}

class AbstractB extends AbstractA {
    void callme() {
        System.out.println("callme() from class AbstractB");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        AbstractB b = new AbstractB();

        b.callme();
        b.callmetoo();
    }
}
