package com.example.Cracking.CoinGameOpt;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

    @Test
    public void playCoinGame() {

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(5);
        integerArrayList.add(3);
        integerArrayList.add(7);
        integerArrayList.add(10);

        assertEquals(15, CoinGame.maxGain(integerArrayList));

    }

    @Test
    public void playCoinGame2() {

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(8);
        integerArrayList.add(15);
        integerArrayList.add(3);
        integerArrayList.add(7);

        assertEquals(22, CoinGame.maxGain(integerArrayList));

    }
}
