package com.azamat_komaev.javacore.chapter09.InterfaceVariables;

import java.util.Random;

public class Question implements SharedConstants {
    Random rand = new Random();


    int ask() {
        int prob = (int) (100 * rand.nextDouble()); // generate random number
        if (prob < 30) {
            return NO;
        }
        if (prob < 60) {
            return YES;
        }
        if (prob < 75) {
            return LATER;
        }
        if (prob < 98) {
            return SOON;
        }
        return NEVER;
    }
}
