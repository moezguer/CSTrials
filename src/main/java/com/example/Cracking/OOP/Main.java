package com.example.Cracking.OOP;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Stack;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog2 = new Dog(Types.DOG, 5, "kangal");


        dog.setAge(4);

        dog.printName();

        dog2.printName();

        dog2.makeSound();

        dog2.calculateDatys();

        Dog.Mammal mammal = new Dog.Mammal();
        mammal.gettype();

        Dog dog3 = new Dog();

        dog3.setName(Types.CAT);

        Random random = new Random();

        List<Integer> arraylist = new ArrayList<>();
        arraylist.add(3);
        arraylist.add(3);
        arraylist.add(3);

        arraylist.stream()
                 .filter(x -> x > 2)
                 .collect(Collectors.toList());

        List<Integer> linked = new LinkedList<>();
        linked.add(2);
        linked.add(2);
        linked.add(2);

        linked.forEach(System.out::println);

        List<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(3);
        stack.add(3);

        ArrayDeque<Integer> stack2 = new ArrayDeque<>();

        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);

        stack2.forEach(System.out::print);

        System.out.println();

        stack2.pop();
        stack2.pop();

        stack2.forEach(System.out::print);

        Iterator iterator = stack2.descendingIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        linked.stream()
              .filter(x -> x < 3)
              .forEach(System.out::print);

        System.out.println();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(random.nextInt());
        priorityQueue.add(random.nextInt());
        priorityQueue.add(random.nextInt());
        priorityQueue.add(random.nextInt());
        priorityQueue.add(random.nextInt());

        priorityQueue.forEach(x -> System.out.print(x + "  "));

        System.out.println();
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println();
        priorityQueue.forEach(x -> System.out.print(x + "  "));

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("333", 55);
        hashMap.put("44", 52);
        hashMap.put("55", 1);

        System.out.println(hashMap.computeIfPresent("44", (key, value) -> value * value));

        hashMap.replaceAll((key, value) -> value*5000);

        System.out.println(hashMap);

        System.out.println();

        Iterator<Map.Entry<String, Integer>> iterator1 = hashMap.entrySet().iterator();

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();


    }
}
