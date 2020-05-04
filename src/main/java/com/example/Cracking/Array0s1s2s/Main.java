package com.example.Cracking.Array0s1s2s;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 0, 1, 1, 2, 0, 0, 2, 2, 2, 1, 0, 1};
        Arrays.stream(array).forEach(System.out::print);
        System.out.println();
        sortArray(array);
        Arrays.stream(array).forEach(System.out::print);
    }

    public static void sortArray(int[] array) {

        int start = 0;
        int end = 0;
        while (array[start] == 0 || array[end] == 0) {
            start++;
            end++;
        }
        end++;

        int temp;
        for (int i = 0; i < 3; i++) {

            while (end < array.length) {
                if (array[end] == i) {
                    temp = array[end];
                    array[end] = array[start];
                    array[start] = temp;
                    start++;
                }
                end++;
            }
            start++;
            end = start + 1;
            Arrays.stream(array).forEach(System.out::print);
            System.out.println();
        }
    }

}
