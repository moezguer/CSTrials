package com.example.Cracking.KthSmallest;

import java.util.PriorityQueue;

public class KthSmallest {
    public static int getKthSmallest(int[] array, int target) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < array.length ; i++) {
            minHeap.add(array[i]);
        }

        for (int i = 0; i < target-1 ; i++) {
            minHeap.poll();
        }

        return minHeap.peek();
    }
}
