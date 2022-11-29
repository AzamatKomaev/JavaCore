package com.azamat_komaev.javacore.chapter07;

class RetObTest {
    int num;

    RetObTest(int num) {
        this.num = num;
    }

    RetObTest incrementByTen() {
        return new RetObTest(num + 10);
    }
}

public class RetOb {
    public static void main(String[] args) {
        RetObTest ob1 = new RetObTest(2);
        RetObTest ob2;

        ob2 = ob1.incrementByTen();
        System.out.println("ob1.num: " + ob1.num);
        System.out.println("ob2.num: " + ob2.num);

        ob2 = ob2.incrementByTen();
        System.out.println("ob2.num after second increment: " + ob2.num);
    }
}
