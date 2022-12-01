package com.azamat_komaev.javacore.chapter09;

class AnotherClient implements Callback {
    public void callback(int num) {
        System.out.println("num*num = " + num*num);
    }

    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);
        c = ob; // now variable relates to AnotherClient object
        c.callback(42);
    }
}
