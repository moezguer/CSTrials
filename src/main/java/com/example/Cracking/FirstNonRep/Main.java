package com.example.Cracking.FirstNonRep;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Main {

    @Test
    public void test() {
        ArrayList<Character> arrayList = new ArrayList<>();
        arrayList.add('a');
        FirstNon.getFirstNon(arrayList);
        arrayList.add('a');
        FirstNon.getFirstNon(arrayList);
        arrayList.add('b');
        FirstNon.getFirstNon(arrayList);
        arrayList.add('c');
        FirstNon.getFirstNon(arrayList);
        arrayList.add('c');
        FirstNon.getFirstNon(arrayList);
    }

}
