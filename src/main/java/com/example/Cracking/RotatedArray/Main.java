package com.example.Cracking.RotatedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    @Test public void testOrderedRotated() {

        int [] array = {10,11,1,2,3,4,5,6,7,8,9};
        assertEquals(8, RotatedArray.getIndexFromRotated(array, 0, 5, 7));
    }
}
