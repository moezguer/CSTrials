package com.example.Cracking.MaxProfit;

public class MaxProfit {

    public static void getMaxProfit(int[] array) {
        int minima = 0;
        int maxima = 0;
        int count = 0;

        for (int i = 1; i < array.length; i++) {

            if (array[i] >= array[maxima]) {
                maxima = i;
                if (maxima == array.length - 1) {
                    System.out.print("(" + minima + " " + maxima + ") ");
                    count++;
                }
            } else {
                if (maxima != minima) {
                    System.out.print("(" + minima + " " + maxima + ") ");
                    count++;
                }
                minima = i;
                maxima = i;
            }
        }

        if (count == 0) {
            System.out.println("No profit");
        }
    }
}
