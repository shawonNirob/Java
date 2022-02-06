package leetCode;
public class ContainsDuplicateII {
    public boolean containsDuplicateII(int[] nums, int k) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int a = Math.abs(i - j);
                if ((nums[i] == nums[j]) && a <= k) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 3;
        ContainsDuplicateII cal = new ContainsDuplicateII();
        System.out.println(cal.containsDuplicateII(nums,k));
    }
}
