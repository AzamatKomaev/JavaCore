package com.azamat_komaev.javacore.chapter18;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<String, Double>();

        hm.put("Azamat Komaev", 3434.34);
        hm.put("Sergey Medvedev", 15.32);
        hm.put("Oleg Mironov", 432.1);

        Set<Map.Entry<String, Double>> set = hm.entrySet();
        System.out.println(set);

        for (Map.Entry<String, Double> value: set) {
            System.out.println(value.getKey() + ": " + value.getValue());
        }
        System.out.println();

        double balance = hm.get("Azamat Komaev");
        hm.put("Azamat Komaev", balance + 1000);
        System.out.println("Balance of Azamat Komaev: " +
                           hm.get("Azamat Komaev"));
    }
}
