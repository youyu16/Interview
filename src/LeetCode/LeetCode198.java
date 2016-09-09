package LeetCode;

/**
 * Created by t-tiyou on 9/8/2016.
 */
public class LeetCode198 {
    public int rob(int[] nums) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                a += nums[i];
                a = Math.max(a, b);
            } else {
                b += nums[i];
                b = Math.max(a, b);
            }
        }
        return Math.max(a,b);
    }
}
