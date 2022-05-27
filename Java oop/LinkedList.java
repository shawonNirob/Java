package dataStructure.linkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(65); l.add(85); l.add(100);
        l.add(0,60);
        System.out.println(l);
        l.remove(3);
        System.out.println(l);
    }
}
//
package dataStructure.linkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(65); l.add(85); l.add(100);
        l.add(0,60);
        l.addFirst(200);
        System.out.println(l);
        l.addLast(300);
        System.out.println(l);
        l.remove(3);
        System.out.println(l);
    }
}
//
