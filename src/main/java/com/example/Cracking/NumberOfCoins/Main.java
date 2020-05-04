package com.example.Cracking.NumberOfCoins;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arrayCoins = {1, 4, 5};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        System.out.println(getNumberOfCoins(arrayCoins, 12));
        System.out.println(getNumberOfCoinsDynamic(arrayCoins, 999, hashMap));
    }

    public static int getNumberOfCoins(int[] array, int target) {
        int[] coinsArray = Arrays.copyOf(array, array.length);
        Arrays.sort(coinsArray);
        int numberOfCoins = 0;

        while (target > 0) {

            for (int i = coinsArray.length - 1; i >= 0; i--) {
                if (target / coinsArray[i] >= 1) {
                    numberOfCoins += target / coinsArray[i];
                    target = target % coinsArray[i];
                }
            }
        }
        return numberOfCoins;
    }

    public static int getNumberOfCoinsDynamic(int[] array, int target, HashMap<Integer, Integer> hashMap) {

        int numberOfCoins = Integer.MAX_VALUE;
        int result;

        if (target == 0) {
            return 0;
        }

        if (target < 0) {
            return Integer.MAX_VALUE;
        }

        if (hashMap.containsKey(target)) {
            return hashMap.get(target);
        }

        for (int i = 0; i < array.length; i++) {

            result = getNumberOfCoinsDynamic(array, target - array[i], hashMap);

            if (numberOfCoins > result) {
                numberOfCoins = result;
            }
        }

        hashMap.put(target, numberOfCoins + 1);
        return numberOfCoins + 1;
    }

}
