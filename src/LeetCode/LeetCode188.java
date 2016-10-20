package LeetCode;

/**
 * Created by t-tiyou on 10/25/2016.
 */
public class LeetCode188 {

    public static void main(String[] args) {
        Solution.maxProfit(3, new int[]{2,6,8,7,8,7,9,4,1,2,4,5,8});
    }

    // Memory Limit Exceeded if not use quickSolve
    public static class Solution {
        public static int maxProfit(int k, int[] prices) {
            if (k <= 0)
                return 0;
            if (k >= prices.length / 2) return quickSolve(prices);
            int[][] m = new int[2][k];
            for (int i = 0; i < k; i++) {
                m[0][i] = Integer.MIN_VALUE;
            }
            for (int price : prices) {
                for (int i = 0; i < k; i++) {
                    if (i == 0) {
                        if (m[0][i] < -price)
                            m[0][i] = -price;
                        if (m[1][i] < m[0][i] + price)
                            m[1][i] = m[0][i] + price;
                    } else {
                        if (m[0][i] < m[1][i - 1] - price)
                            m[0][i] = m[1][i - 1] - price;
                        if (m[1][i] < m[0][i] + price)
                            m[1][i] = m[0][i] + price;
                    }

                }
            }
            return m[1][k - 1];
        }
        private static int quickSolve(int[] prices) {
            int len = prices.length, profit = 0;
            for (int i = 1; i < len; i++)
                // as long as there is a price gap, we gain a profit.
                if (prices[i] > prices[i - 1]) profit += prices[i] - prices[i - 1];
            return profit;
        }
    }
}
