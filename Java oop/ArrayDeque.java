//Queue
package collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        //FIFO
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(25);
        dq.add(63);
        dq.add(96);
        dq.add(105);
        dq.add(26);

        System.out.println(dq);
        dq.remove(); //remove the first in one
        System.out.println(dq);

    }
}

//
//Stack
package collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        //LIFO
        Deque<Integer> dq = new ArrayDeque<>();
        dq.push(25);
        dq.push(63);
        dq.push(96);
        dq.push(105);
        dq.push(26);

        System.out.println(dq);
        dq.pop(); //remove the first in one
        System.out.println(dq);
    }
}

