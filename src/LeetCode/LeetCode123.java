package LeetCode;

/**
 * Created by t-tiyou on 10/20/2016.
 */
public class LeetCode123 {
    public static void main(String[] args) {
        Solution2.maxProfit(new int[]{1, 2, 4, 0, 5});
    }

    //  Time Limit Exceeded
    public static class Solution1 {
        public static int maxProfit(int[] prices) {
            if (prices.length <= 1) {
                return 0;
            }
            int max = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < prices[i - 1] || i == prices.length - 1) {
                    int temp = maxp(0, i, prices) + maxp(i, prices.length - 1, prices);
                    if (temp > max)
                        max = temp;
                }
            }
            return max;
        }

        public static int maxp(int i, int j, int[] p) {
            int min = p[i];
            int max = 0;
            for (int k = i + 1; k <= j; k++) {
                if (p[k] - min > max)
                    max = p[k] - min;
                if (p[k] < min) {
                    min = p[k];
                }
            }
            return max;
        }
    }
    //  Right answer
    public static class Solution2 {
        public static int maxProfit(int[] prices) {
            int firstBuy = Integer.MIN_VALUE;
            int secondBuy = Integer.MIN_VALUE;
            int firstSell = 0;
            int secondSell = 0;
            for (int price : prices) {
                if (firstBuy < -price)
                    firstBuy = -price;
                if (firstSell < firstBuy + price)
                    firstSell = firstBuy + price;
                if (secondBuy < firstSell - price)
                    secondBuy = firstSell - price;
                if (secondSell < secondBuy + price)
                    secondSell = secondBuy + price;
            }
            return secondSell;
        }


    }

}