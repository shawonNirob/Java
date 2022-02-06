
/*package leetCode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> cal = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!= cal.containsKey(nums)) {
                cal.put(nums[i], 1);
            }
            else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        ContainsDuplicate cal = new ContainsDuplicate();
        System.out.println(cal.containsDuplicate(nums));
    }
}

 */

