package LintCode;

/**
 * Created by youti on 2016/9/3.
 */
public class LintCode100 {
    public static void main(String[] args) {
        LintCode100 test = new LintCode100();
        int[] nums = {9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 14};
        test.removeDuplicates(nums);
    }

    /**
     * @param nums: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
        int len = nums.length;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1)
                break;
            if (nums[i] == nums[nums.length - 1]) {
                len = i + 1;
                break;
            }

            if (nums[i] != nums[index]) {
                int temp = i - index;
                index++;
                for (int j = i; j < len; j++) {
                    nums[j - temp + 1] = nums[j];
                }
                len = len - temp + 1;
                i = index;
            }

        }
        return len;
    }
}
