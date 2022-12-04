package com.azamat_komaev.javacore.chapter18;

import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<String>();
        deque.add("A");
        deque.add("B");
        deque.add("C");
        deque.add("D");
        deque.add("E");

        System.out.println("Exclude from stack: ");

        while (deque.peek() != null) {
            System.out.print(deque.pop() + " ");
        }

    }



}
