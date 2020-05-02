package com.example.Cracking.ArrayLeader;

import java.util.ArrayDeque;

public class ArrayLeader {
    public static void printArrayLeaders(int[] array) {
        int localMaxima = Integer.MIN_VALUE;
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = array.length-1; i >=0 ; i--) {
            if (localMaxima <= array[i]) {
                localMaxima = array[i];
                stack.push(localMaxima);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
