package com.azamat_komaev.javacore.chapter09.p1;

class Derived extends Protection  {
    Derived() {
        System.out.println("Constructor of subclass");
        System.out.println("n = " + n);
        System.out.println("n_protected = " + n_protected);
        System.out.println("n_public = " + n_public);

        // Cannot access to private attribute!
        // System.out.println("n_private = " + n_private);
    }
}
