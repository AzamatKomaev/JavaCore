package com.azamat_komaev.javacore.chapter07;


class CallByValueTest {
    void meth(int num1, int num2) {
        num1 *= 2;
        num2 /= 2;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        CallByValueTest ob = new CallByValueTest();

        int num1 = 15, num2 = 20;

        System.out.println("num1 and num2 before calling: " + num1 + " " + num2);
        ob.meth(num1, num2);
        System.out.println("num1 and num2 after calling: " + num1 + " " + num2);
    }
}
