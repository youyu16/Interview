package LeetCode;

/**
 * Created by t-tiyou on 2016/11/22.
 */
public class LeetCode264 {
    public class Solution {
        public int nthUglyNumber(int n) {
            if (n < 1)
                return 0;
            int[] dp = new int[n];
            dp[0] = 1;
            int twoN = 0;
            int threeN = 0;
            int fiveN = 0;
            for (int i = 1; i < n; i++) {
                int next = Math.min(dp[twoN] * 2, Math.min(dp[threeN] * 3, dp[fiveN] * 5));
                dp[i] = next;
                if (next == dp[twoN] * 2)
                    twoN++;
                if (next == dp[threeN] * 3)
                    threeN++;
                if (next == dp[fiveN] * 5)
                    fiveN++;
            }
            return dp[n - 1];
        }
    }
}
