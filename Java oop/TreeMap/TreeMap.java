package collectionFramework;

import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(0,"Nirob");
        map.put(1,"Materilas Science and Engineering");
        map.put(3, "Materials Engineer");
        map.put(2, "Software Enginner");
        map.put(5,"RUETian");
        map.putIfAbsent(4, "Agent");

        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());

        String Occu = map.get(4);
        System.out.println(Occu);
        String Oc = map.getOrDefault(6, "Intelligence");
        System.out.println(Oc);

        //System.out.println(map.entrySet());
        //map.remove(4);
        //map.remove(map.entrySet());
        boolean result = map.remove(5,"RUETian");
        System.out.println("is RUETian remove: "+ result);

        if(map.containsKey(10)) System.out.println(3 + "== True");
        if(map.containsValue("Nirob")) System.out.println("Nirob == True");

        System.out.println(map.size());

    }
}
