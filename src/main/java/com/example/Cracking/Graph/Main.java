package com.example.Cracking.Graph;

public class Main {
    public static void main(String[] args) throws Exception {

        Graph<Integer> g = new Graph();

        for (int i = 1; i<8; i++) {

            g.addVertex(i);

        }
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(1,5);
        //g.addEdge(3,5);
        g.addEdge(5,6);
        g.addEdge(2,7);

        //g.printGraph();

        System.out.println("DFS");
        g.printConnectionsDFS(1);
        System.out.println();
        System.out.println("BFS");
        g.printConnectionsBFS(1);


    }
}
