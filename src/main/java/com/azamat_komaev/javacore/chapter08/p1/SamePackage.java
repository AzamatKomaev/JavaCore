package com.azamat_komaev.javacore.chapter08.p1;

class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("Constructor of that package");
        System.out.println("n = " + p.n);
        System.out.println("n_protected = " + p.n_protected);

        // Cannot access to private attribute
        // System.out.println("n_private = " + p.n_private);

    }
}
