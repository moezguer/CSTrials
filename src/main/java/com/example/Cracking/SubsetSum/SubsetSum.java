package com.example.Cracking.SubsetSum;

public class SubsetSum {
    public static void printSubsetWithSum(int[] array, int targetSum) {
        int startIndex = 0;
        int endIndex = 0;
        int currentSum = array[endIndex];

        while (endIndex < array.length) {

            if (currentSum == targetSum) {
                System.out.println((startIndex+1) + " " + (endIndex+1));
                return;
            } else if (currentSum < targetSum) {
                endIndex++;
                if (endIndex < array.length) {
                    currentSum += array[endIndex];
                }
            } else {
                currentSum -= array[startIndex];
                startIndex++;
            }
        }
        System.out.println(-1);
    }
}
