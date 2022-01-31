package binary_search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,4,4,5,6};
        int target = 8;
//        System.out.println(search(nums, target));
        System.out.println(Arrays.toString(search(nums, target)));
    }

    public static int[] search(int[] nums, int target) {
        int l=0,h= nums.length, mid;
        while (l<=h){
            mid=l+(h-l)/2;
            if(nums[mid]==target){
                int count=0, start;
                while (mid<=h){
                    start=mid;
                    count++;
                    if(count>0 && nums[mid]!=target){
                        return new int[]{start, start+count-1};
                    }
                }
            }
            if(nums[mid]>target){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        System.out.println("Number not found");
        return new int[]{-1,-1};
    }
}


