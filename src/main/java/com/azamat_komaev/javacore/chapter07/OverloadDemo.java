package com.azamat_komaev.javacore.chapter07;

// Use method overload
class Overload {
    void test() {
        System.out.println("There are no params");
    }

    void test(int num) {
        System.out.println("num: " + num);
    }

    void test(int num1, int num2) {
        System.out.println("num1 and num2: " + num1 + " " + num2);
    }

    double test(double num) {
        System.out.println("double num: " + num);
        return num * num;
    }
}

public class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(50.5);
        System.out.println("The result of calling ob.test(50.5): " + result);
    }
}


