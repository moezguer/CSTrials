package com.example.Cracking.Queue;

public class Main {
    public static void main(String[] args) throws Exception {

        Queue<Integer> integerQueue = new Queue<>();

        integerQueue.enqueue(5);
        integerQueue.enqueue(3);
        integerQueue.enqueue(2);
        integerQueue.printQueue();
        System.out.println(integerQueue.peek());

        System.out.println("dequeued: " + integerQueue.dequeue());
        integerQueue.printQueue();
        System.out.println(integerQueue.peek());

        System.out.println("dequeued: " + integerQueue.dequeue());
        integerQueue.printQueue();
        System.out.println(integerQueue.peek());


        integerQueue.enqueue(4);
        integerQueue.enqueue(7);
        integerQueue.enqueue(3);
        integerQueue.printQueue();
        System.out.println(integerQueue.peek());



    }


}
