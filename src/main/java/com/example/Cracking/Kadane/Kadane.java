package com.example.Cracking.Kadane;

public class Kadane {
    public static int getKadane(int [] array) {
        int maxGlobal= Integer.MIN_VALUE;
        int maxLocal = 0;

        for (int i = 0; i < array.length ; i++) {
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
