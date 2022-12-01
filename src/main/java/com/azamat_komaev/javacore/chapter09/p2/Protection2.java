package com.azamat_komaev.javacore.chapter09.p2;

import com.azamat_komaev.javacore.chapter09.p1.Protection;

public class Protection2 extends Protection {
    Protection2() {
        System.out.println("Constructor inherited from another package");
        System.out.println("n_public = " + n_public);
        System.out.println("n_protected = " + n_protected);

        // Cannot access to default attribute
        // System.out.println("n = " + n);

        // Cannot access to private attribute
        // System.out.println("n_private = " + n_private);
    }
}
