package dataStructure.heap;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        pQueue.add(50);
        pQueue.add(60);
        pQueue.add(70);

        System.out.println(pQueue.peek());
        System.out.println(pQueue.poll());

        System.out.println(pQueue);

    }
}
