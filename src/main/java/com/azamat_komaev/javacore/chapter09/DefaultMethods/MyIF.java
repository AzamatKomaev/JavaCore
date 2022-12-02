package com.azamat_komaev.javacore.chapter09.DefaultMethods;

public interface MyIF {
    int getNumber();

    default String getString() {
        return "Object type String by default";
    }
}
