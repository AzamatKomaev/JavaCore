package com.azamat_komaev.javacore.chapter08.p2;


import com.azamat_komaev.javacore.chapter08.p1.Protection;

public class OtherPackage {
    OtherPackage() {
        Protection p = new Protection();
        System.out.println("Constructor from another package");

        System.out.println("n_public = " + p.n_public);

        // Cannot access to default attribute
        // System.out.println("n = " + p.n);

        // Cannot access to protected attribute
        // System.out.println("n_protected = " + p.n_protected);

        // Cannot access to private attribute
        // System.out.println("n_private = " + p.n_private);
    }
}
