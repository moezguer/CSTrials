package com.example.Cracking.IntersectionTwoArrays;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {10, 10, 10};
        int[] array2 = {10, 10, 10};

        System.out.println(findCountofIntersectingElem(array1, array2));
    }

    public static int findCountofIntersectingElem(int[] array1, int[] array2) {

        if (array1.length < array2.length) {
            return interUtil(array1, array2);
        } else {
            return interUtil(array2, array1);
        }

    }

    public static int interUtil(int[] array1, int[] array2) {

        int count = 0;
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

        for (Integer i : array1) {
            hashSet1.add(i);
        }

        for (Integer j : array2) {
            hashSet2.add(j);
        }

        for (Integer j : hashSet1){
            if (hashSet1.contains(j)) {
                count++;
            }
        }

        return count;
    }
}
