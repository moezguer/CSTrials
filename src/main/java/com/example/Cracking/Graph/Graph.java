package com.example.Cracking.Graph;

import lombok.Data;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Graph<T> {

    private HashMap<Vertex, HashSet<Vertex>> relationsMap;

    public Graph() {
        relationsMap = new HashMap<>();
    }

    public void addVertex(T data) throws Exception {
        Vertex<T> vertex = new Vertex<>(data);
        if (!relationsMap.containsKey(vertex.data)) {
            relationsMap.put(vertex, new HashSet<>());
        } else {
            throw new Exception("Already Exist");
        }
    }

    public void addEdge(T source, T destination) throws Exception {

        Vertex<T> vertexSource = new Vertex<>(source);
        Vertex<T> vertexDestination = new Vertex<>(destination);

        if (relationsMap.containsKey(vertexSource) && relationsMap.containsKey(vertexDestination)) {

            relationsMap.get(vertexSource)
                        .add(vertexDestination);
            relationsMap.get(vertexDestination)
                        .add(vertexSource);

        } else {
            throw new Exception("Already Exist");
        }

    }

    public void printGraph() {
        relationsMap.forEach((vertex, vertices) -> {
            System.out.print(vertex.data + ": ");
            vertices.forEach(vertex1 -> System.out.print(vertex1.data + " "));
            System.out.println();
        });
    }

    public void printConnectionsDFS(T data) throws Exception {

        Vertex<T> vertex = new Vertex<>(data);

        HashSet<Vertex> visited = new HashSet<>();

        if (relationsMap.containsKey(vertex)) {

            printConnectionsDFSHelper(vertex, visited);

        }
    }

    private void printConnectionsDFSHelper(Vertex vertex, HashSet<Vertex> visited) {

        System.out.print(vertex.data + " ");

        visited.add(vertex);

        relationsMap.get(vertex)
                    .forEach(vertex1 -> {
                        if (!visited.contains(vertex1)) {
                            printConnectionsDFSHelper(vertex1, visited);
                        }
                    });

    }

    public void printConnectionsBFS(T data) throws Exception {

        Vertex<T> vertex = new Vertex<>(data);

        HashSet<Vertex> visited = new HashSet<>();

        Queue<Vertex> queue = new LinkedList<>();

        queue.add(vertex);

        while (!queue.isEmpty()) {

            System.out.print(queue.peek().data + " ");
            visited.add(queue.peek());

            relationsMap.get(queue.poll())
                        .forEach(vertex1 -> {

                            if (!visited.contains(vertex1)) {
                                queue.add(vertex1);
                            }
                        });
        }
    }

    @Data
    public class Vertex<T> {
        private T data;

        public Vertex(T data) {
            this.data = data;
        }
    }



/*
    private Map<Vertex, List<Vertex>> adjVertices;

    // standard constructor, getters, setters


    public Graph(){
        this.adjVertices = new HashMap<>();
    }

    private class Vertex {
        String label;
        Vertex(String label) {
            this.label = label;
        }

        // equals and hashCode
    }

    public void addVertex(String label) {
        adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

    public void removeVertex(String label) {
        Vertex v = new Vertex(label);
        adjVertices.values().stream().forEach(e -> e.remove(v));
        adjVertices.remove(new Vertex(label));
    }

    public void addEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }

    public void removeEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        List<Vertex> eV1 = adjVertices.get(v1);
        List<Vertex> eV2 = adjVertices.get(v2);
        if (eV1 != null)
            eV1.remove(v2);
        if (eV2 != null)
            eV2.remove(v1);
    }*/
}
