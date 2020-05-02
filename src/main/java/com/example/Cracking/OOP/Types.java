package com.example.Cracking.OOP;

import java.util.EnumMap;

public enum Types {
    DOG, CAT, FISH;

    EnumMap<Types, Integer> enumMap = new EnumMap<>(Types.class);
}
