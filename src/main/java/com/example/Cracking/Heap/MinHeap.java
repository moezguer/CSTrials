package com.example.Cracking.Heap;

import java.util.ArrayList;
import java.util.Collections;

public class MinHeap {

    ArrayList<Integer> arrayList;

    public MinHeap() {
        arrayList = new ArrayList<>();
    }

    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    public boolean isRoot(int index) {
        return index == 0;
    }

    public int elementAt(int index) {
        return arrayList.get(index);
    }

    public int getParent(int index) {
        return (index - 1) / 2;
    }

    public int getLeftChild(int index) {
        return (2 * index) + 1;
    }

    public int getRightChild(int index) {
        return (2 * index) + 2;
    }

    public void heapifyUp(int index) {

        while (index >= 0) {
            if (elementAt(index) < elementAt(getParent(index))) {
                swap(index, getParent(index));
                index = getParent(index);
            } else {
                return;
            }
        }
    }

    public void heapifyDown(int index) {

        while (index < arrayList.size()) {
            printHeap();
            if (isIndexValid(index)) {

                Integer child = whichChild(index);

                if (child == null) return;

                if (arrayList.get(index) > arrayList.get(child)) {
                    swap(index, child);
                    index = child;
                    System.out.println("heapdown heeeepppp");
                    printHeap();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public void swap(int index1, int index2) {

        Collections.swap(arrayList, index1, index2);

    }

    public void addElement(int data) {

        arrayList.add(data);
        int index = arrayList.indexOf(data);
        heapifyUp(index);

    }

    public int getMin() {
        int output;
        if (isEmpty()) {
            return -1;
        } else {
            output = arrayList.get(0);
            System.out.println("output " + output);
            int farMost = arrayList.size() - 1;
            System.out.println("farmost " + farMost);
            swap(0, farMost);
            System.out.println("tüm heap");
            printHeap();
            arrayList.remove(farMost);
            heapifyDown(0);
        }
        return output;
    }

    public boolean isIndexValid(int index) {
        return index < arrayList.size() - 1;
    }

    public Integer whichChild(int index) {
        int leftChildIndex = getLeftChild(index);
        int rightChildIndex = getRightChild(index);

        if (isIndexValid(leftChildIndex) && isIndexValid(rightChildIndex)) {
            return arrayList.get(leftChildIndex) < arrayList.get(rightChildIndex) ? leftChildIndex : rightChildIndex;
        } else if (isIndexValid(leftChildIndex)) {
            return leftChildIndex;
        } else {
            return null;
        }
    }

    public void printHeap() {
        arrayList.forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
