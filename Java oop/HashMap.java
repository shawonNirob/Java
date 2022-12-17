//0Map.Entry
package hashMap;

import java.util.HashMap;
import java.util.Map;

public class MapEntry {
    public void checkMap(HashMap<Integer, Integer> map){
        for(Map.Entry m : map.entrySet()) {
            System.out.print(m.getKey()+"-"+m.getValue()+" ");
        }
        System.out.println();

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int num = entry.getKey();
            int value = entry.getValue();
            System.out.print(num+"->"+value+" ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {100,100,100,200,200,300,200,300,200,500,600};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        MapEntry obj = new MapEntry();
        obj.checkMap(map);
    }
}


//Java program to illustrate HashMap class of java.util
package dataStructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> somethingMap = new HashMap<>();

        somethingMap.put("Nirob", 1813010);
        somethingMap.put("Macmurdo", 1922);
        somethingMap.put("Buck", 1903);
        somethingMap.put("Bond", 007);

        System.out.println(somethingMap);

        if(somethingMap.containsKey("Nirob")){
            Integer a = somethingMap.get("Nirob");
            System.out.println("Nirob " +a);
        }
        if(somethingMap.containsKey("Bond")){
            Integer a = somethingMap.get("Bond");
            System.out.println("Bond " +a);
        }
    }

    }
//
package learnArrayList;

import java.util.HashMap;

public class learnHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> studentId = new HashMap<>();

        studentId.put("James", 007);
        studentId.put("Macmurdo", 100);
        studentId.put("Raskolnikov", 2259);

        System.out.println(studentId);
    }
}
//
package learnArrayList;

import java.util.HashMap;

public class learnHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> studentId = new HashMap<>();

        studentId.put("James", 7);
        studentId.put("Macmurdo", 100);
        studentId.put("Raskolnikov", 2259);

        System.out.println(studentId);
        System.out.println(studentId.get("James"));
        System.out.println(studentId.get("jerry"));

        System.out.println(studentId.containsValue(7));
        System.out.println(studentId.containsKey("James"));

        studentId.replace("Macmurdo", 200);
        studentId.replace("Mac", 500);

        System.out.println(studentId);

        studentId.putIfAbsent("Jhon", 444);
        System.out.println(studentId);

        studentId.remove("Jhon");
        System.out.println(studentId);
    }
}
//
package leetCode;

import collectionFramework.Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class BaseBall {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 100);
        map.put("b", 200);
        map.put("c", 300);
        map.put("d", 400);


        System.out.println("HashMap: "
                + map.toString());

        // provide key whose value has to be obtained
        // and default value for the key. Store the
        // return value in k
        int k = map.getOrDefault("b", 500);

        map.put("b", map.getOrDefault("b", 0)+50);

        // print the value of k returned by
        // getOrDefault(Object key, V defaultValue) method
        System.out.println("Returned Value: " + k);

        System.out.println("HashMap: " + map);
    }
}
//
