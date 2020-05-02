package com.example.Cracking.BST;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();

        /*binaryTree.addNode(3);
        binaryTree.addNode(5);
        binaryTree.addNode(2);
        binaryTree.addNode(4);
        binaryTree.addNode(7);
        binaryTree.addNode(1);


*//*        binaryTree.addNodeIterative(1);
        binaryTree.addNodeIterative(5);
        binaryTree.addNodeIterative(2);
        binaryTree.addNodeIterative(4);
        binaryTree.addNodeIterative(8);
        binaryTree.addNodeIterative(9);
        binaryTree.addNodeIterative(6);*//*

        binaryTree.traversePreOrder(binaryTree.root);
        System.out.println();
        binaryTree.traverseInOrder(binaryTree.root);
        System.out.println();
        binaryTree.traversePostOrder(binaryTree.root);
        System.out.println();

        //binaryTree.addNodeIterative(7);
        //binaryTree.addNodeIterative(1);

        binaryTree.printInorder(binaryTree.root);*/
/*        binaryTree.printInorder(binaryTree.root);
        System.out.println();

        System.out.println(binaryTree.search(5));
        System.out.println(binaryTree.search(11));
        System.out.println(binaryTree.search(0));
        System.out.println(binaryTree.search(2));*/

 /*       System.out.println(binaryTree.getHeightOfTree(binaryTree.root));

        class Solution {
            public int solution(int N) {
                // write your code in Java SE 8
                int counter = 0;
                int maxValue = 0;

                while (N % 2 == 0) {
                    N = N / 2;
                }

                while (N > 0) {
                    if (N % 2 == 0) {
                        counter++;
                        if (maxValue < counter) {
                            maxValue = counter;
                        }
                    } else {
                        counter = 0;
                    }

                    N = N / 2;

                }
                return maxValue;
            }

        }*/

/*        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        binaryTree.addNode(2);
        binaryTree.addNode(1);
        binaryTree.addNode(4);
        binaryTree.printInorder(binaryTree.root);
        System.out.println();
        System.out.println(binaryTree.isBST(binaryTree.root));*/
    }

}

