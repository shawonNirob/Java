package collectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBuildIn {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 25; i >0; --i) {
            q.add(i);
        }
        System.out.println(q);
        q.poll();
        System.out.println(q);
        q.offer(100);

        System.out.println("Queue size is " + q.size());
        System.out.println(q.remove());
        System.out.println(q.element());
        System.out.println(q.peek());

        while (!q.isEmpty()) {
            int poll = q.poll();
            doSomeWork(poll);
        }
    }
        private static void doSomeWork(int val){
            System.out.print(val+ " ");
        }
    }
