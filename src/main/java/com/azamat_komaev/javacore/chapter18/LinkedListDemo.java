package com.azamat_komaev.javacore.chapter18;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.addFirst("A");
        list.addLast("Z");
        list.add(1, "A1");
        System.out.println("Content of linked list: " + list);

        list.remove("F");
        list.remove(1);
        System.out.println("Content of linked list after deleting some elements: " + list);

        list.removeFirst();
        list.removeLast();
        System.out.println("Content of linked list after deleting first and last elements: " + list);

        String str = list.get(2);
        list.set(2, str + " changed");
        System.out.println("Content of linked list after change: " + list);
    }
}
