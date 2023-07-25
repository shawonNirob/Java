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

//
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Edges> maxHeap = new PriorityQueue<>(Comparator.comparingInt((Edges edges) -> edges.weight).reversed());

        // Adding some sample edges to the max-heap
        maxHeap.add(new Edges(1, 2, 10));
        maxHeap.add(new Edges(2, 3, 5));
        maxHeap.add(new Edges(3, 4, 7));

        // Dequeuing elements in descending order of weight (max-heap behavior)
        while (!maxHeap.isEmpty()) {
            Edges edge = maxHeap.poll();
            System.out.println("Edge: " + edge.source + " -> " + edge.destination + ", Weight: " + edge.weight);
        }
    }
}

class Edges {
    int source;
    int destination;
    int weight;

    public Edges(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}
//
