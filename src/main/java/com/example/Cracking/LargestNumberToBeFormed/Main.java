package com.example.Cracking.LargestNumberToBeFormed;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {97, -27, 2, -34, 61, -39};
        String[] s1 = {"34", "23", "9", "2", "223432"};
        Arrays.sort(s1, (x,y) -> (x+y).compareTo(y+x) > 0 ? -1 : 1);
        StringBuilder sb = new StringBuilder();
        for (int i = s1.length - 1; i >= 0 ; i--) {
            System.out.print(s1[i] + " ");
            sb.append(s1[i]);
        }
        System.out.println();
        String s2 = sb.toString();
        System.out.println(s2);
        sb.setLength(0);
    }
}
