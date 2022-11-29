package com.azamat_komaev.javacore.chapter07;

// Use some methods from String class
public class StringDemo {
    public static void main(String[] args) {
        String str1 = "First string";
        String str2 = "Second string";
        String str3 = str1;

        System.out.println("The length of str1 is " + str1.length());

        System.out.println("Symbol by index 3 in str1 is " + str1.charAt(3));

        if (str1.equals(str2)) {
            System.out.println("str1 == str2");
        }
        else {
            System.out.println("str1 != str2");
        }

        if (str1.equals(str3)) {
            System.out.println("str1 == str2");
        }
        else {
            System.out.println("str1 != str3");
        }
    }
}
