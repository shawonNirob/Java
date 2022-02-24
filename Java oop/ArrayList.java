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
