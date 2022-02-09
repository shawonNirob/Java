package leetCode;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int xor =0;
        for(int i: nums){
            xor ^=i;
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        SingleNumber cal =new SingleNumber();
        System.out.println(cal.singleNumber(nums));
    }
}
