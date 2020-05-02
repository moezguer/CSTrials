package com.example.Cracking.Heap;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

    @Test
    public void checkIfTrue() {
        MinHeap minHeap = new MinHeap();
        minHeap.addElement(7);

        minHeap.addElement(6);

        minHeap.addElement(5);

        minHeap.addElement(4);
        minHeap.addElement(3);

        minHeap.addElement(2);

        minHeap.addElement(1);
        minHeap.printHeap();

        assertEquals(1, minHeap.getMin());
        assertEquals(2, minHeap.getMin());
        assertEquals(3, minHeap.getMin());
        assertEquals(4, minHeap.getMin());
        assertEquals(5, minHeap.getMin());
        assertEquals(6, minHeap.getMin());
        assertEquals(7, minHeap.getMin());
    }


}
