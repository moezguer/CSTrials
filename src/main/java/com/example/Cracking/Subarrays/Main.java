package com.example.Cracking.Subarrays;

public class Main {

    public static void main(String[] args) {

        String s = "1+2*3-20";
        System.out.println(reverseString(s));


    }

    public static String reverseString(String s) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {

            char c = s.charAt(i);
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
