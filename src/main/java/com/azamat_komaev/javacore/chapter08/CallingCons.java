package com.azamat_komaev.javacore.chapter08;

// show line calling of constructors

class A {
    A() {
        System.out.println("A constructor");
    }
}

class B extends A {
    B() {
        System.out.println("B constructor");
    }
}

class C extends B {
    C() {
        System.out.println("C constructor");
    }
}

public class CallingCons {
    public static void main(String[] args) {
        C c = new C();
    }
}
