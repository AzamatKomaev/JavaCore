package com.azamat_komaev.javacore.chapter07;

// Objects can be passed to method as params
class Test {
    int num1;
    int num2;

    Test(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    boolean equals(Test test) {
        return test.num1 == num1 && test.num2 == num2;
    }
}

public class PassOb {
    public static void main(String[] args) {
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);

        System.out.println("ob1 == ob2: " + ob1.equals(ob2));
        System.out.println("ob1 == ob3: " + ob1.equals(ob3));
    }
}
