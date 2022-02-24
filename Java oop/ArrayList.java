package learnArrayList;

import java.util.ArrayList;

public class ArrayListLearn {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        System.out.println("nums size: " + nums.size());

        nums.add(50);
        nums.add(60);
        nums.add(45);
        nums.add(1,45);

        System.out.println(nums);
        for(int x : nums){
            System.out.print(" " +x);
        }
    }
}
//
package learnArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListLearn {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>(Arrays.asList("Picaso", "Joyse", "Macmurdo", "Moriarty"));
        name.add("Pablo");
        name.add(1,"james");
        System.out.println(name.get(0));
        System.out.println(name);

        ArrayList<Integer>number = new ArrayList<>(Arrays.asList(1,5,6,8,7,9));
        number.add(47);
        number.add(1,50);

        System.out.println(number.get(5));
        System.out.println(number);

    }
}
//
