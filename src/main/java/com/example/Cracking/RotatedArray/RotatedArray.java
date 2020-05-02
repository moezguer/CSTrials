package com.example.Cracking.RotatedArray;

public class RotatedArray {

    public static int getIndexFromRotated(int[] data, int start, int end, int value) {

        int midIndex;

        while (start < end) {

            midIndex = start + (end - start) / 2;

            if (value <= data[midIndex] && value >= data[start]) {
                if (value == data[start]) {
                    return start;
                } else if (value == data[end]) {
                    return end;
                } else {
                    return getIndexFromRotated(data, start, midIndex, value);
                }

            } else if (value <= data[midIndex] && value < data[start]) {
                if (value == data[start]) {
                    return start;
                } else if (value == data[end]) {
                    return end;
                } else {
                    getIndexFromRotated(data, midIndex, end, value);
                    getIndexFromRotated(data, midIndex, end, value);
                }
            } else {
                if (value == data[start]) {
                    return start;
                } else if (value == data[end]) {
                    return end;
                } else {
                    return getIndexFromRotated(data, midIndex, end, value);
                }
            }
        }
        return -1;
    }
}
