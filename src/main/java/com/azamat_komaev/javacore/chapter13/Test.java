package com.azamat_komaev.javacore.chapter13;

import java.util.*;
import java.util.stream.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<Double>(Arrays.asList(7.0, 18.0, 10.0, 24.0, 17.0, 5.0));

        Stream<Double> stream = list.stream().map(Math::sqrt);
        Optional<Double> numSum = stream.reduce((a, b) -> a * b);

        if (numSum.isPresent()) {
            System.out.println(numSum.get());
        }

    }
}
