package com.azamat_komaev.javacore.chapter18;

import java.util.*;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Content of list: " + list);

        Integer[] nums = new Integer[list.size()];
        nums = list.toArray(nums);
        int sum = 0;

        for (int num: nums) {
            sum += num;
        }
        System.out.println("Sum: " + sum);

    }
}
