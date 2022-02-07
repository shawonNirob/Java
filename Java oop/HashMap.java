
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
