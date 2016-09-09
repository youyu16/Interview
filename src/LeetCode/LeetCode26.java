package LeetCode;

/**
 * Created by t-tiyou on 9/8/2016.
 */
public class LeetCode26 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] a = {1, 1};
        test.removeDuplicates(a);
    }

    static class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums == null)
                return 0;
            if (nums.length == 1)
                return 1;
            int cur = 0;
            int total = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[cur]) {
                    nums[++cur] = nums[i];
                    total++;
                }
            }
            return total + 1;
        }
    }
}
