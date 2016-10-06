package LeetCode;

/**
 * Created by t-tiyou on 10/6/2016.
 */
public class LeetCode172 {
    public class Solution {
        public int trailingZeroes(int n) {
            int sum = 0;
            while (n != 0) {
                sum += n / 5;
                n = n / 5;
            }
            return sum;
        }
    }
}
