package com.example.Cracking.NonRepeated;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Main {

    @Test
    public void testFirstNonrepeated() {

        assertEquals(Character.valueOf('o'), NonRepeated.getNonrepeatedFirstChar("total"));
        assertEquals(Character.valueOf('r'), NonRepeated.getNonrepeatedFirstChar("teeter"));
        assertEquals(Character.valueOf('b'), NonRepeated.getNonrepeatedFirstChar("betul"));
        assertEquals(null, NonRepeated.getNonrepeatedFirstChar("abba"));
    }
}
