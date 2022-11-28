package com.azamat_komaev.javacore.chapter04;

// Применение тернарной операции ?
public class Ternary {
    public static void main(String[] args) {
        int num, result;

        num = 10;
        result = num < 0 ? -num : num; // абсолютное значение num
        System.out.print("Абсолютное значение ");
        System.out.println(num + " равно " + result);

        num = -10;
        result = num < 0 ? -num : num; // абсолютное значение num
        System.out.print("Абсолютное значение ");
        System.out.println(num + " равно " + result);
    }
}
