package com.azamat_komaev.javacore.chapter02;

/*
    Применение блоков кода.
*/
class BlockTest {
    public static void main(String args[]) {
        int x, y;

        y = 20;
        // адресатом этого оператора цикла служит блок кода
        for (x = 0; x<10; x++) {
            System.out.println("Значение x: " + x);
            System.out.println("Значение y: " + y);
            y = y - 2;
        }
    }
}
