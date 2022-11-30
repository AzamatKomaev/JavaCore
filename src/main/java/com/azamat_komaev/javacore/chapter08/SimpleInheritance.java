package com.azamat_komaev.javacore.chapter08;

// Simple example of inheritance

// Parent
class Parent {
    int num1, num2;

    void printNum1AndNum2() {
        System.out.println("num1 and num2: " + num1 + " " + num2);
    }
}

// Child
class Child extends Parent {
    int num3;

    void printNum3() {
        System.out.println("num3: " + num3);
    }

    void sum() {
        System.out.println("num1+num2+num3: " + (num1+num2+num3));
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        // superclass can be used by itself
        parent.num1 = 10;
        parent.num2 = 20;
        System.out.println("parent object content: ");
        parent.printNum1AndNum2();
        System.out.println();

        // subclass has access to all open components of its superclass
        child.num1 = 7;
        child.num2 = 8;
        child.num3 = 9;
        System.out.println("child object content: ");
        child.printNum1AndNum2();
        child.printNum3();

        System.out.println();
        System.out.println("Sum of num1, num2 and num3 in child object:");
        child.sum();
    }
}
