package LeetCode;

/**
 * Created by t-tiyou on 10/25/2016.
 */
public class LeetCode376 {
    public class Solution {
        public int wiggleMaxLength(int[] nums) {
            if (nums == null || nums.length == 0) return 0;
            final int N = nums.length;
            int[] dp = new int[N];
            dp[0] = 1;
            long curDiff = 0, preDiff = 0;
            for (int i = 1; i < N; i++) {
                if (curDiff != 0) preDiff = curDiff;
                curDiff = (long) nums[i] - nums[i - 1];
                if ((curDiff > 0 && preDiff <= 0) || (curDiff < 0 && preDiff >= 0)) {
                    dp[i] = dp[i - 1] + 1;
                } else
                    dp[i] = dp[i - 1];
            }
            return dp[N - 1];
        }

    }
}
