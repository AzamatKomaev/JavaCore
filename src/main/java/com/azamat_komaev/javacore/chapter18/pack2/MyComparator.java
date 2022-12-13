package com.azamat_komaev.javacore.chapter18.pack2;

import java.util.*;

public class MyComparator implements Comparator<String> {
    public int compare(String a, String b) {
        return b.compareTo(a);
    }
}
