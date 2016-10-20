package LeetCode;

/**
 * Created by t-tiyou on 10/20/2016.
 */
public class LeetCode309 {
    public class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length == 0 || prices.length == 1) {
                return 0;
            }
            int[] sell = new int[prices.length];
            int[] rest = new int[prices.length];
            int[] buy = new int[prices.length];
            int i = 1;
            buy[0] = -prices[0];

            while (i < prices.length) {
                buy[i] = Math.max(rest[i - 1] - prices[i], buy[i - 1]);
                sell[i] = Math.max(buy[i - 1] + prices[i], sell[i - 1]);
                rest[i] = Math.max(sell[i - 1], Math.max(rest[i - 1], buy[i - 1]));
                i++;
            }
            return Math.max(sell[prices.length - 1], rest[prices.length - 1]);
        }
    }
}
