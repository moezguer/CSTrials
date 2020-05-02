package com.example.Cracking.Fibo;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    @Test public void testFiboRec() {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        assertEquals(63245986, Fibo.fiboRecMemo(39, hashMap));
        //assertEquals(63245986, Fibo.fiboRec(39));
    }
}
