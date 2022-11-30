package com.azamat_komaev.javacore.chapter08;

// Dynamical dispatch of methods

class ADispatch {
    void callme() {
        System.out.println("callme() from A");
    }
}

class BDispatch extends ADispatch {
    void callme() {
        System.out.println("callme() from B");
    }
}

class CDispatch extends BDispatch {
    void callme() {
        System.out.println("callme() from C");
    }
}

public class Dispatch {
    public static void main(String[] args) {
        ADispatch a = new ADispatch();
        BDispatch b = new BDispatch();
        CDispatch c = new CDispatch();

        ADispatch r;

        r = a;
        r.callme(); // call method from ADispatch

        r = b;
        r.callme(); // call method from BDispatch

        r = c;
        r.callme(); // call method from CDispatch
    }
}
