package com.azamat_komaev.javacore.chapter18;

import java.util.*;

public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> values = new ArrayList<>();

        values.add(1.0);
        values.add(2.0);
        values.add(3.0);
        values.add(4.0);
        values.add(5.0);

        System.out.println("Content of values: ");
        Spliterator<Double> spliterator = values.spliterator();
        while (spliterator.tryAdvance((n) -> System.out.println(n)));

        spliterator = values.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (spliterator.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));

        spliterator = sqrs.spliterator();
        spliterator.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }
}
