package com.example.Cracking.ArrayLeader;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main (String[] args) throws IOException {
        //code
        int numberOfTest;
        int arraySize1;
        int arraySize2;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        numberOfTest = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < numberOfTest; i++) {

            String[] array1 = bufferedReader.readLine().trim()
                                            .split(" ");

            arraySize1 = Integer.parseInt(array1[0]);
            arraySize2 = Integer.parseInt(array1[1]);

            String[] array2 = bufferedReader.readLine()
                                            .split(" ");

            int[][] integerArray = new int[arraySize1][arraySize2];

            for (int j = 0; j < arraySize1; j++) {
                for (int k = 0; k < arraySize2; k++)
                    integerArray[j][k] = Integer.parseInt(array2[j*arraySize2+k]);
            }

            System.out.println(searchMatrix(integerArray));
        }
    }

    public static int searchMatrix(int[][] array){

        ArrayList<Integer> arraylist = new ArrayList<>();
        int binarySearchIndexResult = Integer.MAX_VALUE;
        int rowNumber = -1;
        int result;
        for( int i = 0; i < array.length; i++){
            result = binarySearch(array[i]);
            if( result < binarySearchIndexResult ){
                if (result != -1) {
                    binarySearchIndexResult = result;
                    rowNumber = i;
                }
            }
        }
        return rowNumber;
    }

    public static int binarySearch(int[] array){
        int start = 0;
        int end = array.length -1;
        return binarySearchUtil(array, start, end);
    }

    public static int binarySearchUtil(int[] array, int start, int end){
        int midIndex;
        while(start < end){
            midIndex = start + (end - start)/2;
            if(array[midIndex] == 1 && array[midIndex - 1] == 0 ){
                return midIndex;
            }else if(array[midIndex] == 1){
                binarySearchUtil(array, start, midIndex-1);
                end = midIndex-1;
            } else {
                binarySearchUtil(array, midIndex+1, end);
                start = midIndex+1;
            }
        }
        if (array[start] == 1) {
            return start;
        } else {
            return -1;
        }
    }
}
