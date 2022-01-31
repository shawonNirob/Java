package reverse_array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int temp, var;
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;

            l++;
            r--;
        }
        System.out.println(Arrays.toString(nums));
    }

}
