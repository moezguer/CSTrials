package com.example.Cracking.Bitonic;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 6, 7, 4, 3};
        System.out.println(findPeekWithBS(array));
        System.out.println(getIndexInBitonic(array, 4));
        System.out.println(getIndexInBitonic(array, 1));
        System.out.println(getIndexInBitonic(array, 3));
        System.out.println(getIndexInBitonic(array, 2));
        System.out.println(getIndexInBitonic(array, 5));
    }

    public static int getIndexInBitonic(int[] array, int target) {

        int peekIndex = findPeekWithBS(array);
        int start = 0;
        int end = array.length - 1;
        int finalIndex;

        if (target == array[peekIndex]) {
            return peekIndex;
        }

        finalIndex = Math.max(binarySearchAsc(array, target, start, peekIndex - 1),
                binarySearchDes(array, target, peekIndex + 1, end));

        return finalIndex;
    }

    public static int binarySearchAsc(int[] array, int target, int start, int end) {

        int midIndex;

        while (start <= end) {
            midIndex = start + (end - start) / 2;

            if (array[midIndex] == target) {
                return midIndex;
            } else if (array[midIndex] < target) {
                start = midIndex + 1;
            } else {
                end = midIndex - 1;
            }
        }

        return -1;
    }

    public static int binarySearchDes(int[] array, int target, int start, int end) {
        int midIndex;

        while (start <= end) {
            midIndex = start + (end - start) / 2;

            if (array[midIndex] == target) {
                return midIndex;
            } else if (array[midIndex] > target) {
                start = midIndex + 1;
            } else {
                end = midIndex - 1;
            }
        }

        return -1;
    }


    public static int findPeekWithBS(int[] array) {
        int start = 0;
        int end = array.length - 1;
        int midIndex;

        while (start <= end) {
            midIndex = start + (end - start) / 2;

            if (array[midIndex - 1] < array[midIndex] && array[midIndex] > array[midIndex + 1]) {
                return midIndex;
            } else if (array[midIndex - 1] < array[midIndex] && array[midIndex] < array[midIndex + 1]) {
                start = midIndex + 1;
            } else {
                end = midIndex - 1;
            }
        }

        return -1;
    }
}
