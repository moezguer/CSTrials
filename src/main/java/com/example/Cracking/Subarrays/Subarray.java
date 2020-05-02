package com.example.Cracking.Subarrays;

public class Subarray {

    public static void getSubarrayWithSum(int [] array, int sum) {
        int size = array.length;
        int sumCount = 0;

        for (int i = 0; i < size ; i++) {

            if (sumCount < sum) {
                sumCount += array[i];
            }
        }

        if (sumCount < sum) {
            System.out.println(-1);
        }
    }
}
