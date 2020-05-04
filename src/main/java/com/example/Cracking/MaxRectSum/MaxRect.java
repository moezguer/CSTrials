package com.example.Cracking.MaxRectSum;

import java.util.Arrays;

public class MaxRect {

    public static int getMaxSum(int[][] array) {
        int max = Integer.MIN_VALUE;
        int localMax;
        int[] tempArray = new int[array[0].length];
        Arrays.fill(tempArray, 0);

        for (int i = 0; i < array.length; i++) {
            Arrays.fill(tempArray, 0);
            for (int j = i; j < array.length; j++) {

                for (int k = 0; k < tempArray.length; k++) {
                    tempArray[k] += array[j][k];
                }
                localMax = getKadane(tempArray);
                if (localMax > max) {
                    max = localMax;
                }

            }
        }

        return max;
    }

    public static int getKadane(int[] array) {
        int maxGlobal = Integer.MIN_VALUE;
        int maxLocal = 0;

        for (int i = 0; i < array.length; i++) {
            maxLocal += array[i];

            if (maxGlobal < maxLocal) {
                maxGlobal = maxLocal;
            }
            if (maxLocal < 0) {
                maxLocal = 0;
            }


        }

        return maxGlobal;
    }
}
