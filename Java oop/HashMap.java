
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
