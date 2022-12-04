package com.azamat_komaev.javacore.chapter18;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add(1, "A1");

        System.out.println("Content of list: " + list);
        System.out.println("Size of list: " + list.size());

        list.remove("A1");
        list.remove(0);

        System.out.println("Content of list after removing some elements: " + list);
        System.out.println("Size of list after removing some elements: " + list.size());
    }
}
