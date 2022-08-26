package collectionFramework;

import java.util.PriorityQueue;
import java.util.TreeMap;

public class TreeMap_3 {
    TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
    //x = col, y = row, val = value;
    private void treeCLas(int x, int y, int val){
        if(!map.containsKey(x)){
            map.put(x, new TreeMap<>());
        }
        if(!map.get(x).containsKey(y)){
            map.get(x).put(y, new PriorityQueue<>());
        }
        map.get(x).get(y).add(val);
    }
    private void print(){
        System.out.println(map.entrySet());
    }
    public static void main(String[] args) {
        TreeMap_3 call = new TreeMap_3();
        call.treeCLas(0,0,3);
        call.treeCLas(-1,1,9);
        call.treeCLas(1,1,20);
        call.treeCLas(-2,2,10);
        call.treeCLas(0,2,11);
        call.treeCLas(0,2,15);
        call.treeCLas(2,2,7);

        call.print();
    }
}

