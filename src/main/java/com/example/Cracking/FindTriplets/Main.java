package com.example.Cracking.FindTriplets;

public class Main {
    public static void main(String[] args) {
        int[] array = {6, 56, 93, -12, 26, 78, 79, 58, 53, 52, 51, 55, 77, -2, 61, -26, 91, 16, 100, -8, 72};
        System.out.println(checkIfTripletsPresent(array));
    }

    public static boolean checkIfTripletsPresent(int[] array) {

        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 2; k < array.length; k++) {
                    if ((array[i] + array[j] + array[k]) == 0) {
                        System.out.println(i);
                        System.out.println(j);
                        System.out.println(k);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
