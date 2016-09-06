package LeetCode;

/**
 * Created by t-tiyou on 9/2/2016.
 */
public class LeetCode121 {
    /**
     * 超时的算法，O(n*n)
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                    int temp = prices[j] - prices[i];
                    if (temp > max)
                        max = temp;
                }
            }
        }
        return max;
    }

    /**
     * 正确的算法，时间O(n)
     *
     * @param prices
     * @return
     */
    public int maxPro(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else if (price - min > max) {
                max = price - min;
            }
        }
        return max;
    }
}
