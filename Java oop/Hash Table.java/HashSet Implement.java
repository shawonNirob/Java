package learnArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListLinkedList {
    private final int arraySize  = 50;
    List<List<Integer>> parentList;

    public ListLinkedList() {
        parentList = new ArrayList<>(arraySize);
        for (int i = 0; i < arraySize; i++) {
            parentList.add(null);
        }
    }
    public void add(int key) {
        int index = key % arraySize;
        List<Integer> childList = parentList.get(index);
        if(childList==null){
            List<Integer> list  = new LinkedList<>();
            list.add(key);
            parentList.set(index, list);
        }else{
            if(!childList.contains(key)){
                childList.add(key);
            }
        }
    }

    public void remove(int key) {
        int index = key % arraySize;
        List<Integer> childList = parentList.get(index);
        if(childList != null){
            childList.remove(Integer.valueOf(key));
        }
    }

    public boolean contains(int key) {
        int index = key % arraySize;
        List<Integer> childList = parentList.get(index);
        if(childList != null &&  childList.contains(key)) return true;
        return false;
    }

    public static void main(String[] args) {
        ListLinkedList call = new ListLinkedList();

        call.add(500);
        call.add(600);
        call.add(700);
        call.add(800);
        call.add(900);
        System.out.println(call.contains(800));

        call.remove(300);
        call.remove(800);
        System.out.println(call.contains(800));

    }
}
