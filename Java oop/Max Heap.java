package dataStructure.heap;

import collectionFramework.Collection;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        pQueue.add(80);
        pQueue.add(90);
        pQueue.add(85);
        pQueue.add(100);

        System.out.println(pQueue);
        System.out.println(pQueue.peek());

        pQueue.poll();
        System.out.println(pQueue);
    }
}
