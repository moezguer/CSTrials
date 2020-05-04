package com.example.Cracking.LongestPalindrome;

public class Main {
    public static void main(String[] args) {
        String s = "bab";
        System.out.println(findLongestPalindrome(s));
    }

    public static int findLongestPalindrome(String s) {

        int length = s.length();
        int counter = 0;
        if (length == 0) {
            return 0;
        }

        if (length == 1) {
            return 1;
        }

        if (s.charAt(0) == s.charAt(length - 1)) {
            counter = findLongestPalindrome(s.substring(1, length-1)) + 2;
        } else{
            if (findLongestPalindrome(s.substring(0, length - 1)) < findLongestPalindrome(s.substring(1, length))) {
                counter = findLongestPalindrome(s.substring(1, length));
            } else {
                counter = findLongestPalindrome(s.substring(0, length - 1));
            }
        }
        return counter;
    }
}
