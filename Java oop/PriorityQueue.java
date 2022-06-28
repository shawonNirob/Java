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

//
package collectionFramework;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueueDemo {
    public static void main(String[] args) {
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        //Queue<Integer> pq = new PriorityQueue<>();
        pq.add(7);
        pq.add(9);
        pq.add(36);
        pq.add(3);
        pq.add(100);

        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        System.out.println(pq);
    }
}

//

package collectionFramework;

import java.util.*;

public class priorityQueueDemo {
    public static void main(String[] args) {
        //Queue<Map.Entry<String,Integer>> pq = new PriorityQueue<>(Map.Entry.comparingByValue(Collections.reverseOrder()));
        //Queue<Map.Entry<String,Integer>> pq = new PriorityQueue<>(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        //Queue<Map.Entry<String,Integer>> pq = new PriorityQueue<>(Map.Entry.comparingByValue());

        Queue<Map.Entry<String,Integer>> pq = new PriorityQueue<>(Map.Entry.comparingByKey(Collections.reverseOrder()));
        //Queue<Map.Entry<String,Integer>> pq = new PriorityQueue<>(Map.Entry.comparingByKey());

        pq.add(new AbstractMap.SimpleEntry<>("P", 20));
        pq.add(new AbstractMap.SimpleEntry<>("Q", 10));
        pq.add(new AbstractMap.SimpleEntry<>("R", 15));
        pq.add(new AbstractMap.SimpleEntry<>("S", 30));

        System.out.println(pq);

        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());

        System.out.println(pq);
    }
}


