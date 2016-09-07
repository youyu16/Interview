package LeetCode;

/**
 * Created by t-tiyou on 9/7/2016.
 */
public class LeetCode283 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] a = {0, 1, 0};
        test.moveZeroes(a);
    }

    public static class Solution {
        public void moveZeroes(int[] nums) {
            int total = 0;
            for (int i = 0; i < nums.length - total; ) {
                if (nums[i] == 0) {
                    total++;
                    for (int j = i + 1; j < nums.length; j++) {
                        nums[j - 1] = nums[j];
                    }
                }
                else {
                    i++;
                }
            }
            for (int i = nums.length - 1; total > 0; i--, total--) {
                nums[i] = 0;
            }
        }
    }
}
