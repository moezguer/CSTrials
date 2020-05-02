package com.example.Cracking.LRU;

import org.junit.jupiter.api.Test;

public class Main {

    @Test public void test() {
        LRU lru = new LRU();
        lru.setLRU(1,2);
        lru.setLRU(2,3);
        lru.setLRU(1,5);
        lru.setLRU(4,5);
        lru.setLRU(6,7);

        System.out.println(lru.getLRU(1));
        System.out.println(lru.getLRU(4));
        System.out.println(lru.getLRU(5));
        System.out.println();

        lru.printLRUList();
    }


}
