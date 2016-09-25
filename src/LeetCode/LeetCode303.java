package LeetCode;

/**
 * Created by t-tiyou on 9/9/2016.
 */
public class LeetCode303 {
    public static void main(String[] args) {
        //Your NumArray object will be instantiated and called as such:
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));
    }

    static class NumArray {

        private int[] sums;

        public NumArray(int[] nums) {
            this.sums = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                sums[i] = i != 0 ? sums[i - 1] + nums[i] : nums[i];
            }
        }

        public int sumRange(int i, int j) {
            return sums[j] - (i == 0 ? 0 : sums[i - 1]);
        }
    }
}
