package com.azamat_komaev.javacore.chapter18.pack1;

import java.util.*;

public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> addresses = new LinkedList<Address>();

        addresses.add(new Address("Azamat", "Markova",
                                  "Beslan", "RSO", "12345"));
        addresses.add(new Address("Sergey", "Peace",
                                  "Mariupol", "UK", "123"));
        addresses.add(new Address("Kazbek", "Lenina",
                                  "Vladikavkaz", "RSO", "54432"));

        for (Address address: addresses) {
            System.out.println(address + "\n");
        }

    }
}
