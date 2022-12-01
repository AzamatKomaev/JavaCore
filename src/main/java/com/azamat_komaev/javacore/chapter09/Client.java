package com.azamat_komaev.javacore.chapter09;

public class Client implements Callback {
    public void callback(int num) {
        System.out.println("callback() with value " + num);
    }

    void nonInterfaceMethod() {
        System.out.println("Non interface method!");
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.callback(20);
        client.nonInterfaceMethod();
    }
}
