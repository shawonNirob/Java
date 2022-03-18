
//HashSet does not contains dublicate
//HashSet only contains value. not key
//HashSet is a HashMap
//and its work with HashMap
//Its add function work with put in map
//But there is a default value assign for the set
package learnArrayList;

import java.util.HashSet;

public class learnHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Nirob");
        set.add("Netflix");

        System.out.println(set);

        set.add("Picaso");
        set.add("Netflix");
        System.out.println(set);
    }
}
