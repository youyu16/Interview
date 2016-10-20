package LeetCode;

/**
 * Created by t-tiyou on 9/5/2016.
 */
public class LeetCode122 {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                max += prices[i] - prices[i - 1];
            }
        }
        return max;
    }
}
