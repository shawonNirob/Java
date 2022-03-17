package dataStructure.linkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> l[] = new LinkedList[10];
        for(int i=0; i<10; i++){
            l[i] = new LinkedList<>();
        }
        l[0].add(65); l[2].add(85); l[1].add(100);
        l[3].add(36); l[3].add(90);
        l[9].add(50); l[9].add(45);
        for(int i=0; i<10; i++) {
            System.out.println(i+"==>"+l[i]);
        }
    }
}
