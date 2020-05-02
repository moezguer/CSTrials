package com.example.Cracking.MinimumOperations;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

    HashMap<Integer, Integer> hashMap = new HashMap<>();
    @Test
    public void check() {

        assertEquals(4, MinOp.getMinOp(8, hashMap));
        System.out.println(hashMap);

    }
}
