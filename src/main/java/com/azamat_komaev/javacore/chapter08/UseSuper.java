package com.azamat_komaev.javacore.chapter08;

// Use super to avoid name conflict
class ParentUseSuper {
    String name;
}

class ChildUseSuper extends ParentUseSuper {
    String name;

    ChildUseSuper(String name1, String name2) {
        super.name = name1;
        name = name2;
    }

    void printNames() {
        System.out.println("name in superclass is " + super.name);
        System.out.println("name in subclass is " + name);
    }
}

public class UseSuper {
    public static void main(String[] args) {
        ChildUseSuper child = new ChildUseSuper("Azamat", "David");
        child.printNames();
    }
}
