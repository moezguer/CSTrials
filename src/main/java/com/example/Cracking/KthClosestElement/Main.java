package com.example.Cracking.KthClosestElement;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {

        int[] array = { 2, 15, 24, 35, 46, 57, 68, 74, 89, 93, 102 };

        printElement(array, 74, 2); // 68 89
        printElement(array, 74, 4); // 57 68 89 93
        printElement(array, 93, 4); // 68 74 89 102

    }

    public static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        return binarySearchUtil(array, start, end, target);
    }

    public static int binarySearchUtil(int[] array, int start, int end, int target) {

        int midIndex;

        while(start <= end) {

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

    public static int binarySearchUtilMod(int[] array, int start, int end, int target) {

        int midIndex;

        while(start <= end) {

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

    public static void printElement(int[] array, int target, int length) {
        int indexTarget = binarySearch(array, target);
        int right = indexTarget;
        int left = indexTarget;

        ArrayDeque<Integer> integerArrayDeque = new ArrayDeque<>();

        while (right <= 0 || left < array.length) {

            if (integerArrayDeque.size() == length) {
                break;
            }
            if (right -1 >= 0) {
                right--;
                integerArrayDeque.addFirst(array[right]);
            }

            if (left + 1 < array.length) {
                left++;
                integerArrayDeque.addLast(array[left]);
            }
        }

        for(Integer i : integerArrayDeque){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
