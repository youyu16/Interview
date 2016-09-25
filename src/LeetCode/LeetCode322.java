package LeetCode;


import java.util.Arrays;

/**
 * Created by t-tiyou on 9/11/2016.
 */
public class LeetCode322 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] a = new int[]{1};
        test.coinChange(a, 1);
    }

    static class Solution {
        public int coinChange(int[] coins, int amount) {
            int max = amount + 1;
            int[] dp = new int[amount + 1];
            Arrays.fill(dp, max);
            dp[0] = 0;
            for (int i = 1; i <= amount; i++) {
                for (int j = 0; j < coins.length; j++) {
                    int coin = coins[j];
                    if (coin <= i)
                        dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
            return dp[amount] == max ? -1 : dp[amount];
        }
    }
}
