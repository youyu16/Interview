package LeetCode;

/**
 * Created by t-tiyou on 9/11/2016.
 */
public class LeetCode307 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5};
        NumArray numArray = new NumArray(nums);
        numArray.sumRange(0, 2);
        numArray.update(1, 2);
        numArray.sumRange(0, 2);
    }

    static class NumArray {

        private int[] sums;
        private int[] nums;

        public NumArray(int[] nums) {
            this.nums = nums;
            this.sums = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                if (i == 0) {
                    sums[i] = nums[i];
                } else {
                    sums[i] = sums[i - 1] + nums[i];
                }
            }
        }

        void update(int i, int val) {
            int temp = val - nums[i];
            for (int j = i; j < sums.length; j++) {
                sums[j] += temp;
            }
            nums[i] = val;
        }

        public int sumRange(int i, int j) {
            return sums[j] - (i == 0 ? 0 : sums[i - 1]);
        }
    }


}
